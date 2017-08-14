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
 * <p>Clase Java para Device complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Device"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetworkDeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Network" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdateParams" type="{http://www.motorola.com/mls}UpdateParameters" minOccurs="0"/&gt;
 *         &lt;element name="GpsProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GpsConfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FunctionalGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupNames" type="{http://www.motorola.com/mls}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="ResourceGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device", propOrder = {
    "deviceName",
    "networkDeviceIdentifier",
    "network",
    "updateParams",
    "gpsProtocol",
    "gpsConfiguration",
    "type",
    "functionalGroupName",
    "groupNames",
    "resourceGroup"
})
public class Device {

    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "NetworkDeviceIdentifier")
    protected String networkDeviceIdentifier;
    @XmlElement(name = "Network")
    protected String network;
    @XmlElement(name = "UpdateParams")
    protected UpdateParameters updateParams;
    @XmlElement(name = "GpsProtocol")
    protected String gpsProtocol;
    @XmlElement(name = "GpsConfiguration")
    protected String gpsConfiguration;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "FunctionalGroupName")
    protected String functionalGroupName;
    @XmlElement(name = "GroupNames")
    protected ArrayOfString groupNames;
    @XmlElement(name = "ResourceGroup")
    protected String resourceGroup;

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
     * Obtiene el valor de la propiedad networkDeviceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkDeviceIdentifier() {
        return networkDeviceIdentifier;
    }

    /**
     * Define el valor de la propiedad networkDeviceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkDeviceIdentifier(String value) {
        this.networkDeviceIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad network.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetwork() {
        return network;
    }

    /**
     * Define el valor de la propiedad network.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetwork(String value) {
        this.network = value;
    }

    /**
     * Obtiene el valor de la propiedad updateParams.
     * 
     * @return
     *     possible object is
     *     {@link UpdateParameters }
     *     
     */
    public UpdateParameters getUpdateParams() {
        return updateParams;
    }

    /**
     * Define el valor de la propiedad updateParams.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateParameters }
     *     
     */
    public void setUpdateParams(UpdateParameters value) {
        this.updateParams = value;
    }

    /**
     * Obtiene el valor de la propiedad gpsProtocol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsProtocol() {
        return gpsProtocol;
    }

    /**
     * Define el valor de la propiedad gpsProtocol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsProtocol(String value) {
        this.gpsProtocol = value;
    }

    /**
     * Obtiene el valor de la propiedad gpsConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsConfiguration() {
        return gpsConfiguration;
    }

    /**
     * Define el valor de la propiedad gpsConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsConfiguration(String value) {
        this.gpsConfiguration = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad functionalGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionalGroupName() {
        return functionalGroupName;
    }

    /**
     * Define el valor de la propiedad functionalGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionalGroupName(String value) {
        this.functionalGroupName = value;
    }

    /**
     * Obtiene el valor de la propiedad groupNames.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGroupNames() {
        return groupNames;
    }

    /**
     * Define el valor de la propiedad groupNames.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGroupNames(ArrayOfString value) {
        this.groupNames = value;
    }

    /**
     * Obtiene el valor de la propiedad resourceGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceGroup() {
        return resourceGroup;
    }

    /**
     * Define el valor de la propiedad resourceGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceGroup(String value) {
        this.resourceGroup = value;
    }

}
