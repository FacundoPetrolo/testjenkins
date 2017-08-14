//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.08.14 a las 03:41:12 PM ART 
//


package ar.com.telefonica.autogen.ws.mls.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConfigItemTypes.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfigItemTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SecurityEnable_Bool"/&gt;
 *     &lt;enumeration value="ConsumerTokenAckTime_Int32"/&gt;
 *     &lt;enumeration value="PasswordExpireTime_Int32"/&gt;
 *     &lt;enumeration value="PasswordRegularExpression_Str"/&gt;
 *     &lt;enumeration value="ConsumerTokenCheckAttempts_Int32"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfigItemTypes", namespace = "http://tempuri.org/")
@XmlEnum
public enum ConfigItemTypes {

    @XmlEnumValue("SecurityEnable_Bool")
    SECURITY_ENABLE_BOOL("SecurityEnable_Bool"),
    @XmlEnumValue("ConsumerTokenAckTime_Int32")
    CONSUMER_TOKEN_ACK_TIME_INT_32("ConsumerTokenAckTime_Int32"),
    @XmlEnumValue("PasswordExpireTime_Int32")
    PASSWORD_EXPIRE_TIME_INT_32("PasswordExpireTime_Int32"),
    @XmlEnumValue("PasswordRegularExpression_Str")
    PASSWORD_REGULAR_EXPRESSION_STR("PasswordRegularExpression_Str"),
    @XmlEnumValue("ConsumerTokenCheckAttempts_Int32")
    CONSUMER_TOKEN_CHECK_ATTEMPTS_INT_32("ConsumerTokenCheckAttempts_Int32");
    private final String value;

    ConfigItemTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigItemTypes fromValue(String v) {
        for (ConfigItemTypes c: ConfigItemTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
