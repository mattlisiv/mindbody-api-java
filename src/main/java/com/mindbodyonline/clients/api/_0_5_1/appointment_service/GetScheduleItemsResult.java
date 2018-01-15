
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetScheduleItemsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetScheduleItemsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="StaffMembers" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfStaff" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetScheduleItemsResult", propOrder = {
    "staffMembers"
})
public class GetScheduleItemsResult
    extends MBResult
{

    @XmlElement(name = "StaffMembers")
    protected ArrayOfStaff staffMembers;

    /**
     * Gets the value of the staffMembers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStaff }
     *     
     */
    public ArrayOfStaff getStaffMembers() {
        return staffMembers;
    }

    /**
     * Sets the value of the staffMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStaff }
     *     
     */
    public void setStaffMembers(ArrayOfStaff value) {
        this.staffMembers = value;
    }

}
