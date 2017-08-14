//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.08.14 a las 03:41:12 PM ART 
//


package ar.com.telefonica.autogen.ws.mls.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DeviceRecordGE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeviceRecordGE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviceState" type="{http://www.motorola.com/mls}DeviceStateRecord" minOccurs="0"/&gt;
 *         &lt;element name="LatestTrigger" type="{http://www.motorola.com/mls}TriggerRecord" minOccurs="0"/&gt;
 *         &lt;element name="GpsState" type="{http://www.motorola.com/mls}GpsStateRecord" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.motorola.com/mls}LocationRecord" minOccurs="0"/&gt;
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GpsTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceRecordGE", propOrder = {
    "deviceID",
    "deviceName",
    "deviceState",
    "latestTrigger",
    "gpsState",
    "location",
    "updateTime",
    "gpsTime"
})
public class DeviceRecordGE {

    @XmlElement(name = "DeviceID")
    protected int deviceID;
    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "DeviceState")
    protected DeviceStateRecord deviceState;
    @XmlElement(name = "LatestTrigger")
    protected TriggerRecord latestTrigger;
    @XmlElement(name = "GpsState")
    protected GpsStateRecord gpsState;
    @XmlElement(name = "Location")
    protected LocationRecord location;
    @XmlElement(name = "UpdateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "GpsTime")
    protected String gpsTime;

    /**
     * Obtiene el valor de la propiedad deviceID.
     * 
     */
    public int getDeviceID() {
        return deviceID;
    }

    /**
     * Define el valor de la propiedad deviceID.
     * 
     */
    public void setDeviceID(int value) {
        this.deviceID = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Define el valor de la propiedad deviceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceState.
     * 
     * @return
     *     possible object is
     *     {@link DeviceStateRecord }
     *     
     */
    public DeviceStateRecord getDeviceState() {
        return deviceState;
    }

    /**
     * Define el valor de la propiedad deviceState.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStateRecord }
     *     
     */
    public void setDeviceState(DeviceStateRecord value) {
        this.deviceState = value;
    }

    /**
     * Obtiene el valor de la propiedad latestTrigger.
     * 
     * @return
     *     possible object is
     *     {@link TriggerRecord }
     *     
     */
    public TriggerRecord getLatestTrigger() {
        return latestTrigger;
    }

    /**
     * Define el valor de la propiedad latestTrigger.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerRecord }
     *     
     */
    public void setLatestTrigger(TriggerRecord value) {
        this.latestTrigger = value;
    }

    /**
     * Obtiene el valor de la propiedad gpsState.
     * 
     * @return
     *     possible object is
     *     {@link GpsStateRecord }
     *     
     */
    public GpsStateRecord getGpsState() {
        return gpsState;
    }

    /**
     * Define el valor de la propiedad gpsState.
     * 
     * @param value
     *     allowed object is
     *     {@link GpsStateRecord }
     *     
     */
    public void setGpsState(GpsStateRecord value) {
        this.gpsState = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link LocationRecord }
     *     
     */
    public LocationRecord getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationRecord }
     *     
     */
    public void setLocation(LocationRecord value) {
        this.location = value;
    }

    /**
     * Obtiene el valor de la propiedad updateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Define el valor de la propiedad updateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad gpsTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsTime() {
        return gpsTime;
    }

    /**
     * Define el valor de la propiedad gpsTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsTime(String value) {
        this.gpsTime = value;
    }

}
