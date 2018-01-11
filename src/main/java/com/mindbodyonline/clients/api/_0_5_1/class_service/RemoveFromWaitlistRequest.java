
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveFromWaitlistRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveFromWaitlistRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="WaitlistEntryIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveFromWaitlistRequest", propOrder = {
    "waitlistEntryIDs"
})
public class RemoveFromWaitlistRequest
    extends MBRequest
{

    @XmlElement(name = "WaitlistEntryIDs")
    protected ArrayOfInt waitlistEntryIDs;

    /**
     * Gets the value of the waitlistEntryIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getWaitlistEntryIDs() {
        return waitlistEntryIDs;
    }

    /**
     * Sets the value of the waitlistEntryIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setWaitlistEntryIDs(ArrayOfInt value) {
        this.waitlistEntryIDs = value;
    }

}
