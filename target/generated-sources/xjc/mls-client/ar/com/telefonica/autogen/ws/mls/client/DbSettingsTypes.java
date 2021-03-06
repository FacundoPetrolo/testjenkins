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
 * <p>Clase Java para DbSettingsTypes.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DbSettingsTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DbEngineType"/&gt;
 *     &lt;enumeration value="DbConnectionString"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DbSettingsTypes")
@XmlEnum
public enum DbSettingsTypes {

    @XmlEnumValue("DbEngineType")
    DB_ENGINE_TYPE("DbEngineType"),
    @XmlEnumValue("DbConnectionString")
    DB_CONNECTION_STRING("DbConnectionString");
    private final String value;

    DbSettingsTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DbSettingsTypes fromValue(String v) {
        for (DbSettingsTypes c: DbSettingsTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
