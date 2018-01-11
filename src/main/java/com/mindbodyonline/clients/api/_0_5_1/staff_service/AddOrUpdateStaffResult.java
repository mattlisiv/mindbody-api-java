
package com.mindbodyonline.clients.api._0_5_1.staff_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOrUpdateStaffResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateStaffResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="Staff" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfStaff" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpdateStaffResult", propOrder = {
    "staff"
})
public class AddOrUpdateStaffResult
    extends MBResult
{

    @XmlElement(name = "Staff")
    protected ArrayOfStaff staff;

    /**
     * Gets the value of the staff property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStaff }
     *     
     */
    public ArrayOfStaff getStaff() {
        return staff;
    }

    /**
     * Sets the value of the staff property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStaff }
     *     
     */
    public void setStaff(ArrayOfStaff value) {
        this.staff = value;
    }

}
