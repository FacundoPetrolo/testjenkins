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
 *         &lt;element name="MSSGetConfigItemResult" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    "mssGetConfigItemResult"
})
@XmlRootElement(name = "MSSGetConfigItemResponse")
public class MSSGetConfigItemResponse {

    @XmlElement(name = "MSSGetConfigItemResult")
    protected Object mssGetConfigItemResult;

    /**
     * Obtiene el valor de la propiedad mssGetConfigItemResult.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMSSGetConfigItemResult() {
        return mssGetConfigItemResult;
    }

    /**
     * Define el valor de la propiedad mssGetConfigItemResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMSSGetConfigItemResult(Object value) {
        this.mssGetConfigItemResult = value;
    }

}
