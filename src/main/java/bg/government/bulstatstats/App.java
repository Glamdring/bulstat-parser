package bg.government.bulstatstats;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import bg.government.bulstatstats.model.Address;
import bg.government.bulstatstats.model.StateOfPlay;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.CharStreams;

/**
 * Hello world!
 *
 */
public class App {
    // find the UICs of first-order entities
    public static void findFirstOrderEntitiesByName(String[] args) throws Exception {
        File dir = new File(args[0]);
        Set<String> higherOrderNames = new HashSet<>(CharStreams.readLines(new InputStreamReader(App.class.getResourceAsStream("/firstorder"), "UTF-8")));
        higherOrderNames = higherOrderNames.stream().map(n -> n.toLowerCase().trim()).collect(Collectors.toSet());
        
        Map<Entity, Entity> entities = Maps.newHashMap();
        extractEntities(dir, higherOrderNames, entities);
        
        for (Entry<Entity, Entity> entry : entities.entrySet()) {
            System.out.println(entry.getKey().getUIC());
        }
        
        System.out.println("---------");
        
        // print the first-order entities that are not listed in the Bulstat-register
        List<String> foundNames = entities.keySet().stream().map(e -> e.getName().toLowerCase().trim()).collect(Collectors.toList());
        higherOrderNames.removeAll(foundNames);
        System.out.println(higherOrderNames);
    }
    
    public static void main(String[] args) throws Exception {
        File dir = new File(args[0]);
        
        Set<String> higherOrderUics = new HashSet<>(CharStreams.readLines(new InputStreamReader(App.class.getResourceAsStream("/firstorder-uics"), "UTF-8")));
        Map<Entity, Entity> entities = Maps.newHashMap();
        
        // 2nd, 3rd and 4th order
        for (int i = 0; i < 3; i ++) {
            extractEntities(dir, higherOrderUics, entities);
        }
        
        for (Entry<Entity, Entity> entry : entities.entrySet()) {
            System.out.print(entry.getKey().getUIC() + "," + "\"" + entry.getKey().getName().replace("\"", "\"\"") + "\"");
            System.out.print(",\"" + Joiner.on(",").join(entry.getKey().getAddresses()).replace("\"", "\"\"") + "\"");
            if (entry.getValue() != null) {
                System.out.println("," + entry.getValue().getUIC() + "," + "\"" + entry.getValue().getName().replace("\"", "\"\"") + "\"");
            } else {
                System.out.println();
            }
        }
    }

    private static void extractEntities(File dir, Set<String> higherOrderEntities, Map<Entity, Entity> entities)
            throws FileNotFoundException, FactoryConfigurationError, XMLStreamException, JAXBException {
        for (File file : dir.listFiles()) {
            InputStream inputStream = new FileInputStream(file);
    
            // create xml event reader for input stream
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(inputStream);
    
            // initialize jaxb
            JAXBContext context = JAXBContext.newInstance(StateOfPlay.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
    
            XMLEvent e = null;
    
            final QName qName = new QName("http://www.bulstat.bg/ExportedData", "StateOfPlay");
            
            // loop though the xml stream
            while ((e = xmlEventReader.peek()) != null) {
    
                if (e.isStartElement() && ((StartElement) e).getName().equals(qName)) {
                    // unmarshall the document
                    StateOfPlay state = unmarshaller.unmarshal(xmlEventReader, StateOfPlay.class).getValue();
                    Entity thisEntity = new Entity(
                            state.getSubject().getUIC().getUIC(), 
                            state.getSubject().getLegalEntitySubject().getCyrillicFullName(),
                            state.getSubject().getAddresses());
                    
                    if (higherOrderEntities.contains(state.getSubject().getUIC().getUIC())
                            || higherOrderEntities.contains(state.getSubject().getLegalEntitySubject().getCyrillicFullName().toLowerCase().trim())) {
                        entities.put(thisEntity, null);
                    }
                    if (state.getBelonging() != null && state.getBelonging().getRelatedSubject() != null
                            && state.getBelonging().getRelatedSubject().getUIC() != null && state.getBelonging().getRelatedSubject().getLegalEntitySubject() != null) {
                        String parentUic = state.getBelonging().getRelatedSubject().getUIC().getUIC();
                        if (higherOrderEntities.contains(parentUic)) {
                            String parentName = state.getBelonging().getRelatedSubject().getLegalEntitySubject().getCyrillicFullName(); 
                            entities.put(thisEntity, new Entity(parentUic, parentName, Lists.newArrayList()));
                        }
                    }
                } else {
                    xmlEventReader.next();
                }
            }
        }
        // adding the same entity multiple times is not an issue, as this is a set
        higherOrderEntities.addAll(entities.keySet().stream().map(k -> k.UIC).collect(Collectors.toList()));
    }
    
    public static class Entity {
        private String UIC;
        private String name;
        private List<Address> addresses;
        
        public Entity(String uIC, String name, List<Address> addresses) {
            super();
            UIC = uIC;
            this.name = name;
            this.addresses = addresses;
        }
        public String getUIC() {
            return UIC;
        }
        public void setUIC(String uIC) {
            UIC = uIC;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public List<Address> getAddresses() {
            return addresses;
        }
        public void setAddresses(List<Address> addresses) {
            this.addresses = addresses;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((UIC == null) ? 0 : UIC.hashCode());
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Entity other = (Entity) obj;
            if (UIC == null) {
                if (other.UIC != null)
                    return false;
            } else if (!UIC.equals(other.UIC))
                return false;
            return true;
        }
        @Override
        public String toString() {
            return "Entity [UIC=" + UIC + ", name=" + name + "]";
        }
    }
}
