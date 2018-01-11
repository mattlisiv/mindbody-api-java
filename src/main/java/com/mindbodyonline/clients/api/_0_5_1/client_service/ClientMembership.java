
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientMembership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientMembership">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}ClientService">
 *       &lt;sequence>
 *         &lt;element name="RestrictedLocations" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfLocation" minOccurs="0"/>
 *         &lt;element name="IconCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientMembership", propOrder = {
    "restrictedLocations",
    "iconCode"
})
public class ClientMembership
    extends ClientService
{

    @XmlElement(name = "RestrictedLocations")
    protected ArrayOfLocation restrictedLocations;
    @XmlElement(name = "IconCode")
    protected String iconCode;

    /**
     * Gets the value of the restrictedLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocation }
     *     
     */
    public ArrayOfLocation getRestrictedLocations() {
        return restrictedLocations;
    }

    /**
     * Sets the value of the restrictedLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocation }
     *     
     */
    public void setRestrictedLocations(ArrayOfLocation value) {
        this.restrictedLocations = value;
    }

    /**
     * Gets the value of the iconCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconCode() {
        return iconCode;
    }

    /**
     * Sets the value of the iconCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconCode(String value) {
        this.iconCode = value;
    }

}
