
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetProductsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ProductIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="SearchText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="SubCategoryIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="SellOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductsRequest", propOrder = {
    "productIDs",
    "searchText",
    "searchDomain",
    "categoryIDs",
    "subCategoryIDs",
    "sellOnline",
    "locationID"
})
public class GetProductsRequest
    extends MBRequest
{

    @XmlElement(name = "ProductIDs")
    protected ArrayOfString productIDs;
    @XmlElement(name = "SearchText")
    protected String searchText;
    @XmlElement(name = "SearchDomain")
    protected String searchDomain;
    @XmlElement(name = "CategoryIDs")
    protected ArrayOfInt categoryIDs;
    @XmlElement(name = "SubCategoryIDs")
    protected ArrayOfInt subCategoryIDs;
    @XmlElement(name = "SellOnline")
    protected boolean sellOnline;
    @XmlElement(name = "LocationID", required = true, type = Integer.class, nillable = true)
    protected Integer locationID;

    /**
     * Gets the value of the productIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getProductIDs() {
        return productIDs;
    }

    /**
     * Sets the value of the productIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setProductIDs(ArrayOfString value) {
        this.productIDs = value;
    }

    /**
     * Gets the value of the searchText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchText() {
        return searchText;
    }

    /**
     * Sets the value of the searchText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchText(String value) {
        this.searchText = value;
    }

    /**
     * Gets the value of the searchDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchDomain() {
        return searchDomain;
    }

    /**
     * Sets the value of the searchDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchDomain(String value) {
        this.searchDomain = value;
    }

    /**
     * Gets the value of the categoryIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getCategoryIDs() {
        return categoryIDs;
    }

    /**
     * Sets the value of the categoryIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setCategoryIDs(ArrayOfInt value) {
        this.categoryIDs = value;
    }

    /**
     * Gets the value of the subCategoryIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getSubCategoryIDs() {
        return subCategoryIDs;
    }

    /**
     * Sets the value of the subCategoryIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setSubCategoryIDs(ArrayOfInt value) {
        this.subCategoryIDs = value;
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

}
