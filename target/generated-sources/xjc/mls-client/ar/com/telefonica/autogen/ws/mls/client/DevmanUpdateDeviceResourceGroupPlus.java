//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.08.14 a las 03:41:12 PM ART 
//


package ar.com.telefonica.autogen.ws.mls.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="deviceNames" type="{http://www.motorola.com/mls}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="resourceGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "resourceGroupName"
})
@XmlRootElement(name = "devman_UpdateDeviceResourceGroupPlus")
public class DevmanUpdateDeviceResourceGroupPlus {

    protected ArrayOfString deviceNames;
    protected String resourceGroupName;

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
     * Obtiene el valor de la propiedad resourceGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceGroupName() {
        return resourceGroupName;
    }

    /**
     * Define el valor de la propiedad resourceGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceGroupName(String value) {
        this.resourceGroupName = value;
    }

}
