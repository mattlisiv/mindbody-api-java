
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Site complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Site">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageColor1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageColor2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageColor3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageColor4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcceptsVisa" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AcceptsDiscover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AcceptsMasterCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AcceptsAmericanExpress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TotalWOD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxInclusivePrices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SMSPackageEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowsDashboardAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PricingLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Site", propOrder = {
    "id",
    "name",
    "description",
    "logoURL",
    "pageColor1",
    "pageColor2",
    "pageColor3",
    "pageColor4",
    "acceptsVisa",
    "acceptsDiscover",
    "acceptsMasterCard",
    "acceptsAmericanExpress",
    "contactEmail",
    "esa",
    "totalWOD",
    "taxInclusivePrices",
    "smsPackageEnabled",
    "allowsDashboardAccess",
    "pricingLevel"
})
public class Site {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "LogoURL")
    protected String logoURL;
    @XmlElement(name = "PageColor1")
    protected String pageColor1;
    @XmlElement(name = "PageColor2")
    protected String pageColor2;
    @XmlElement(name = "PageColor3")
    protected String pageColor3;
    @XmlElement(name = "PageColor4")
    protected String pageColor4;
    @XmlElement(name = "AcceptsVisa")
    protected Boolean acceptsVisa;
    @XmlElement(name = "AcceptsDiscover")
    protected Boolean acceptsDiscover;
    @XmlElement(name = "AcceptsMasterCard")
    protected Boolean acceptsMasterCard;
    @XmlElement(name = "AcceptsAmericanExpress")
    protected Boolean acceptsAmericanExpress;
    @XmlElement(name = "ContactEmail")
    protected String contactEmail;
    @XmlElementRef(name = "ESA", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> esa;
    @XmlElementRef(name = "TotalWOD", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> totalWOD;
    @XmlElementRef(name = "TaxInclusivePrices", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> taxInclusivePrices;
    @XmlElement(name = "SMSPackageEnabled")
    protected Boolean smsPackageEnabled;
    @XmlElement(name = "AllowsDashboardAccess")
    protected Boolean allowsDashboardAccess;
    @XmlElement(name = "PricingLevel")
    protected String pricingLevel;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the logoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoURL() {
        return logoURL;
    }

    /**
     * Sets the value of the logoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoURL(String value) {
        this.logoURL = value;
    }

    /**
     * Gets the value of the pageColor1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageColor1() {
        return pageColor1;
    }

    /**
     * Sets the value of the pageColor1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageColor1(String value) {
        this.pageColor1 = value;
    }

    /**
     * Gets the value of the pageColor2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageColor2() {
        return pageColor2;
    }

    /**
     * Sets the value of the pageColor2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageColor2(String value) {
        this.pageColor2 = value;
    }

    /**
     * Gets the value of the pageColor3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageColor3() {
        return pageColor3;
    }

    /**
     * Sets the value of the pageColor3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageColor3(String value) {
        this.pageColor3 = value;
    }

    /**
     * Gets the value of the pageColor4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageColor4() {
        return pageColor4;
    }

    /**
     * Sets the value of the pageColor4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageColor4(String value) {
        this.pageColor4 = value;
    }

    /**
     * Gets the value of the acceptsVisa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptsVisa() {
        return acceptsVisa;
    }

    /**
     * Sets the value of the acceptsVisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptsVisa(Boolean value) {
        this.acceptsVisa = value;
    }

    /**
     * Gets the value of the acceptsDiscover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptsDiscover() {
        return acceptsDiscover;
    }

    /**
     * Sets the value of the acceptsDiscover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptsDiscover(Boolean value) {
        this.acceptsDiscover = value;
    }

    /**
     * Gets the value of the acceptsMasterCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptsMasterCard() {
        return acceptsMasterCard;
    }

    /**
     * Sets the value of the acceptsMasterCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptsMasterCard(Boolean value) {
        this.acceptsMasterCard = value;
    }

    /**
     * Gets the value of the acceptsAmericanExpress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptsAmericanExpress() {
        return acceptsAmericanExpress;
    }

    /**
     * Sets the value of the acceptsAmericanExpress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptsAmericanExpress(Boolean value) {
        this.acceptsAmericanExpress = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the esa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getESA() {
        return esa;
    }

    /**
     * Sets the value of the esa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setESA(JAXBElement<Boolean> value) {
        this.esa = value;
    }

    /**
     * Gets the value of the totalWOD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTotalWOD() {
        return totalWOD;
    }

    /**
     * Sets the value of the totalWOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTotalWOD(JAXBElement<Boolean> value) {
        this.totalWOD = value;
    }

    /**
     * Gets the value of the taxInclusivePrices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTaxInclusivePrices() {
        return taxInclusivePrices;
    }

    /**
     * Sets the value of the taxInclusivePrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTaxInclusivePrices(JAXBElement<Boolean> value) {
        this.taxInclusivePrices = value;
    }

    /**
     * Gets the value of the smsPackageEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSMSPackageEnabled() {
        return smsPackageEnabled;
    }

    /**
     * Sets the value of the smsPackageEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSMSPackageEnabled(Boolean value) {
        this.smsPackageEnabled = value;
    }

    /**
     * Gets the value of the allowsDashboardAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsDashboardAccess() {
        return allowsDashboardAccess;
    }

    /**
     * Sets the value of the allowsDashboardAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsDashboardAccess(Boolean value) {
        this.allowsDashboardAccess = value;
    }

    /**
     * Gets the value of the pricingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingLevel() {
        return pricingLevel;
    }

    /**
     * Sets the value of the pricingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingLevel(String value) {
        this.pricingLevel = value;
    }

}
