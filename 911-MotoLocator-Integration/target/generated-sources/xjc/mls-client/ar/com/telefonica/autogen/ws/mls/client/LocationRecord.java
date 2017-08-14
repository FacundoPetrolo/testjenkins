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


/**
 * <p>Clase Java para LocationRecord complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LocationRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Altitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="IsAltitude" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Bearing" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="AgeBit" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationRecord", propOrder = {
    "latitude",
    "longitude",
    "altitude",
    "isAltitude",
    "bearing",
    "speed",
    "ageBit"
})
public class LocationRecord {

    @XmlElement(name = "Latitude")
    protected double latitude;
    @XmlElement(name = "Longitude")
    protected double longitude;
    @XmlElement(name = "Altitude")
    protected double altitude;
    @XmlElement(name = "IsAltitude")
    protected boolean isAltitude;
    @XmlElement(name = "Bearing")
    protected double bearing;
    @XmlElement(name = "Speed")
    protected double speed;
    @XmlElement(name = "AgeBit")
    @XmlSchemaType(name = "unsignedByte")
    protected short ageBit;

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
     * Obtiene el valor de la propiedad isAltitude.
     * 
     */
    public boolean isIsAltitude() {
        return isAltitude;
    }

    /**
     * Define el valor de la propiedad isAltitude.
     * 
     */
    public void setIsAltitude(boolean value) {
        this.isAltitude = value;
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

}
