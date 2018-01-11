
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetContractsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContractsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ContractIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="SoldOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "GetContractsRequest", propOrder = {
    "contractIDs",
    "soldOnline",
    "locationID"
})
public class GetContractsRequest
    extends MBRequest
{

    @XmlElement(name = "ContractIDs")
    protected ArrayOfInt contractIDs;
    @XmlElement(name = "SoldOnline", required = true, type = Boolean.class, nillable = true)
    protected Boolean soldOnline;
    @XmlElement(name = "LocationID")
    protected int locationID;

    /**
     * Gets the value of the contractIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getContractIDs() {
        return contractIDs;
    }

    /**
     * Sets the value of the contractIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setContractIDs(ArrayOfInt value) {
        this.contractIDs = value;
    }

    /**
     * Gets the value of the soldOnline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoldOnline() {
        return soldOnline;
    }

    /**
     * Sets the value of the soldOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoldOnline(Boolean value) {
        this.soldOnline = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     */
    public int getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     */
    public void setLocationID(int value) {
        this.locationID = value;
    }

}
