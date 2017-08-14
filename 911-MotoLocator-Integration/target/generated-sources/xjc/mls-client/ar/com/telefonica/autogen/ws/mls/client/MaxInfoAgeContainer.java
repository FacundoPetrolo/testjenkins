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
 * <p>Clase Java para MaxInfoAgeContainer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MaxInfoAgeContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Maxinfoage_periodicRequested" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="Maxinfoage_periodicRequired" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="Maxinfoage_distanceRequested" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="Maxinfoage_distanceRequired" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="Maxinfoage_immediateRequested" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="Maxinfoage_immediateRequired" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="Maxinfoage_emergencyRequested" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="Maxinfoage_emergencyRequired" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="CurrentMaxInfoAgeRequested" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="CurrentMaxInfoAgeRequired" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaxInfoAgeContainer", propOrder = {
    "maxinfoagePeriodicRequested",
    "maxinfoagePeriodicRequired",
    "maxinfoageDistanceRequested",
    "maxinfoageDistanceRequired",
    "maxinfoageImmediateRequested",
    "maxinfoageImmediateRequired",
    "maxinfoageEmergencyRequested",
    "maxinfoageEmergencyRequired",
    "currentMaxInfoAgeRequested",
    "currentMaxInfoAgeRequired"
})
public class MaxInfoAgeContainer {

    @XmlElement(name = "Maxinfoage_periodicRequested")
    @XmlSchemaType(name = "unsignedInt")
    protected long maxinfoagePeriodicRequested;
    @XmlElement(name = "Maxinfoage_periodicRequired")
    @XmlSchemaType(name = "unsignedInt")
    protected long maxinfoagePeriodicRequired;
    @XmlElement(name = "Maxinfoage_distanceRequested")
    @XmlSchemaType(name = "unsignedInt")
    protected long maxinfoageDistanceRequested;
    @XmlElement(name = "Maxinfoage_distanceRequired")
    @XmlSchemaType(name = "unsignedInt")
    protected long maxinfoageDistanceRequired;
    @XmlElement(name = "Maxinfoage_immediateRequested")
    @XmlSchemaType(name = "unsignedInt")
    protected long maxinfoageImmediateRequested;
    @XmlElement(name = "Maxinfoage_immediateRequired")
    @XmlSchemaType(name = "unsignedInt")
    protected long maxinfoageImmediateRequired;
    @XmlElement(name = "Maxinfoage_emergencyRequested")
    @XmlSchemaType(name = "unsignedInt")
    protected long maxinfoageEmergencyRequested;
    @XmlElement(name = "Maxinfoage_emergencyRequired")
    @XmlSchemaType(name = "unsignedInt")
    protected long maxinfoageEmergencyRequired;
    @XmlElement(name = "CurrentMaxInfoAgeRequested")
    @XmlSchemaType(name = "unsignedInt")
    protected long currentMaxInfoAgeRequested;
    @XmlElement(name = "CurrentMaxInfoAgeRequired")
    @XmlSchemaType(name = "unsignedInt")
    protected long currentMaxInfoAgeRequired;

    /**
     * Obtiene el valor de la propiedad maxinfoagePeriodicRequested.
     * 
     */
    public long getMaxinfoagePeriodicRequested() {
        return maxinfoagePeriodicRequested;
    }

    /**
     * Define el valor de la propiedad maxinfoagePeriodicRequested.
     * 
     */
    public void setMaxinfoagePeriodicRequested(long value) {
        this.maxinfoagePeriodicRequested = value;
    }

    /**
     * Obtiene el valor de la propiedad maxinfoagePeriodicRequired.
     * 
     */
    public long getMaxinfoagePeriodicRequired() {
        return maxinfoagePeriodicRequired;
    }

    /**
     * Define el valor de la propiedad maxinfoagePeriodicRequired.
     * 
     */
    public void setMaxinfoagePeriodicRequired(long value) {
        this.maxinfoagePeriodicRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad maxinfoageDistanceRequested.
     * 
     */
    public long getMaxinfoageDistanceRequested() {
        return maxinfoageDistanceRequested;
    }

    /**
     * Define el valor de la propiedad maxinfoageDistanceRequested.
     * 
     */
    public void setMaxinfoageDistanceRequested(long value) {
        this.maxinfoageDistanceRequested = value;
    }

    /**
     * Obtiene el valor de la propiedad maxinfoageDistanceRequired.
     * 
     */
    public long getMaxinfoageDistanceRequired() {
        return maxinfoageDistanceRequired;
    }

    /**
     * Define el valor de la propiedad maxinfoageDistanceRequired.
     * 
     */
    public void setMaxinfoageDistanceRequired(long value) {
        this.maxinfoageDistanceRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad maxinfoageImmediateRequested.
     * 
     */
    public long getMaxinfoageImmediateRequested() {
        return maxinfoageImmediateRequested;
    }

    /**
     * Define el valor de la propiedad maxinfoageImmediateRequested.
     * 
     */
    public void setMaxinfoageImmediateRequested(long value) {
        this.maxinfoageImmediateRequested = value;
    }

    /**
     * Obtiene el valor de la propiedad maxinfoageImmediateRequired.
     * 
     */
    public long getMaxinfoageImmediateRequired() {
        return maxinfoageImmediateRequired;
    }

    /**
     * Define el valor de la propiedad maxinfoageImmediateRequired.
     * 
     */
    public void setMaxinfoageImmediateRequired(long value) {
        this.maxinfoageImmediateRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad maxinfoageEmergencyRequested.
     * 
     */
    public long getMaxinfoageEmergencyRequested() {
        return maxinfoageEmergencyRequested;
    }

    /**
     * Define el valor de la propiedad maxinfoageEmergencyRequested.
     * 
     */
    public void setMaxinfoageEmergencyRequested(long value) {
        this.maxinfoageEmergencyRequested = value;
    }

    /**
     * Obtiene el valor de la propiedad maxinfoageEmergencyRequired.
     * 
     */
    public long getMaxinfoageEmergencyRequired() {
        return maxinfoageEmergencyRequired;
    }

    /**
     * Define el valor de la propiedad maxinfoageEmergencyRequired.
     * 
     */
    public void setMaxinfoageEmergencyRequired(long value) {
        this.maxinfoageEmergencyRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad currentMaxInfoAgeRequested.
     * 
     */
    public long getCurrentMaxInfoAgeRequested() {
        return currentMaxInfoAgeRequested;
    }

    /**
     * Define el valor de la propiedad currentMaxInfoAgeRequested.
     * 
     */
    public void setCurrentMaxInfoAgeRequested(long value) {
        this.currentMaxInfoAgeRequested = value;
    }

    /**
     * Obtiene el valor de la propiedad currentMaxInfoAgeRequired.
     * 
     */
    public long getCurrentMaxInfoAgeRequired() {
        return currentMaxInfoAgeRequired;
    }

    /**
     * Define el valor de la propiedad currentMaxInfoAgeRequired.
     * 
     */
    public void setCurrentMaxInfoAgeRequired(long value) {
        this.currentMaxInfoAgeRequired = value;
    }

}
