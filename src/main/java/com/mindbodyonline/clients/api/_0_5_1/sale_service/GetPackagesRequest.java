
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPackagesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPackagesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="PackageIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="SellOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPackagesRequest", propOrder = {
    "packageIDs",
    "sellOnline"
})
public class GetPackagesRequest
    extends MBRequest
{

    @XmlElement(name = "PackageIDs")
    protected ArrayOfInt packageIDs;
    @XmlElement(name = "SellOnline")
    protected boolean sellOnline;

    /**
     * Gets the value of the packageIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getPackageIDs() {
        return packageIDs;
    }

    /**
     * Sets the value of the packageIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setPackageIDs(ArrayOfInt value) {
        this.packageIDs = value;
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

}
