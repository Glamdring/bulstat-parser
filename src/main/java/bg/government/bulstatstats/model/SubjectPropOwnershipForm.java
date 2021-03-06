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
 * \u0424\u043e\u0440\u043c\u0430 \u043d\u0430 \u0441\u043e\u0431\u0441\u0442\u0432\u0435\u043d\u043e\u0441\u0442
 * 
 * <p>Java class for SubjectPropOwnershipForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectPropOwnershipForm">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bulstat.bg/Entry}Entry">
 *       &lt;sequence>
 *         &lt;element name="Form" type="{http://www.bulstat.bg/NomenclatureEntry}NomenclatureEntry" minOccurs="0"/>
 *         &lt;element name="Percent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="3"/>
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
@XmlType(name = "SubjectPropOwnershipForm", namespace = "http://www.bulstat.bg/SubjectPropOwnershipForm", propOrder = {
    "form",
    "percent"
})
public class SubjectPropOwnershipForm
    extends Entry
{

    @XmlElement(name = "Form")
    protected NomenclatureEntry form;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link NomenclatureEntry }
     *     
     */
    public NomenclatureEntry getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomenclatureEntry }
     *     
     */
    public void setForm(NomenclatureEntry value) {
        this.form = value;
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

}
