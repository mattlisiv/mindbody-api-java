
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUnavailability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnavailability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unavailability" type="{http://clients.mindbodyonline.com/api/0_5_1}Unavailability" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnavailability", propOrder = {
    "unavailability"
})
public class ArrayOfUnavailability {

    @XmlElement(name = "Unavailability", nillable = true)
    protected List<Unavailability> unavailability;

    /**
     * Gets the value of the unavailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unavailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnavailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Unavailability }
     * 
     * 
     */
    public List<Unavailability> getUnavailability() {
        if (unavailability == null) {
            unavailability = new ArrayList<Unavailability>();
        }
        return this.unavailability;
    }

}
