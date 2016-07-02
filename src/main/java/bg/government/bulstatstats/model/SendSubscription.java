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


/**
 * <p>Java class for SendSubscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendSubscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.bulstat.bg/SendSubscriptionRequest}SendSubscriptionRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendSubscription", namespace = "http://www.bulstat.bg/SubscriptionService", propOrder = {
    "uid",
    "sendSubscriptionRequest"
})
public class SendSubscription {

    @XmlElement(name = "UID", namespace = "", required = true)
    protected String uid;
    @XmlElement(name = "SendSubscriptionRequest", namespace = "http://www.bulstat.bg/SendSubscriptionRequest", required = true)
    protected SendSubscriptionRequest sendSubscriptionRequest;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * \u0417\u0430\u044f\u0432\u043a\u0430
     * 					
     * 
     * @return
     *     possible object is
     *     {@link SendSubscriptionRequest }
     *     
     */
    public SendSubscriptionRequest getSendSubscriptionRequest() {
        return sendSubscriptionRequest;
    }

    /**
     * Sets the value of the sendSubscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendSubscriptionRequest }
     *     
     */
    public void setSendSubscriptionRequest(SendSubscriptionRequest value) {
        this.sendSubscriptionRequest = value;
    }

}