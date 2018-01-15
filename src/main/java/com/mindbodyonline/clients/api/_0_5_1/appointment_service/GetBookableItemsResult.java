
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBookableItemsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBookableItemsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="ScheduleItems" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfScheduleItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBookableItemsResult", propOrder = {
    "scheduleItems"
})
public class GetBookableItemsResult
    extends MBResult
{

    @XmlElement(name = "ScheduleItems")
    protected ArrayOfScheduleItem scheduleItems;

    /**
     * Gets the value of the scheduleItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScheduleItem }
     *     
     */
    public ArrayOfScheduleItem getScheduleItems() {
        return scheduleItems;
    }

    /**
     * Sets the value of the scheduleItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScheduleItem }
     *     
     */
    public void setScheduleItems(ArrayOfScheduleItem value) {
        this.scheduleItems = value;
    }

}
