//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.02 at 11:48:25 AM EEST 
//


package bg.government.bulstatstats.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0420\u0435\u0437\u0443\u043b\u0442\u0430\u0442 \u043e\u0442 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u044f\u0442\u0430
 * 			
 * 
 * <p>Java class for FetchNomenclaturesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FetchNomenclaturesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryNomElement" type="{http://www.bulstat.bg/FetchNomenclaturesResponse}CountryMultilangNomElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SimpleNomenclature" type="{http://www.bulstat.bg/FetchNomenclaturesResponse}SimpleNomenclature" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FetchNomenclaturesResponse", propOrder = {
    "countryNomElement",
    "simpleNomenclature"
})
public class FetchNomenclaturesResponse {

    @XmlElement(name = "CountryNomElement")
    protected List<CountryMultilangNomElement> countryNomElement;
    @XmlElement(name = "SimpleNomenclature", required = true)
    protected List<SimpleNomenclature> simpleNomenclature;

    /**
     * Gets the value of the countryNomElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryNomElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryNomElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryMultilangNomElement }
     * 
     * 
     */
    public List<CountryMultilangNomElement> getCountryNomElement() {
        if (countryNomElement == null) {
            countryNomElement = new ArrayList<CountryMultilangNomElement>();
        }
        return this.countryNomElement;
    }

    /**
     * Gets the value of the simpleNomenclature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleNomenclature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleNomenclature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleNomenclature }
     * 
     * 
     */
    public List<SimpleNomenclature> getSimpleNomenclature() {
        if (simpleNomenclature == null) {
            simpleNomenclature = new ArrayList<SimpleNomenclature>();
        }
        return this.simpleNomenclature;
    }

}