
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfScheduleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfScheduleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScheduleItem" type="{http://clients.mindbodyonline.com/api/0_5_1}ScheduleItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfScheduleItem", propOrder = {
    "scheduleItem"
})
public class ArrayOfScheduleItem {

    @XmlElement(name = "ScheduleItem", nillable = true)
    protected List<ScheduleItem> scheduleItem;

    /**
     * Gets the value of the scheduleItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleItem }
     * 
     * 
     */
    public List<ScheduleItem> getScheduleItem() {
        if (scheduleItem == null) {
            scheduleItem = new ArrayList<ScheduleItem>();
        }
        return this.scheduleItem;
    }

}
