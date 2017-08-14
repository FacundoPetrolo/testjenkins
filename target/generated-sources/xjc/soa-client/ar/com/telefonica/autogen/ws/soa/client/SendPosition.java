//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.08.14 a las 03:41:19 PM ART 
//


package ar.com.telefonica.autogen.ws.soa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="in0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="in1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="in2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="in3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="in4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="in5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="in6" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="in7" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="in8" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="in9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="in10" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0" form="qualified"/&gt;
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
    "in0",
    "in1",
    "in2",
    "in3",
    "in4",
    "in5",
    "in6",
    "in7",
    "in8",
    "in9",
    "in10"
})
@XmlRootElement(name = "sendPosition")
public class SendPosition {

    protected String in0;
    protected Integer in1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar in2;
    protected String in3;
    protected String in4;
    protected Integer in5;
    protected Short in6;
    protected Short in7;
    protected Short in8;
    protected String in9;
    protected Short in10;

    /**
     * Obtiene el valor de la propiedad in0.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn0() {
        return in0;
    }

    /**
     * Define el valor de la propiedad in0.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn0(String value) {
        this.in0 = value;
    }

    /**
     * Obtiene el valor de la propiedad in1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIn1() {
        return in1;
    }

    /**
     * Define el valor de la propiedad in1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIn1(Integer value) {
        this.in1 = value;
    }

    /**
     * Obtiene el valor de la propiedad in2.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIn2() {
        return in2;
    }

    /**
     * Define el valor de la propiedad in2.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIn2(XMLGregorianCalendar value) {
        this.in2 = value;
    }

    /**
     * Obtiene el valor de la propiedad in3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn3() {
        return in3;
    }

    /**
     * Define el valor de la propiedad in3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn3(String value) {
        this.in3 = value;
    }

    /**
     * Obtiene el valor de la propiedad in4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4() {
        return in4;
    }

    /**
     * Define el valor de la propiedad in4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4(String value) {
        this.in4 = value;
    }

    /**
     * Obtiene el valor de la propiedad in5.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIn5() {
        return in5;
    }

    /**
     * Define el valor de la propiedad in5.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIn5(Integer value) {
        this.in5 = value;
    }

    /**
     * Obtiene el valor de la propiedad in6.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIn6() {
        return in6;
    }

    /**
     * Define el valor de la propiedad in6.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIn6(Short value) {
        this.in6 = value;
    }

    /**
     * Obtiene el valor de la propiedad in7.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIn7() {
        return in7;
    }

    /**
     * Define el valor de la propiedad in7.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIn7(Short value) {
        this.in7 = value;
    }

    /**
     * Obtiene el valor de la propiedad in8.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIn8() {
        return in8;
    }

    /**
     * Define el valor de la propiedad in8.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIn8(Short value) {
        this.in8 = value;
    }

    /**
     * Obtiene el valor de la propiedad in9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn9() {
        return in9;
    }

    /**
     * Define el valor de la propiedad in9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn9(String value) {
        this.in9 = value;
    }

    /**
     * Obtiene el valor de la propiedad in10.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIn10() {
        return in10;
    }

    /**
     * Define el valor de la propiedad in10.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIn10(Short value) {
        this.in10 = value;
    }

}
