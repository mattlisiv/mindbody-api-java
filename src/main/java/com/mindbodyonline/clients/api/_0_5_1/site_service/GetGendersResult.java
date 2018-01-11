
package com.mindbodyonline.clients.api._0_5_1.site_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGendersResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGendersResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="GenderOptions" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfGenderOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGendersResult", propOrder = {
    "genderOptions"
})
public class GetGendersResult
    extends MBResult
{

    @XmlElement(name = "GenderOptions")
    protected ArrayOfGenderOption genderOptions;

    /**
     * Gets the value of the genderOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGenderOption }
     *     
     */
    public ArrayOfGenderOption getGenderOptions() {
        return genderOptions;
    }

    /**
     * Sets the value of the genderOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGenderOption }
     *     
     */
    public void setGenderOptions(ArrayOfGenderOption value) {
        this.genderOptions = value;
    }

}
