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
 * <p>Clase Java para MlsResultCodes.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MlsResultCodes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="DeviceNotInMonitorMode"/&gt;
 *     &lt;enumeration value="DuplicateDeviceName"/&gt;
 *     &lt;enumeration value="DeviceNotValid"/&gt;
 *     &lt;enumeration value="CompletedWithErrors"/&gt;
 *     &lt;enumeration value="NotRegisteredDispatcher"/&gt;
 *     &lt;enumeration value="CommandNotSupported"/&gt;
 *     &lt;enumeration value="ParametersNotValid"/&gt;
 *     &lt;enumeration value="GroupIsNotValid"/&gt;
 *     &lt;enumeration value="DatabaseError"/&gt;
 *     &lt;enumeration value="BusinessLayerException"/&gt;
 *     &lt;enumeration value="MotoLocatorNotResponding"/&gt;
 *     &lt;enumeration value="NotPermission"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MlsResultCodes")
@XmlEnum
public enum MlsResultCodes {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("DeviceNotInMonitorMode")
    DEVICE_NOT_IN_MONITOR_MODE("DeviceNotInMonitorMode"),
    @XmlEnumValue("DuplicateDeviceName")
    DUPLICATE_DEVICE_NAME("DuplicateDeviceName"),
    @XmlEnumValue("DeviceNotValid")
    DEVICE_NOT_VALID("DeviceNotValid"),
    @XmlEnumValue("CompletedWithErrors")
    COMPLETED_WITH_ERRORS("CompletedWithErrors"),
    @XmlEnumValue("NotRegisteredDispatcher")
    NOT_REGISTERED_DISPATCHER("NotRegisteredDispatcher"),
    @XmlEnumValue("CommandNotSupported")
    COMMAND_NOT_SUPPORTED("CommandNotSupported"),
    @XmlEnumValue("ParametersNotValid")
    PARAMETERS_NOT_VALID("ParametersNotValid"),
    @XmlEnumValue("GroupIsNotValid")
    GROUP_IS_NOT_VALID("GroupIsNotValid"),
    @XmlEnumValue("DatabaseError")
    DATABASE_ERROR("DatabaseError"),
    @XmlEnumValue("BusinessLayerException")
    BUSINESS_LAYER_EXCEPTION("BusinessLayerException"),
    @XmlEnumValue("MotoLocatorNotResponding")
    MOTO_LOCATOR_NOT_RESPONDING("MotoLocatorNotResponding"),
    @XmlEnumValue("NotPermission")
    NOT_PERMISSION("NotPermission"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    MlsResultCodes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MlsResultCodes fromValue(String v) {
        for (MlsResultCodes c: MlsResultCodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
