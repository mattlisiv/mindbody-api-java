
package com.mindbodyonline.clients.api._0_5_1.class_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWaitlistEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWaitlistEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WaitlistEntry" type="{http://clients.mindbodyonline.com/api/0_5_1}WaitlistEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWaitlistEntry", propOrder = {
    "waitlistEntry"
})
public class ArrayOfWaitlistEntry {

    @XmlElement(name = "WaitlistEntry", nillable = true)
    protected List<WaitlistEntry> waitlistEntry;

    /**
     * Gets the value of the waitlistEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waitlistEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaitlistEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaitlistEntry }
     * 
     * 
     */
    public List<WaitlistEntry> getWaitlistEntry() {
        if (waitlistEntry == null) {
            waitlistEntry = new ArrayList<WaitlistEntry>();
        }
        return this.waitlistEntry;
    }

}
