
package com.mindbodyonline.clients.api._0_5_1.site_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSessionTypesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSessionTypesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="SessionTypes" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfSessionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSessionTypesResult", propOrder = {
    "sessionTypes"
})
public class GetSessionTypesResult
    extends MBResult
{

    @XmlElement(name = "SessionTypes")
    protected ArrayOfSessionType sessionTypes;

    /**
     * Gets the value of the sessionTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSessionType }
     *     
     */
    public ArrayOfSessionType getSessionTypes() {
        return sessionTypes;
    }

    /**
     * Sets the value of the sessionTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSessionType }
     *     
     */
    public void setSessionTypes(ArrayOfSessionType value) {
        this.sessionTypes = value;
    }

}
