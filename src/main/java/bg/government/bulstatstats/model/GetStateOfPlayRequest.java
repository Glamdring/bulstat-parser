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
 * \u0417\u0430\u044f\u0432\u043a\u0430 \u0437\u0430 \u0438\u0437\u0432\u043b\u0438\u0447\u0430\u043d\u0435 \u043d\u0430 \u0430\u043a\u0442\u0443\u0430\u043b\u043d\u043e \u0441\u044a\u0441\u0442\u043e\u044f\u043d\u0438\u0435
 * 			
 * 
 * <p>Java class for GetStateOfPlayRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStateOfPlayRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UIC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="13"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Case" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Court" type="{http://www.bulstat.bg/NomenclatureEntry}NomenclatureEntry"/>
 *                   &lt;element name="Year">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="9999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Number">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStateOfPlayRequest", namespace = "http://www.bulstat.bg/GetStateOfPlayRequest", propOrder = {
    "uic",
    "_case"
})
public class GetStateOfPlayRequest {

    @XmlElement(name = "UIC")
    protected String uic;
    @XmlElement(name = "Case")
    protected GetStateOfPlayRequest.Case _case;

    /**
     * Gets the value of the uic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIC() {
        return uic;
    }

    /**
     * Sets the value of the uic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIC(String value) {
        this.uic = value;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link GetStateOfPlayRequest.Case }
     *     
     */
    public GetStateOfPlayRequest.Case getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStateOfPlayRequest.Case }
     *     
     */
    public void setCase(GetStateOfPlayRequest.Case value) {
        this._case = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Court" type="{http://www.bulstat.bg/NomenclatureEntry}NomenclatureEntry"/>
     *         &lt;element name="Year">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="9999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Number">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "court",
        "year",
        "number"
    })
    public static class Case {

        @XmlElement(name = "Court", namespace = "http://www.bulstat.bg/GetStateOfPlayRequest", required = true)
        protected NomenclatureEntry court;
        @XmlElement(name = "Year", namespace = "http://www.bulstat.bg/GetStateOfPlayRequest")
        protected int year;
        @XmlElement(name = "Number", namespace = "http://www.bulstat.bg/GetStateOfPlayRequest", required = true)
        protected String number;

        /**
         * Gets the value of the court property.
         * 
         * @return
         *     possible object is
         *     {@link NomenclatureEntry }
         *     
         */
        public NomenclatureEntry getCourt() {
            return court;
        }

        /**
         * Sets the value of the court property.
         * 
         * @param value
         *     allowed object is
         *     {@link NomenclatureEntry }
         *     
         */
        public void setCourt(NomenclatureEntry value) {
            this.court = value;
        }

        /**
         * Gets the value of the year property.
         * 
         */
        public int getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         * 
         */
        public void setYear(int value) {
            this.year = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

    }

}
