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
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MinReportingPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ConsumerType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dispatcher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AutoSubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="groups" type="{http://www.motorola.com/mls}ArrayOfString" minOccurs="0"/&gt;
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
    "url",
    "minReportingPeriod",
    "consumerType",
    "dispatcher",
    "autoSubscribe",
    "groups"
})
@XmlRootElement(name = "locfeed_RegisterConsumer")
public class LocfeedRegisterConsumer {

    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "MinReportingPeriod")
    protected int minReportingPeriod;
    @XmlElement(name = "ConsumerType")
    protected int consumerType;
    protected String dispatcher;
    @XmlElement(name = "AutoSubscribe")
    protected boolean autoSubscribe;
    protected ArrayOfString groups;

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Obtiene el valor de la propiedad minReportingPeriod.
     * 
     */
    public int getMinReportingPeriod() {
        return minReportingPeriod;
    }

    /**
     * Define el valor de la propiedad minReportingPeriod.
     * 
     */
    public void setMinReportingPeriod(int value) {
        this.minReportingPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad consumerType.
     * 
     */
    public int getConsumerType() {
        return consumerType;
    }

    /**
     * Define el valor de la propiedad consumerType.
     * 
     */
    public void setConsumerType(int value) {
        this.consumerType = value;
    }

    /**
     * Obtiene el valor de la propiedad dispatcher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatcher() {
        return dispatcher;
    }

    /**
     * Define el valor de la propiedad dispatcher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatcher(String value) {
        this.dispatcher = value;
    }

    /**
     * Obtiene el valor de la propiedad autoSubscribe.
     * 
     */
    public boolean isAutoSubscribe() {
        return autoSubscribe;
    }

    /**
     * Define el valor de la propiedad autoSubscribe.
     * 
     */
    public void setAutoSubscribe(boolean value) {
        this.autoSubscribe = value;
    }

    /**
     * Obtiene el valor de la propiedad groups.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGroups() {
        return groups;
    }

    /**
     * Define el valor de la propiedad groups.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGroups(ArrayOfString value) {
        this.groups = value;
    }

}
