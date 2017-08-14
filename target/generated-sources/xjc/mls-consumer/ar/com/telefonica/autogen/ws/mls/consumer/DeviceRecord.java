//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.08.14 a las 03:41:17 PM ART 
//


package ar.com.telefonica.autogen.ws.mls.consumer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DeviceRecord complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeviceRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetworkDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Altitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Bearing" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="AgeBit" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="OperationalState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TriggerState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GpsState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PresenceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GpsTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorizontalAccuracy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AltitudeAccuracy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HorSpeedAccuracy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VerSpeedAccuracy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HeadingAccuracy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceRecord", propOrder = {
    "deviceName",
    "networkDeviceID",
    "deviceState",
    "updateTime",
    "latitude",
    "longitude",
    "altitude",
    "speed",
    "bearing",
    "ageBit",
    "operationalState",
    "triggerState",
    "gpsState",
    "cellName",
    "presenceState",
    "gpsTime",
    "horizontalAccuracy",
    "altitudeAccuracy",
    "horSpeedAccuracy",
    "verSpeedAccuracy",
    "headingAccuracy"
})
public class DeviceRecord {

    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "NetworkDeviceID")
    protected String networkDeviceID;
    @XmlElement(name = "DeviceState")
    protected String deviceState;
    @XmlElement(name = "UpdateTime")
    protected String updateTime;
    @XmlElement(name = "Latitude")
    protected double latitude;
    @XmlElement(name = "Longitude")
    protected double longitude;
    @XmlElement(name = "Altitude")
    protected double altitude;
    @XmlElement(name = "Speed")
    protected double speed;
    @XmlElement(name = "Bearing")
    protected double bearing;
    @XmlElement(name = "AgeBit")
    @XmlSchemaType(name = "unsignedByte")
    protected short ageBit;
    @XmlElement(name = "OperationalState")
    protected String operationalState;
    @XmlElement(name = "TriggerState")
    protected String triggerState;
    @XmlElement(name = "GpsState")
    protected String gpsState;
    @XmlElement(name = "CellName")
    protected String cellName;
    @XmlElement(name = "PresenceState")
    protected String presenceState;
    @XmlElement(name = "GpsTime")
    protected String gpsTime;
    @XmlElement(name = "HorizontalAccuracy")
    protected Double horizontalAccuracy;
    @XmlElement(name = "AltitudeAccuracy")
    protected Double altitudeAccuracy;
    @XmlElement(name = "HorSpeedAccuracy")
    protected Double horSpeedAccuracy;
    @XmlElement(name = "VerSpeedAccuracy")
    protected Double verSpeedAccuracy;
    @XmlElement(name = "HeadingAccuracy")
    protected Double headingAccuracy;

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
     * Obtiene el valor de la propiedad networkDeviceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkDeviceID() {
        return networkDeviceID;
    }

    /**
     * Define el valor de la propiedad networkDeviceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkDeviceID(String value) {
        this.networkDeviceID = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceState() {
        return deviceState;
    }

    /**
     * Define el valor de la propiedad deviceState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceState(String value) {
        this.deviceState = value;
    }

    /**
     * Obtiene el valor de la propiedad updateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Define el valor de la propiedad updateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(String value) {
        this.updateTime = value;
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
     * Obtiene el valor de la propiedad bearing.
     * 
     */
    public double getBearing() {
        return bearing;
    }

    /**
     * Define el valor de la propiedad bearing.
     * 
     */
    public void setBearing(double value) {
        this.bearing = value;
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
     * Obtiene el valor de la propiedad operationalState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalState() {
        return operationalState;
    }

    /**
     * Define el valor de la propiedad operationalState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationalState(String value) {
        this.operationalState = value;
    }

    /**
     * Obtiene el valor de la propiedad triggerState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerState() {
        return triggerState;
    }

    /**
     * Define el valor de la propiedad triggerState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerState(String value) {
        this.triggerState = value;
    }

    /**
     * Obtiene el valor de la propiedad gpsState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsState() {
        return gpsState;
    }

    /**
     * Define el valor de la propiedad gpsState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsState(String value) {
        this.gpsState = value;
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

    /**
     * Obtiene el valor de la propiedad presenceState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresenceState() {
        return presenceState;
    }

    /**
     * Define el valor de la propiedad presenceState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresenceState(String value) {
        this.presenceState = value;
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
     * Obtiene el valor de la propiedad horizontalAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHorizontalAccuracy() {
        return horizontalAccuracy;
    }

    /**
     * Define el valor de la propiedad horizontalAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHorizontalAccuracy(Double value) {
        this.horizontalAccuracy = value;
    }

    /**
     * Obtiene el valor de la propiedad altitudeAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltitudeAccuracy() {
        return altitudeAccuracy;
    }

    /**
     * Define el valor de la propiedad altitudeAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltitudeAccuracy(Double value) {
        this.altitudeAccuracy = value;
    }

    /**
     * Obtiene el valor de la propiedad horSpeedAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHorSpeedAccuracy() {
        return horSpeedAccuracy;
    }

    /**
     * Define el valor de la propiedad horSpeedAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHorSpeedAccuracy(Double value) {
        this.horSpeedAccuracy = value;
    }

    /**
     * Obtiene el valor de la propiedad verSpeedAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVerSpeedAccuracy() {
        return verSpeedAccuracy;
    }

    /**
     * Define el valor de la propiedad verSpeedAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVerSpeedAccuracy(Double value) {
        this.verSpeedAccuracy = value;
    }

    /**
     * Obtiene el valor de la propiedad headingAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeadingAccuracy() {
        return headingAccuracy;
    }

    /**
     * Define el valor de la propiedad headingAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeadingAccuracy(Double value) {
        this.headingAccuracy = value;
    }

}
