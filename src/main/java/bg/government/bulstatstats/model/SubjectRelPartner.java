//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.02 at 11:48:25 AM EEST 
//


package bg.government.bulstatstats.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0421\u043e\u0431\u0441\u0442\u0432\u0435\u043d\u0438\u0446\u0438 / \u0441\u044a\u0434\u0440\u0443\u0436\u043d\u0438\u0446\u0438
 * 
 * <p>Java class for SubjectRelPartner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectRelPartner">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bulstat.bg/SubscriptionElement}SubscriptionElement">
 *       &lt;sequence>
 *         &lt;element name="RelatedSubject" type="{http://www.bulstat.bg/Subject}Subject" minOccurs="0"/>
 *         &lt;element name="Role" type="{http://www.bulstat.bg/NomenclatureEntry}NomenclatureEntry" minOccurs="0"/>
 *         &lt;element name="Percent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
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
@XmlType(name = "SubjectRelPartner", namespace = "http://www.bulstat.bg/SubjectRelPartner", propOrder = {
    "relatedSubject",
    "role",
    "percent",
    "amount"
})
public class SubjectRelPartner
    extends SubscriptionElement
{

    @XmlElement(name = "RelatedSubject")
    protected Subject relatedSubject;
    @XmlElement(name = "Role")
    protected NomenclatureEntry role;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;

    /**
     * Gets the value of the relatedSubject property.
     * 
     * @return
     *     possible object is
     *     {@link Subject }
     *     
     */
    public Subject getRelatedSubject() {
        return relatedSubject;
    }

    /**
     * Sets the value of the relatedSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subject }
     *     
     */
    public void setRelatedSubject(Subject value) {
        this.relatedSubject = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link NomenclatureEntry }
     *     
     */
    public NomenclatureEntry getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomenclatureEntry }
     *     
     */
    public void setRole(NomenclatureEntry value) {
        this.role = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

}
