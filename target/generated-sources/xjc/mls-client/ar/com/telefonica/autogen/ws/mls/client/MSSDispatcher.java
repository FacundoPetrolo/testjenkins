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
 * <p>Clase Java para MSSDispatcher complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSSDispatcher"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SelectedRole" type="{http://tempuri.org/}MSSRole" minOccurs="0"/&gt;
 *         &lt;element name="Tasks" type="{http://tempuri.org/}ArrayOfMSSTask" minOccurs="0"/&gt;
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSSDispatcher", namespace = "http://tempuri.org/", propOrder = {
    "name",
    "description",
    "selectedRole",
    "tasks",
    "token",
    "groupId",
    "id"
})
public class MSSDispatcher {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "SelectedRole")
    protected MSSRole selectedRole;
    @XmlElement(name = "Tasks")
    protected ArrayOfMSSTask tasks;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "GroupId")
    protected int groupId;
    @XmlElement(name = "Id")
    protected int id;

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
     * Obtiene el valor de la propiedad selectedRole.
     * 
     * @return
     *     possible object is
     *     {@link MSSRole }
     *     
     */
    public MSSRole getSelectedRole() {
        return selectedRole;
    }

    /**
     * Define el valor de la propiedad selectedRole.
     * 
     * @param value
     *     allowed object is
     *     {@link MSSRole }
     *     
     */
    public void setSelectedRole(MSSRole value) {
        this.selectedRole = value;
    }

    /**
     * Obtiene el valor de la propiedad tasks.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMSSTask }
     *     
     */
    public ArrayOfMSSTask getTasks() {
        return tasks;
    }

    /**
     * Define el valor de la propiedad tasks.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMSSTask }
     *     
     */
    public void setTasks(ArrayOfMSSTask value) {
        this.tasks = value;
    }

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtiene el valor de la propiedad groupId.
     * 
     */
    public int getGroupId() {
        return groupId;
    }

    /**
     * Define el valor de la propiedad groupId.
     * 
     */
    public void setGroupId(int value) {
        this.groupId = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
