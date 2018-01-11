
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetContactLogTypesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContactLogTypesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="ContatctLogTypes" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfContactLogType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContactLogTypesResult", propOrder = {
    "contatctLogTypes"
})
public class GetContactLogTypesResult
    extends MBResult
{

    @XmlElement(name = "ContatctLogTypes")
    protected ArrayOfContactLogType contatctLogTypes;

    /**
     * Gets the value of the contatctLogTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactLogType }
     *     
     */
    public ArrayOfContactLogType getContatctLogTypes() {
        return contatctLogTypes;
    }

    /**
     * Sets the value of the contatctLogTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactLogType }
     *     
     */
    public void setContatctLogTypes(ArrayOfContactLogType value) {
        this.contatctLogTypes = value;
    }

}
