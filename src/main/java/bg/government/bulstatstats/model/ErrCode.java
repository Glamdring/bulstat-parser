//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.02 at 11:48:25 AM EEST 
//


package bg.government.bulstatstats.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="errCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXT_WS_ERROR"/>
 *     &lt;enumeration value="INVALID_INPUT"/>
 *     &lt;enumeration value="RESOURCE_NOT_FOUND"/>
 *     &lt;enumeration value="SYSTEM_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "errCode", namespace = "http://www.bulstat.bg/WSException")
@XmlEnum
public enum ErrCode {

    EXT_WS_ERROR,
    INVALID_INPUT,
    RESOURCE_NOT_FOUND,
    SYSTEM_ERROR;

    public String value() {
        return name();
    }

    public static ErrCode fromValue(String v) {
        return valueOf(v);
    }

}
