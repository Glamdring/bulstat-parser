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
 * \u0414\u0435\u0439\u043d\u043e\u0441\u0442 \u043f\u043e \u041a\u0418\u0414 2008
 * 
 * <p>Java class for SubjectPropActivityKID2008 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectPropActivityKID2008">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bulstat.bg/Entry}Entry">
 *       &lt;sequence>
 *         &lt;element name="KID2008" type="{http://www.bulstat.bg/NomenclatureEntry}NomenclatureEntry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectPropActivityKID2008", namespace = "http://www.bulstat.bg/SubjectPropActivityKID2008", propOrder = {
    "kid2008"
})
public class SubjectPropActivityKID2008
    extends Entry
{

    @XmlElement(name = "KID2008")
    protected NomenclatureEntry kid2008;

    /**
     * Gets the value of the kid2008 property.
     * 
     * @return
     *     possible object is
     *     {@link NomenclatureEntry }
     *     
     */
    public NomenclatureEntry getKID2008() {
        return kid2008;
    }

    /**
     * Sets the value of the kid2008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomenclatureEntry }
     *     
     */
    public void setKID2008(NomenclatureEntry value) {
        this.kid2008 = value;
    }

}