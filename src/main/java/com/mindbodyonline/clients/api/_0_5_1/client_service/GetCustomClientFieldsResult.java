
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomClientFieldsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomClientFieldsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="CustomClientFields" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfCustomClientField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomClientFieldsResult", propOrder = {
    "customClientFields"
})
public class GetCustomClientFieldsResult
    extends MBResult
{

    @XmlElement(name = "CustomClientFields")
    protected ArrayOfCustomClientField customClientFields;

    /**
     * Gets the value of the customClientFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomClientField }
     *     
     */
    public ArrayOfCustomClientField getCustomClientFields() {
        return customClientFields;
    }

    /**
     * Sets the value of the customClientFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomClientField }
     *     
     */
    public void setCustomClientFields(ArrayOfCustomClientField value) {
        this.customClientFields = value;
    }

}
