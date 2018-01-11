
package com.mindbodyonline.clients.api._0_5_1.site_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSitesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSitesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="Sites" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfSite" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSitesResult", propOrder = {
    "sites"
})
public class GetSitesResult
    extends MBResult
{

    @XmlElement(name = "Sites")
    protected ArrayOfSite sites;

    /**
     * Gets the value of the sites property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSite }
     *     
     */
    public ArrayOfSite getSites() {
        return sites;
    }

    /**
     * Sets the value of the sites property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSite }
     *     
     */
    public void setSites(ArrayOfSite value) {
        this.sites = value;
    }

}
