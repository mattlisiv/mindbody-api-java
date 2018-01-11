
package com.mindbodyonline.clients.api._0_5_1.site_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMobileProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMobileProvider">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MobileProvider" type="{http://clients.mindbodyonline.com/api/0_5_1}MobileProvider" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMobileProvider", propOrder = {
    "mobileProvider"
})
public class ArrayOfMobileProvider {

    @XmlElement(name = "MobileProvider", nillable = true)
    protected List<MobileProvider> mobileProvider;

    /**
     * Gets the value of the mobileProvider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileProvider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobileProvider }
     * 
     * 
     */
    public List<MobileProvider> getMobileProvider() {
        if (mobileProvider == null) {
            mobileProvider = new ArrayList<MobileProvider>();
        }
        return this.mobileProvider;
    }

}
