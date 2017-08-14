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
 * <p>Clase Java para DeviceHistoryRecord complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeviceHistoryRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GpsTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LatestTrigger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Altitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="AgeBit" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="TelemetryData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceHistoryRecord", propOrder = {
    "deviceId",
    "deviceName",
    "deviceIdentifier",
    "updateTime",
    "gpsTime",
    "latestTrigger",
    "latitude",
    "longitude",
    "altitude",
    "direction",
    "speed",
    "ageBit",
    "telemetryData",
    "cellName"
})
public class DeviceHistoryRecord {

    @XmlElement(name = "DeviceId")
    protected long deviceId;
    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "DeviceIdentifier")
    protected String deviceIdentifier;
    @XmlElement(name = "UpdateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "GpsTime")
    protected String gpsTime;
    @XmlElement(name = "LatestTrigger")
    protected String latestTrigger;
    @XmlElement(name = "Latitude")
    protected double latitude;
    @XmlElement(name = "Longitude")
    protected double longitude;
    @XmlElement(name = "Altitude")
    protected double altitude;
    @XmlElement(name = "Direction")
    protected double direction;
    @XmlElement(name = "Speed")
    protected double speed;
    @XmlElement(name = "AgeBit")
    protected short ageBit;
    @XmlElement(name = "TelemetryData")
    protected String telemetryData;
    @XmlElement(name = "CellName")
    protected String cellName;

    /**
     * Obtiene el valor de la propiedad deviceId.
     * 
     */
    public long getDeviceId() {
        return deviceId;
    }

    /**
     * Define el valor de la propiedad deviceId.
     * 
     */
    public void setDeviceId(long value) {
        this.deviceId = value;
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
     * Obtiene el valor de la propiedad deviceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceIdentifier() {
        return deviceIdentifier;
    }

    /**
     * Define el valor de la propiedad deviceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceIdentifier(String value) {
        this.deviceIdentifier = value;
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

    /**
     * Obtiene el valor de la propiedad latestTrigger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestTrigger() {
        return latestTrigger;
    }

    /**
     * Define el valor de la propiedad latestTrigger.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestTrigger(String value) {
        this.latestTrigger = value;
    }

    /**
     * Obtiene el valor de la propiedad latitude.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Define el valor de la propiedad latitude.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Obtiene el valor de la propiedad longitude.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Define el valor de la propiedad longitude.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Obtiene el valor de la propiedad altitude.
     * 
     */
    public double getAltitude() {
        return altitude;
    }

    /**
     * Define el valor de la propiedad altitude.
     * 
     */
    public void setAltitude(double value) {
        this.altitude = value;
    }

    /**
     * Obtiene el valor de la propiedad direction.
     * 
     */
    public double getDirection() {
        return direction;
    }

    /**
     * Define el valor de la propiedad direction.
     * 
     */
    public void setDirection(double value) {
        this.direction = value;
    }

    /**
     * Obtiene el valor de la propiedad speed.
     * 
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Define el valor de la propiedad speed.
     * 
     */
    public void setSpeed(double value) {
        this.speed = value;
    }

    /**
     * Obtiene el valor de la propiedad ageBit.
     * 
     */
    public short getAgeBit() {
        return ageBit;
    }

    /**
     * Define el valor de la propiedad ageBit.
     * 
     */
    public void setAgeBit(short value) {
        this.ageBit = value;
    }

    /**
     * Obtiene el valor de la propiedad telemetryData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelemetryData() {
        return telemetryData;
    }

    /**
     * Define el valor de la propiedad telemetryData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelemetryData(String value) {
        this.telemetryData = value;
    }

    /**
     * Obtiene el valor de la propiedad cellName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellName() {
        return cellName;
    }

    /**
     * Define el valor de la propiedad cellName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellName(String value) {
        this.cellName = value;
    }

}
