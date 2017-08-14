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
 * <p>Clase Java para MlsResultMessage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MlsResultMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultCode" type="{http://www.motorola.com/mls}MlsResultCodes"/&gt;
 *         &lt;element name="LocalisedMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExceptionMesssage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MlsResultMessage", propOrder = {
    "resultCode",
    "localisedMessage",
    "exceptionMesssage"
})
public class MlsResultMessage {

    @XmlElement(name = "ResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected MlsResultCodes resultCode;
    @XmlElement(name = "LocalisedMessage")
    protected String localisedMessage;
    @XmlElement(name = "ExceptionMesssage")
    protected String exceptionMesssage;

    /**
     * Obtiene el valor de la propiedad resultCode.
     * 
     * @return
     *     possible object is
     *     {@link MlsResultCodes }
     *     
     */
    public MlsResultCodes getResultCode() {
        return resultCode;
    }

    /**
     * Define el valor de la propiedad resultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MlsResultCodes }
     *     
     */
    public void setResultCode(MlsResultCodes value) {
        this.resultCode = value;
    }

    /**
     * Obtiene el valor de la propiedad localisedMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalisedMessage() {
        return localisedMessage;
    }

    /**
     * Define el valor de la propiedad localisedMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalisedMessage(String value) {
        this.localisedMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad exceptionMesssage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionMesssage() {
        return exceptionMesssage;
    }

    /**
     * Define el valor de la propiedad exceptionMesssage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMesssage(String value) {
        this.exceptionMesssage = value;
    }

}
