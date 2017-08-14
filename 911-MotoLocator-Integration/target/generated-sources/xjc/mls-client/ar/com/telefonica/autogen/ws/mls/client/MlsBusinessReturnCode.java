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
 * <p>Clase Java para MlsBusinessReturnCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MlsBusinessReturnCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="Errors"/&gt;
 *     &lt;enumeration value="NoPermission"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MlsBusinessReturnCode")
@XmlEnum
public enum MlsBusinessReturnCode {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Errors")
    ERRORS("Errors"),
    @XmlEnumValue("NoPermission")
    NO_PERMISSION("NoPermission");
    private final String value;

    MlsBusinessReturnCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MlsBusinessReturnCode fromValue(String v) {
        for (MlsBusinessReturnCode c: MlsBusinessReturnCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
