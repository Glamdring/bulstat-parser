//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.02 at 11:48:25 AM EEST 
//


package bg.government.bulstatstats.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * \u0414\u0430\u0442\u0430 \u043d\u0430 \u0437\u0430\u043f\u043e\u0447\u0432\u0430\u043d\u0435/ \u0441\u043f\u0438\u0440\u0430\u043d\u0435/ \u0432\u044a\u0437\u043e\u0431\u043d\u043e\u0432\u044f\u0432\u0430\u043d\u0435 \u043d\u0430
 * 				\u0434\u0435\u0439\u043d\u043e\u0441\u0442\u0442\u0430
 * 			
 * 
 * <p>Java class for SubjectPropActivityDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectPropActivityDate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bulstat.bg/Entry}Entry">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.bulstat.bg/NomenclatureEntry}NomenclatureEntry" minOccurs="0"/>
 *         &lt;element name="Date" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;pattern value="\p{Nd}{4}-\p{Nd}{2}-\p{Nd}{2}"/>
 *               &lt;minInclusive value="0001-01-01"/>
 *               &lt;maxInclusive value="9999-12-31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectPropActivityDate", namespace = "http://www.bulstat.bg/SubjectPropActivityDate", propOrder = {
    "type",
    "date"
})
public class SubjectPropActivityDate
    extends Entry
{

    @XmlElement(name = "Type")
    protected NomenclatureEntry type;
    @XmlElement(name = "Date")
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link NomenclatureEntry }
     *     
     */
    public NomenclatureEntry getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomenclatureEntry }
     *     
     */
    public void setType(NomenclatureEntry value) {
        this.type = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
