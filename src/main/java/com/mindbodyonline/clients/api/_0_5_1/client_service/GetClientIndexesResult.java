
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetClientIndexesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientIndexesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="ClientIndexes" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfClientIndex" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientIndexesResult", propOrder = {
    "clientIndexes"
})
public class GetClientIndexesResult
    extends MBResult
{

    @XmlElement(name = "ClientIndexes")
    protected ArrayOfClientIndex clientIndexes;

    /**
     * Gets the value of the clientIndexes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClientIndex }
     *     
     */
    public ArrayOfClientIndex getClientIndexes() {
        return clientIndexes;
    }

    /**
     * Sets the value of the clientIndexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClientIndex }
     *     
     */
    public void setClientIndexes(ArrayOfClientIndex value) {
        this.clientIndexes = value;
    }

}
