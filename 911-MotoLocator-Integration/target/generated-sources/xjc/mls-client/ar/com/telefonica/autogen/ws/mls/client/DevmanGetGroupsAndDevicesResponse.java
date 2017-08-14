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
 *         &lt;element name="devman_GetGroupsAndDevicesResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GroupsWithDevices" type="{http://www.motorola.com/mls}ArrayOfDeviceGroup" minOccurs="0"/&gt;
 *         &lt;element name="ResultMsg" type="{http://www.motorola.com/mls}MlsResultMessage" minOccurs="0"/&gt;
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
    "devmanGetGroupsAndDevicesResult",
    "groupsWithDevices",
    "resultMsg"
})
@XmlRootElement(name = "devman_GetGroupsAndDevicesResponse")
public class DevmanGetGroupsAndDevicesResponse {

    @XmlElement(name = "devman_GetGroupsAndDevicesResult")
    protected boolean devmanGetGroupsAndDevicesResult;
    @XmlElement(name = "GroupsWithDevices")
    protected ArrayOfDeviceGroup groupsWithDevices;
    @XmlElement(name = "ResultMsg")
    protected MlsResultMessage resultMsg;

    /**
     * Obtiene el valor de la propiedad devmanGetGroupsAndDevicesResult.
     * 
     */
    public boolean isDevmanGetGroupsAndDevicesResult() {
        return devmanGetGroupsAndDevicesResult;
    }

    /**
     * Define el valor de la propiedad devmanGetGroupsAndDevicesResult.
     * 
     */
    public void setDevmanGetGroupsAndDevicesResult(boolean value) {
        this.devmanGetGroupsAndDevicesResult = value;
    }

    /**
     * Obtiene el valor de la propiedad groupsWithDevices.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeviceGroup }
     *     
     */
    public ArrayOfDeviceGroup getGroupsWithDevices() {
        return groupsWithDevices;
    }

    /**
     * Define el valor de la propiedad groupsWithDevices.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeviceGroup }
     *     
     */
    public void setGroupsWithDevices(ArrayOfDeviceGroup value) {
        this.groupsWithDevices = value;
    }

    /**
     * Obtiene el valor de la propiedad resultMsg.
     * 
     * @return
     *     possible object is
     *     {@link MlsResultMessage }
     *     
     */
    public MlsResultMessage getResultMsg() {
        return resultMsg;
    }

    /**
     * Define el valor de la propiedad resultMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link MlsResultMessage }
     *     
     */
    public void setResultMsg(MlsResultMessage value) {
        this.resultMsg = value;
    }

}
