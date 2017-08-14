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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceNames" type="{http://www.motorola.com/mls}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="MonitorFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deviceNames",
    "monitorFlag"
})
@XmlRootElement(name = "devman_MonitorDevicePlus")
public class DevmanMonitorDevicePlus {

    @XmlElement(name = "DeviceNames")
    protected ArrayOfString deviceNames;
    @XmlElement(name = "MonitorFlag")
    protected boolean monitorFlag;

    /**
     * Obtiene el valor de la propiedad deviceNames.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDeviceNames() {
        return deviceNames;
    }

    /**
     * Define el valor de la propiedad deviceNames.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDeviceNames(ArrayOfString value) {
        this.deviceNames = value;
    }

    /**
     * Obtiene el valor de la propiedad monitorFlag.
     * 
     */
    public boolean isMonitorFlag() {
        return monitorFlag;
    }

    /**
     * Define el valor de la propiedad monitorFlag.
     * 
     */
    public void setMonitorFlag(boolean value) {
        this.monitorFlag = value;
    }

}
