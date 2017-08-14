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
 * <p>Clase Java para Group complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Group"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsResource" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AssignedFunctionalGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {
    "name",
    "description",
    "parentGroup",
    "isResource",
    "assignedFunctionalGroup"
})
public class Group {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ParentGroup")
    protected String parentGroup;
    @XmlElement(name = "IsResource")
    protected boolean isResource;
    @XmlElement(name = "AssignedFunctionalGroup")
    protected String assignedFunctionalGroup;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad parentGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentGroup() {
        return parentGroup;
    }

    /**
     * Define el valor de la propiedad parentGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentGroup(String value) {
        this.parentGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad isResource.
     * 
     */
    public boolean isIsResource() {
        return isResource;
    }

    /**
     * Define el valor de la propiedad isResource.
     * 
     */
    public void setIsResource(boolean value) {
        this.isResource = value;
    }

    /**
     * Obtiene el valor de la propiedad assignedFunctionalGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedFunctionalGroup() {
        return assignedFunctionalGroup;
    }

    /**
     * Define el valor de la propiedad assignedFunctionalGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedFunctionalGroup(String value) {
        this.assignedFunctionalGroup = value;
    }

}
