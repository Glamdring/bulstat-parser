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
 * \u041f\u0440\u043e\u0444\u0435\u0441\u0438\u044f
 * 
 * <p>Java class for SubjectPropProfession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectPropProfession">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bulstat.bg/Entry}Entry">
 *       &lt;sequence>
 *         &lt;element name="Profession" type="{http://www.bulstat.bg/NomenclatureEntry}NomenclatureEntry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectPropProfession", namespace = "http://www.bulstat.bg/SubjectPropProfession", propOrder = {
    "profession"
})
public class SubjectPropProfession
    extends Entry
{

    @XmlElement(name = "Profession")
    protected NomenclatureEntry profession;

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link NomenclatureEntry }
     *     
     */
    public NomenclatureEntry getProfession() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomenclatureEntry }
     *     
     */
    public void setProfession(NomenclatureEntry value) {
        this.profession = value;
    }

}
