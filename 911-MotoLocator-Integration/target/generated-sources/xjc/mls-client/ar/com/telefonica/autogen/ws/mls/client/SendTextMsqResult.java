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
 * <p>Clase Java para SendTextMsqResult.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SendTextMsqResult"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MessageSend2MTS"/&gt;
 *     &lt;enumeration value="DeviceNotBelongs2ValidNetwork"/&gt;
 *     &lt;enumeration value="DeviceNotExists"/&gt;
 *     &lt;enumeration value="MTSIsNotInstalled"/&gt;
 *     &lt;enumeration value="Errors"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SendTextMsqResult")
@XmlEnum
public enum SendTextMsqResult {

    @XmlEnumValue("MessageSend2MTS")
    MESSAGE_SEND_2_MTS("MessageSend2MTS"),
    @XmlEnumValue("DeviceNotBelongs2ValidNetwork")
    DEVICE_NOT_BELONGS_2_VALID_NETWORK("DeviceNotBelongs2ValidNetwork"),
    @XmlEnumValue("DeviceNotExists")
    DEVICE_NOT_EXISTS("DeviceNotExists"),
    @XmlEnumValue("MTSIsNotInstalled")
    MTS_IS_NOT_INSTALLED("MTSIsNotInstalled"),
    @XmlEnumValue("Errors")
    ERRORS("Errors");
    private final String value;

    SendTextMsqResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SendTextMsqResult fromValue(String v) {
        for (SendTextMsqResult c: SendTextMsqResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
