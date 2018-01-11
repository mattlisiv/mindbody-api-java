
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddArrivalResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddArrivalResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="ArrivalAdded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ClientService" type="{http://clients.mindbodyonline.com/api/0_5_1}ClientService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddArrivalResult", propOrder = {
    "arrivalAdded",
    "clientService"
})
public class AddArrivalResult
    extends MBResult
{

    @XmlElement(name = "ArrivalAdded")
    protected boolean arrivalAdded;
    @XmlElement(name = "ClientService")
    protected ClientService clientService;

    /**
     * Gets the value of the arrivalAdded property.
     * 
     */
    public boolean isArrivalAdded() {
        return arrivalAdded;
    }

    /**
     * Sets the value of the arrivalAdded property.
     * 
     */
    public void setArrivalAdded(boolean value) {
        this.arrivalAdded = value;
    }

    /**
     * Gets the value of the clientService property.
     * 
     * @return
     *     possible object is
     *     {@link ClientService }
     *     
     */
    public ClientService getClientService() {
        return clientService;
    }

    /**
     * Sets the value of the clientService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientService }
     *     
     */
    public void setClientService(ClientService value) {
        this.clientService = value;
    }

}
