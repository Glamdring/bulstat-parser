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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * \u0412\u0445\u043e\u0434\u043d\u0438 \u0434\u0430\u043d\u043d\u0438 \u0437\u0430 \u043f\u043e\u043b\u0443\u0447\u0430\u0432\u0430\u043d\u0435 \u043d\u0430 \u0430\u0431\u043e\u043d\u0430\u043c\u0435\u043d\u0442
 * 			
 * 
 * <p>Java class for SendSubscriptionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendSubscriptionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Operation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="REGISTER_EVENT"/>
 *               &lt;enumeration value="CORRECT_EVENT"/>
 *               &lt;enumeration value="DELETE_EVENT"/>
 *               &lt;enumeration value="DELETE_SUBJECT"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubjectUICs" type="{http://www.bulstat.bg/SendSubscriptionRequest}SubjectUIC" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Event" type="{http://www.bulstat.bg/Event}Event"/>
 *         &lt;element name="StateOfPlay" type="{http://www.bulstat.bg/StateOfPlay}StateOfPlay"/>
 *         &lt;element name="Attachments" type="{http://www.bulstat.bg/Attachment}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendSubscriptionRequest", namespace = "http://www.bulstat.bg/SendSubscriptionRequest", propOrder = {
    "messageTime",
    "operation",
    "subjectUICs",
    "event",
    "stateOfPlay",
    "attachments"
})
public class SendSubscriptionRequest {

    @XmlElement(name = "MessageTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageTime;
    @XmlElement(name = "Operation", required = true)
    protected String operation;
    @XmlElement(name = "SubjectUICs")
    protected List<SubjectUIC> subjectUICs;
    @XmlElement(name = "Event", required = true)
    protected Event event;
    @XmlElement(name = "StateOfPlay", required = true)
    protected StateOfPlay stateOfPlay;
    @XmlElement(name = "Attachments")
    protected List<Attachment> attachments;

    /**
     * Gets the value of the messageTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageTime() {
        return messageTime;
    }

    /**
     * Sets the value of the messageTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageTime(XMLGregorianCalendar value) {
        this.messageTime = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the subjectUICs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectUICs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectUICs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectUIC }
     * 
     * 
     */
    public List<SubjectUIC> getSubjectUICs() {
        if (subjectUICs == null) {
            subjectUICs = new ArrayList<SubjectUIC>();
        }
        return this.subjectUICs;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setEvent(Event value) {
        this.event = value;
    }

    /**
     * Gets the value of the stateOfPlay property.
     * 
     * @return
     *     possible object is
     *     {@link StateOfPlay }
     *     
     */
    public StateOfPlay getStateOfPlay() {
        return stateOfPlay;
    }

    /**
     * Sets the value of the stateOfPlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateOfPlay }
     *     
     */
    public void setStateOfPlay(StateOfPlay value) {
        this.stateOfPlay = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<Attachment>();
        }
        return this.attachments;
    }

}
