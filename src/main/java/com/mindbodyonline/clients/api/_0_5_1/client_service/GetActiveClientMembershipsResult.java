
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetActiveClientMembershipsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetActiveClientMembershipsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="ClientMemberships" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfClientMembership" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetActiveClientMembershipsResult", propOrder = {
    "clientMemberships"
})
public class GetActiveClientMembershipsResult
    extends MBResult
{

    @XmlElement(name = "ClientMemberships")
    protected ArrayOfClientMembership clientMemberships;

    /**
     * Gets the value of the clientMemberships property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClientMembership }
     *     
     */
    public ArrayOfClientMembership getClientMemberships() {
        return clientMemberships;
    }

    /**
     * Sets the value of the clientMemberships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClientMembership }
     *     
     */
    public void setClientMemberships(ArrayOfClientMembership value) {
        this.clientMemberships = value;
    }

}
