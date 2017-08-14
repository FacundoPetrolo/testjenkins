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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CellDeviceAssociation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CellDeviceAssociation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkDeviceId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ZoneId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellDeviceAssociation", propOrder = {
    "networkDeviceId",
    "siteId",
    "zoneId"
})
public class CellDeviceAssociation {

    @XmlElement(name = "NetworkDeviceId")
    protected long networkDeviceId;
    @XmlElement(name = "SiteId")
    protected long siteId;
    @XmlElement(name = "ZoneId")
    protected long zoneId;

    /**
     * Obtiene el valor de la propiedad networkDeviceId.
     * 
     */
    public long getNetworkDeviceId() {
        return networkDeviceId;
    }

    /**
     * Define el valor de la propiedad networkDeviceId.
     * 
     */
    public void setNetworkDeviceId(long value) {
        this.networkDeviceId = value;
    }

    /**
     * Obtiene el valor de la propiedad siteId.
     * 
     */
    public long getSiteId() {
        return siteId;
    }

    /**
     * Define el valor de la propiedad siteId.
     * 
     */
    public void setSiteId(long value) {
        this.siteId = value;
    }

    /**
     * Obtiene el valor de la propiedad zoneId.
     * 
     */
    public long getZoneId() {
        return zoneId;
    }

    /**
     * Define el valor de la propiedad zoneId.
     * 
     */
    public void setZoneId(long value) {
        this.zoneId = value;
    }

}
