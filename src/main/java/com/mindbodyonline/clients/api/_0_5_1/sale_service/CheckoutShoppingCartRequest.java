
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckoutShoppingCartRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckoutShoppingCartRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="CartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CartItems" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfCartItem" minOccurs="0"/>
 *         &lt;element name="InStore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Payments" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfPaymentInfo" minOccurs="0"/>
 *         &lt;element name="SendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ImageFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckoutShoppingCartRequest", propOrder = {
    "cartID",
    "clientID",
    "test",
    "cartItems",
    "inStore",
    "promotionCode",
    "payments",
    "sendEmail",
    "locationID",
    "image",
    "imageFileName"
})
public class CheckoutShoppingCartRequest
    extends MBRequest
{

    @XmlElement(name = "CartID")
    protected String cartID;
    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "Test", required = true, type = Boolean.class, nillable = true)
    protected Boolean test;
    @XmlElement(name = "CartItems")
    protected ArrayOfCartItem cartItems;
    @XmlElement(name = "InStore", required = true, type = Boolean.class, nillable = true)
    protected Boolean inStore;
    @XmlElement(name = "PromotionCode")
    protected String promotionCode;
    @XmlElement(name = "Payments")
    protected ArrayOfPaymentInfo payments;
    @XmlElement(name = "SendEmail", required = true, type = Boolean.class, nillable = true)
    protected Boolean sendEmail;
    @XmlElement(name = "LocationID", required = true, type = Integer.class, nillable = true)
    protected Integer locationID;
    @XmlElement(name = "Image")
    protected byte[] image;
    @XmlElement(name = "ImageFileName")
    protected String imageFileName;

    /**
     * Gets the value of the cartID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartID() {
        return cartID;
    }

    /**
     * Sets the value of the cartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartID(String value) {
        this.cartID = value;
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
     * Gets the value of the cartItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCartItem }
     *     
     */
    public ArrayOfCartItem getCartItems() {
        return cartItems;
    }

    /**
     * Sets the value of the cartItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCartItem }
     *     
     */
    public void setCartItems(ArrayOfCartItem value) {
        this.cartItems = value;
    }

    /**
     * Gets the value of the inStore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInStore() {
        return inStore;
    }

    /**
     * Sets the value of the inStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInStore(Boolean value) {
        this.inStore = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentInfo }
     *     
     */
    public ArrayOfPaymentInfo getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentInfo }
     *     
     */
    public void setPayments(ArrayOfPaymentInfo value) {
        this.payments = value;
    }

    /**
     * Gets the value of the sendEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmail() {
        return sendEmail;
    }

    /**
     * Sets the value of the sendEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmail(Boolean value) {
        this.sendEmail = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocationID(Integer value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = value;
    }

    /**
     * Gets the value of the imageFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFileName() {
        return imageFileName;
    }

    /**
     * Sets the value of the imageFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFileName(String value) {
        this.imageFileName = value;
    }

}
