//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.08.14 a las 03:41:12 PM ART 
//


package ar.com.telefonica.autogen.ws.mls.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LoginStatus.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="LoginStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Pass"/&gt;
 *     &lt;enumeration value="PassNotFull"/&gt;
 *     &lt;enumeration value="InvalidToken"/&gt;
 *     &lt;enumeration value="AccountLock"/&gt;
 *     &lt;enumeration value="MustChangePassword"/&gt;
 *     &lt;enumeration value="TokenTimeoutExpire"/&gt;
 *     &lt;enumeration value="NotAuthorized"/&gt;
 *     &lt;enumeration value="RoleNotSelected"/&gt;
 *     &lt;enumeration value="InvalidRole"/&gt;
 *     &lt;enumeration value="PasswordStrengthIncorrect"/&gt;
 *     &lt;enumeration value="NoPermission"/&gt;
 *     &lt;enumeration value="PassWithInvalidIP"/&gt;
 *     &lt;enumeration value="Errors"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoginStatus", namespace = "http://tempuri.org/")
@XmlEnum
public enum LoginStatus {

    @XmlEnumValue("Pass")
    PASS("Pass"),
    @XmlEnumValue("PassNotFull")
    PASS_NOT_FULL("PassNotFull"),
    @XmlEnumValue("InvalidToken")
    INVALID_TOKEN("InvalidToken"),
    @XmlEnumValue("AccountLock")
    ACCOUNT_LOCK("AccountLock"),
    @XmlEnumValue("MustChangePassword")
    MUST_CHANGE_PASSWORD("MustChangePassword"),
    @XmlEnumValue("TokenTimeoutExpire")
    TOKEN_TIMEOUT_EXPIRE("TokenTimeoutExpire"),
    @XmlEnumValue("NotAuthorized")
    NOT_AUTHORIZED("NotAuthorized"),
    @XmlEnumValue("RoleNotSelected")
    ROLE_NOT_SELECTED("RoleNotSelected"),
    @XmlEnumValue("InvalidRole")
    INVALID_ROLE("InvalidRole"),
    @XmlEnumValue("PasswordStrengthIncorrect")
    PASSWORD_STRENGTH_INCORRECT("PasswordStrengthIncorrect"),
    @XmlEnumValue("NoPermission")
    NO_PERMISSION("NoPermission"),
    @XmlEnumValue("PassWithInvalidIP")
    PASS_WITH_INVALID_IP("PassWithInvalidIP"),
    @XmlEnumValue("Errors")
    ERRORS("Errors");
    private final String value;

    LoginStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoginStatus fromValue(String v) {
        for (LoginStatus c: LoginStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
