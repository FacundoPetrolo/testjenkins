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
 *         &lt;element name="names" type="{http://www.motorola.com/mls}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="minfrequency" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxfrequency" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "names",
    "distance",
    "minfrequency",
    "maxfrequency"
})
@XmlRootElement(name = "devman_ChangeReportingRate")
public class DevmanChangeReportingRate {

    protected ArrayOfString names;
    protected int distance;
    protected int minfrequency;
    protected int maxfrequency;

    /**
     * Obtiene el valor de la propiedad names.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getNames() {
        return names;
    }

    /**
     * Define el valor de la propiedad names.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setNames(ArrayOfString value) {
        this.names = value;
    }

    /**
     * Obtiene el valor de la propiedad distance.
     * 
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Define el valor de la propiedad distance.
     * 
     */
    public void setDistance(int value) {
        this.distance = value;
    }

    /**
     * Obtiene el valor de la propiedad minfrequency.
     * 
     */
    public int getMinfrequency() {
        return minfrequency;
    }

    /**
     * Define el valor de la propiedad minfrequency.
     * 
     */
    public void setMinfrequency(int value) {
        this.minfrequency = value;
    }

    /**
     * Obtiene el valor de la propiedad maxfrequency.
     * 
     */
    public int getMaxfrequency() {
        return maxfrequency;
    }

    /**
     * Define el valor de la propiedad maxfrequency.
     * 
     */
    public void setMaxfrequency(int value) {
        this.maxfrequency = value;
    }

}
