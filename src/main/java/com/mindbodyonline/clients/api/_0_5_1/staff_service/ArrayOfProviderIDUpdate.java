
package com.mindbodyonline.clients.api._0_5_1.staff_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProviderIDUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProviderIDUpdate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProviderIDUpdate" type="{http://clients.mindbodyonline.com/api/0_5_1}ProviderIDUpdate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProviderIDUpdate", propOrder = {
    "providerIDUpdate"
})
public class ArrayOfProviderIDUpdate {

    @XmlElement(name = "ProviderIDUpdate", nillable = true)
    protected List<ProviderIDUpdate> providerIDUpdate;

    /**
     * Gets the value of the providerIDUpdate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerIDUpdate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderIDUpdate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderIDUpdate }
     * 
     * 
     */
    public List<ProviderIDUpdate> getProviderIDUpdate() {
        if (providerIDUpdate == null) {
            providerIDUpdate = new ArrayList<ProviderIDUpdate>();
        }
        return this.providerIDUpdate;
    }

}
