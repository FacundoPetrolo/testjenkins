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
 *         &lt;element name="MSSLoginTokenResult" type="{http://tempuri.org/}LoginStatus"/&gt;
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
    "mssLoginTokenResult"
})
@XmlRootElement(name = "MSSLoginTokenResponse")
public class MSSLoginTokenResponse {

    @XmlElement(name = "MSSLoginTokenResult", required = true)
    @XmlSchemaType(name = "string")
    protected LoginStatus mssLoginTokenResult;

    /**
     * Obtiene el valor de la propiedad mssLoginTokenResult.
     * 
     * @return
     *     possible object is
     *     {@link LoginStatus }
     *     
     */
    public LoginStatus getMSSLoginTokenResult() {
        return mssLoginTokenResult;
    }

    /**
     * Define el valor de la propiedad mssLoginTokenResult.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginStatus }
     *     
     */
    public void setMSSLoginTokenResult(LoginStatus value) {
        this.mssLoginTokenResult = value;
    }

}
