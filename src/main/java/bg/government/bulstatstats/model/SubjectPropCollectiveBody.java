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
 * \u041a\u043e\u043b\u0435\u043a\u0442\u0438\u0432\u0435\u043d \u043e\u0440\u0433\u0430\u043d
 * 
 * <p>Java class for SubjectPropCollectiveBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectPropCollectiveBody">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bulstat.bg/Entry}Entry">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.bulstat.bg/NomenclatureEntry}NomenclatureEntry" minOccurs="0"/>
 *         &lt;element name="Members" type="{http://www.bulstat.bg/SubjectRelCollectiveBodyMember}SubjectRelCollectiveBodyMember" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectPropCollectiveBody", namespace = "http://www.bulstat.bg/SubjectPropCollectiveBody", propOrder = {
    "type",
    "members"
})
public class SubjectPropCollectiveBody
    extends Entry
{

    @XmlElement(name = "Type")
    protected NomenclatureEntry type;
    @XmlElement(name = "Members")
    protected List<SubjectRelCollectiveBodyMember> members;

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
     * Gets the value of the members property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the members property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectRelCollectiveBodyMember }
     * 
     * 
     */
    public List<SubjectRelCollectiveBodyMember> getMembers() {
        if (members == null) {
            members = new ArrayList<SubjectRelCollectiveBodyMember>();
        }
        return this.members;
    }

}
