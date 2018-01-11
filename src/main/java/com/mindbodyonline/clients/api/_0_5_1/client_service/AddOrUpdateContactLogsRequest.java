
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOrUpdateContactLogsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateContactLogsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="UpdateAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "AddOrUpdateContactLogsRequest", propOrder = {
    "updateAction",
    "test",
    "contactLogs"
})
public class AddOrUpdateContactLogsRequest
    extends MBRequest
{

    @XmlElement(name = "UpdateAction")
    protected String updateAction;
    @XmlElement(name = "Test", required = true, type = Boolean.class, nillable = true)
    protected Boolean test;
    @XmlElement(name = "ContactLogs")
    protected ArrayOfContactLog contactLogs;

    /**
     * Gets the value of the updateAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateAction() {
        return updateAction;
    }

    /**
     * Sets the value of the updateAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateAction(String value) {
        this.updateAction = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTest() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTest(Boolean value) {
        this.test = value;
    }

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
