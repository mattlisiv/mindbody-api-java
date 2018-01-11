
package com.mindbodyonline.clients.api._0_5_1.site_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSitesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSitesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="SearchText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedSiteID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ShowOnlyTotalWOD" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSitesRequest", propOrder = {
    "searchText",
    "relatedSiteID",
    "showOnlyTotalWOD"
})
public class GetSitesRequest
    extends MBRequest
{

    @XmlElement(name = "SearchText")
    protected String searchText;
    @XmlElement(name = "RelatedSiteID", required = true, type = Integer.class, nillable = true)
    protected Integer relatedSiteID;
    @XmlElement(name = "ShowOnlyTotalWOD", required = true, type = Boolean.class, nillable = true)
    protected Boolean showOnlyTotalWOD;

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
     * Gets the value of the relatedSiteID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelatedSiteID() {
        return relatedSiteID;
    }

    /**
     * Sets the value of the relatedSiteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelatedSiteID(Integer value) {
        this.relatedSiteID = value;
    }

    /**
     * Gets the value of the showOnlyTotalWOD property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOnlyTotalWOD() {
        return showOnlyTotalWOD;
    }

    /**
     * Sets the value of the showOnlyTotalWOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOnlyTotalWOD(Boolean value) {
        this.showOnlyTotalWOD = value;
    }

}
