
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetWaitlistEntriesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWaitlistEntriesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="WaitlistEntries" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfWaitlistEntry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWaitlistEntriesResult", propOrder = {
    "waitlistEntries"
})
public class GetWaitlistEntriesResult
    extends MBResult
{

    @XmlElement(name = "WaitlistEntries")
    protected ArrayOfWaitlistEntry waitlistEntries;

    /**
     * Gets the value of the waitlistEntries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWaitlistEntry }
     *     
     */
    public ArrayOfWaitlistEntry getWaitlistEntries() {
        return waitlistEntries;
    }

    /**
     * Sets the value of the waitlistEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWaitlistEntry }
     *     
     */
    public void setWaitlistEntries(ArrayOfWaitlistEntry value) {
        this.waitlistEntries = value;
    }

}
