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
 * \u0421\u044a\u0431\u0438\u0442\u0438\u0435
 * 
 * <p>Java class for Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bulstat.bg/Entry}Entry">
 *       &lt;sequence>
 *         &lt;element name="Document" type="{http://www.bulstat.bg/Document}Document"/>
 *         &lt;element name="EventType" type="{http://www.bulstat.bg/NomenclatureEntry}NomenclatureEntry"/>
 *         &lt;element name="EventDate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;pattern value="\p{Nd}{4}-\p{Nd}{2}-\p{Nd}{2}"/>
 *               &lt;minInclusive value="0001-01-01"/>
 *               &lt;maxInclusive value="9999-12-31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LegalBase" type="{http://www.bulstat.bg/NomenclatureEntry}NomenclatureEntry" minOccurs="0"/>
 *         &lt;element name="EntryType" type="{http://www.bulstat.bg/NomenclatureEntry}NomenclatureEntry" minOccurs="0"/>
 *         &lt;element name="Case" type="{http://www.bulstat.bg/Case}Case" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", namespace = "http://www.bulstat.bg/Event", propOrder = {
    "document",
    "eventType",
    "eventDate",
    "legalBase",
    "entryType",
    "_case"
})
public class Event
    extends Entry
{

    @XmlElement(name = "Document", required = true)
    protected Document document;
    @XmlElement(name = "EventType", required = true)
    protected NomenclatureEntry eventType;
    @XmlElement(name = "EventDate")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "LegalBase")
    protected NomenclatureEntry legalBase;
    @XmlElement(name = "EntryType")
    protected NomenclatureEntry entryType;
    @XmlElement(name = "Case")
    protected Case _case;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocument(Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link NomenclatureEntry }
     *     
     */
    public NomenclatureEntry getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomenclatureEntry }
     *     
     */
    public void setEventType(NomenclatureEntry value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the legalBase property.
     * 
     * @return
     *     possible object is
     *     {@link NomenclatureEntry }
     *     
     */
    public NomenclatureEntry getLegalBase() {
        return legalBase;
    }

    /**
     * Sets the value of the legalBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomenclatureEntry }
     *     
     */
    public void setLegalBase(NomenclatureEntry value) {
        this.legalBase = value;
    }

    /**
     * Gets the value of the entryType property.
     * 
     * @return
     *     possible object is
     *     {@link NomenclatureEntry }
     *     
     */
    public NomenclatureEntry getEntryType() {
        return entryType;
    }

    /**
     * Sets the value of the entryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomenclatureEntry }
     *     
     */
    public void setEntryType(NomenclatureEntry value) {
        this.entryType = value;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case }
     *     
     */
    public Case getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case }
     *     
     */
    public void setCase(Case value) {
        this._case = value;
    }

}
