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
 * <p>Clase Java para TaskType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MotoLocator_Task"/&gt;
 *     &lt;enumeration value="BoundaryService_Task"/&gt;
 *     &lt;enumeration value="EventService_Task"/&gt;
 *     &lt;enumeration value="RedundantServer_Task"/&gt;
 *     &lt;enumeration value="SecurityManagement_Task"/&gt;
 *     &lt;enumeration value="GoogleEarth_Task"/&gt;
 *     &lt;enumeration value="MCN_Task"/&gt;
 *     &lt;enumeration value="MLP_Task"/&gt;
 *     &lt;enumeration value="API_Task"/&gt;
 *     &lt;enumeration value="MTS_Task"/&gt;
 *     &lt;enumeration value="MotoMappingIncidents_Task"/&gt;
 *     &lt;enumeration value="MotoMappingReplay_Task"/&gt;
 *     &lt;enumeration value="MotoMappingGeofence_Task"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaskType", namespace = "http://tempuri.org/")
@XmlEnum
public enum TaskType {

    @XmlEnumValue("MotoLocator_Task")
    MOTO_LOCATOR_TASK("MotoLocator_Task"),
    @XmlEnumValue("BoundaryService_Task")
    BOUNDARY_SERVICE_TASK("BoundaryService_Task"),
    @XmlEnumValue("EventService_Task")
    EVENT_SERVICE_TASK("EventService_Task"),
    @XmlEnumValue("RedundantServer_Task")
    REDUNDANT_SERVER_TASK("RedundantServer_Task"),
    @XmlEnumValue("SecurityManagement_Task")
    SECURITY_MANAGEMENT_TASK("SecurityManagement_Task"),
    @XmlEnumValue("GoogleEarth_Task")
    GOOGLE_EARTH_TASK("GoogleEarth_Task"),
    @XmlEnumValue("MCN_Task")
    MCN_TASK("MCN_Task"),
    @XmlEnumValue("MLP_Task")
    MLP_TASK("MLP_Task"),
    @XmlEnumValue("API_Task")
    API_TASK("API_Task"),
    @XmlEnumValue("MTS_Task")
    MTS_TASK("MTS_Task"),
    @XmlEnumValue("MotoMappingIncidents_Task")
    MOTO_MAPPING_INCIDENTS_TASK("MotoMappingIncidents_Task"),
    @XmlEnumValue("MotoMappingReplay_Task")
    MOTO_MAPPING_REPLAY_TASK("MotoMappingReplay_Task"),
    @XmlEnumValue("MotoMappingGeofence_Task")
    MOTO_MAPPING_GEOFENCE_TASK("MotoMappingGeofence_Task");
    private final String value;

    TaskType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskType fromValue(String v) {
        for (TaskType c: TaskType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
