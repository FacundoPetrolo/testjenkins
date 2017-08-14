//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.08.14 a las 03:41:12 PM ART 
//


package ar.com.telefonica.autogen.ws.mls.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UpdateParameters complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UpdateParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="functionalGroup" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="minFrequencyUpdate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxFrequencyUpdate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="distanceUpdate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="triggers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="setTriggersOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="reqAltitude" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reqAccuracy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="maxInfoAgeContainer" type="{http://www.motorola.com/mls}MaxInfoAgeContainer" minOccurs="0"/&gt;
 *         &lt;element name="highCadence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lowCadence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="selectedCadence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="commandParameters" type="{http://www.motorola.com/mls}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateParameters", propOrder = {
    "functionalGroup",
    "minFrequencyUpdate",
    "maxFrequencyUpdate",
    "distanceUpdate",
    "triggers",
    "setTriggersOnly",
    "reqAltitude",
    "reqAccuracy",
    "maxInfoAgeContainer",
    "highCadence",
    "lowCadence",
    "selectedCadence",
    "commandParameters"
})
public class UpdateParameters {

    protected int functionalGroup;
    protected int minFrequencyUpdate;
    protected int maxFrequencyUpdate;
    protected int distanceUpdate;
    protected String triggers;
    protected boolean setTriggersOnly;
    protected Boolean reqAltitude;
    protected Boolean reqAccuracy;
    protected MaxInfoAgeContainer maxInfoAgeContainer;
    protected int highCadence;
    protected int lowCadence;
    protected int selectedCadence;
    protected ArrayOfString commandParameters;

    /**
     * Obtiene el valor de la propiedad functionalGroup.
     * 
     */
    public int getFunctionalGroup() {
        return functionalGroup;
    }

    /**
     * Define el valor de la propiedad functionalGroup.
     * 
     */
    public void setFunctionalGroup(int value) {
        this.functionalGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad minFrequencyUpdate.
     * 
     */
    public int getMinFrequencyUpdate() {
        return minFrequencyUpdate;
    }

    /**
     * Define el valor de la propiedad minFrequencyUpdate.
     * 
     */
    public void setMinFrequencyUpdate(int value) {
        this.minFrequencyUpdate = value;
    }

    /**
     * Obtiene el valor de la propiedad maxFrequencyUpdate.
     * 
     */
    public int getMaxFrequencyUpdate() {
        return maxFrequencyUpdate;
    }

    /**
     * Define el valor de la propiedad maxFrequencyUpdate.
     * 
     */
    public void setMaxFrequencyUpdate(int value) {
        this.maxFrequencyUpdate = value;
    }

    /**
     * Obtiene el valor de la propiedad distanceUpdate.
     * 
     */
    public int getDistanceUpdate() {
        return distanceUpdate;
    }

    /**
     * Define el valor de la propiedad distanceUpdate.
     * 
     */
    public void setDistanceUpdate(int value) {
        this.distanceUpdate = value;
    }

    /**
     * Obtiene el valor de la propiedad triggers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggers() {
        return triggers;
    }

    /**
     * Define el valor de la propiedad triggers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggers(String value) {
        this.triggers = value;
    }

    /**
     * Obtiene el valor de la propiedad setTriggersOnly.
     * 
     */
    public boolean isSetTriggersOnly() {
        return setTriggersOnly;
    }

    /**
     * Define el valor de la propiedad setTriggersOnly.
     * 
     */
    public void setSetTriggersOnly(boolean value) {
        this.setTriggersOnly = value;
    }

    /**
     * Obtiene el valor de la propiedad reqAltitude.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqAltitude() {
        return reqAltitude;
    }

    /**
     * Define el valor de la propiedad reqAltitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReqAltitude(Boolean value) {
        this.reqAltitude = value;
    }

    /**
     * Obtiene el valor de la propiedad reqAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqAccuracy() {
        return reqAccuracy;
    }

    /**
     * Define el valor de la propiedad reqAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReqAccuracy(Boolean value) {
        this.reqAccuracy = value;
    }

    /**
     * Obtiene el valor de la propiedad maxInfoAgeContainer.
     * 
     * @return
     *     possible object is
     *     {@link MaxInfoAgeContainer }
     *     
     */
    public MaxInfoAgeContainer getMaxInfoAgeContainer() {
        return maxInfoAgeContainer;
    }

    /**
     * Define el valor de la propiedad maxInfoAgeContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxInfoAgeContainer }
     *     
     */
    public void setMaxInfoAgeContainer(MaxInfoAgeContainer value) {
        this.maxInfoAgeContainer = value;
    }

    /**
     * Obtiene el valor de la propiedad highCadence.
     * 
     */
    public int getHighCadence() {
        return highCadence;
    }

    /**
     * Define el valor de la propiedad highCadence.
     * 
     */
    public void setHighCadence(int value) {
        this.highCadence = value;
    }

    /**
     * Obtiene el valor de la propiedad lowCadence.
     * 
     */
    public int getLowCadence() {
        return lowCadence;
    }

    /**
     * Define el valor de la propiedad lowCadence.
     * 
     */
    public void setLowCadence(int value) {
        this.lowCadence = value;
    }

    /**
     * Obtiene el valor de la propiedad selectedCadence.
     * 
     */
    public int getSelectedCadence() {
        return selectedCadence;
    }

    /**
     * Define el valor de la propiedad selectedCadence.
     * 
     */
    public void setSelectedCadence(int value) {
        this.selectedCadence = value;
    }

    /**
     * Obtiene el valor de la propiedad commandParameters.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCommandParameters() {
        return commandParameters;
    }

    /**
     * Define el valor de la propiedad commandParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCommandParameters(ArrayOfString value) {
        this.commandParameters = value;
    }

}
