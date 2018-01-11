
package com.mindbodyonline.clients.api._0_5_1.site_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMobileProvidersResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMobileProvidersResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="MobileProviders" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfMobileProvider" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMobileProvidersResult", propOrder = {
    "mobileProviders"
})
public class GetMobileProvidersResult
    extends MBResult
{

    @XmlElement(name = "MobileProviders")
    protected ArrayOfMobileProvider mobileProviders;

    /**
     * Gets the value of the mobileProviders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMobileProvider }
     *     
     */
    public ArrayOfMobileProvider getMobileProviders() {
        return mobileProviders;
    }

    /**
     * Sets the value of the mobileProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMobileProvider }
     *     
     */
    public void setMobileProviders(ArrayOfMobileProvider value) {
        this.mobileProviders = value;
    }

}
