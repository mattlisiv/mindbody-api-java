
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Package complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Package">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}Item">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountPercentage" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SellOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Services" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfService" minOccurs="0"/>
 *         &lt;element name="Products" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfProduct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Package", propOrder = {
    "id",
    "name",
    "discountPercentage",
    "sellOnline",
    "services",
    "products"
})
public class Package
    extends Item
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "DiscountPercentage")
    protected double discountPercentage;
    @XmlElement(name = "SellOnline")
    protected boolean sellOnline;
    @XmlElement(name = "Services")
    protected ArrayOfService services;
    @XmlElement(name = "Products")
    protected ArrayOfProduct products;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the discountPercentage property.
     * 
     */
    public double getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Sets the value of the discountPercentage property.
     * 
     */
    public void setDiscountPercentage(double value) {
        this.discountPercentage = value;
    }

    /**
     * Gets the value of the sellOnline property.
     * 
     */
    public boolean isSellOnline() {
        return sellOnline;
    }

    /**
     * Sets the value of the sellOnline property.
     * 
     */
    public void setSellOnline(boolean value) {
        this.sellOnline = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfService }
     *     
     */
    public ArrayOfService getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfService }
     *     
     */
    public void setServices(ArrayOfService value) {
        this.services = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProduct }
     *     
     */
    public ArrayOfProduct getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProduct }
     *     
     */
    public void setProducts(ArrayOfProduct value) {
        this.products = value;
    }

}
