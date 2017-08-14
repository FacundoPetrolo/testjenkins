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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="system_GetPrimaryFlagWithDateTimeResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="flagSetAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
    "systemGetPrimaryFlagWithDateTimeResult",
    "flagSetAt"
})
@XmlRootElement(name = "system_GetPrimaryFlagWithDateTimeResponse")
public class SystemGetPrimaryFlagWithDateTimeResponse {

    @XmlElement(name = "system_GetPrimaryFlagWithDateTimeResult")
    protected boolean systemGetPrimaryFlagWithDateTimeResult;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flagSetAt;

    /**
     * Obtiene el valor de la propiedad systemGetPrimaryFlagWithDateTimeResult.
     * 
     */
    public boolean isSystemGetPrimaryFlagWithDateTimeResult() {
        return systemGetPrimaryFlagWithDateTimeResult;
    }

    /**
     * Define el valor de la propiedad systemGetPrimaryFlagWithDateTimeResult.
     * 
     */
    public void setSystemGetPrimaryFlagWithDateTimeResult(boolean value) {
        this.systemGetPrimaryFlagWithDateTimeResult = value;
    }

    /**
     * Obtiene el valor de la propiedad flagSetAt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlagSetAt() {
        return flagSetAt;
    }

    /**
     * Define el valor de la propiedad flagSetAt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlagSetAt(XMLGregorianCalendar value) {
        this.flagSetAt = value;
    }

}
