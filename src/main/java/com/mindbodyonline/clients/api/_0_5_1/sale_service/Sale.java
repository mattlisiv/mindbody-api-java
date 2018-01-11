
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Sale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SaleTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SaleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SaleDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchasedItems" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfPurchasedItem" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://clients.mindbodyonline.com/api/0_5_1}Location" minOccurs="0"/>
 *         &lt;element name="Payments" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfPayment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sale", propOrder = {
    "id",
    "saleTime",
    "saleDate",
    "saleDateTime",
    "clientID",
    "purchasedItems",
    "location",
    "payments"
})
public class Sale {

    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(name = "SaleTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar saleTime;
    @XmlElement(name = "SaleDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar saleDate;
    @XmlElement(name = "SaleDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar saleDateTime;
    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "PurchasedItems")
    protected ArrayOfPurchasedItem purchasedItems;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "Payments")
    protected ArrayOfPayment payments;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the saleTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleTime() {
        return saleTime;
    }

    /**
     * Sets the value of the saleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleTime(XMLGregorianCalendar value) {
        this.saleTime = value;
    }

    /**
     * Gets the value of the saleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDate() {
        return saleDate;
    }

    /**
     * Sets the value of the saleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDate(XMLGregorianCalendar value) {
        this.saleDate = value;
    }

    /**
     * Gets the value of the saleDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDateTime() {
        return saleDateTime;
    }

    /**
     * Sets the value of the saleDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDateTime(XMLGregorianCalendar value) {
        this.saleDateTime = value;
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

    /**
     * Gets the value of the purchasedItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPurchasedItem }
     *     
     */
    public ArrayOfPurchasedItem getPurchasedItems() {
        return purchasedItems;
    }

    /**
     * Sets the value of the purchasedItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPurchasedItem }
     *     
     */
    public void setPurchasedItems(ArrayOfPurchasedItem value) {
        this.purchasedItems = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPayment }
     *     
     */
    public ArrayOfPayment getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPayment }
     *     
     */
    public void setPayments(ArrayOfPayment value) {
        this.payments = value;
    }

}
