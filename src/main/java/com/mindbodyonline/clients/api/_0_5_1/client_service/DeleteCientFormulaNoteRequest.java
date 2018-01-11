
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteCientFormulaNoteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteCientFormulaNoteRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="FormulaNoteID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteCientFormulaNoteRequest", propOrder = {
    "formulaNoteID",
    "clientID"
})
public class DeleteCientFormulaNoteRequest
    extends MBRequest
{

    @XmlElement(name = "FormulaNoteID")
    protected long formulaNoteID;
    @XmlElement(name = "ClientID")
    protected String clientID;

    /**
     * Gets the value of the formulaNoteID property.
     * 
     */
    public long getFormulaNoteID() {
        return formulaNoteID;
    }

    /**
     * Sets the value of the formulaNoteID property.
     * 
     */
    public void setFormulaNoteID(long value) {
        this.formulaNoteID = value;
    }

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

}
