
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOrUpdateContactLogsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateContactLogsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="ContactLogs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfContactLog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpdateContactLogsResult", propOrder = {
    "contactLogs"
})
public class AddOrUpdateContactLogsResult
    extends MBResult
{

    @XmlElement(name = "ContactLogs")
    protected ArrayOfContactLog contactLogs;

    /**
     * Gets the value of the contactLogs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactLog }
     *     
     */
    public ArrayOfContactLog getContactLogs() {
        return contactLogs;
    }

    /**
     * Sets the value of the contactLogs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactLog }
     *     
     */
    public void setContactLogs(ArrayOfContactLog value) {
        this.contactLogs = value;
    }

}
