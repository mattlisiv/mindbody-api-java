
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetClassSchedulesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClassSchedulesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="ClassSchedules" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfClassSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClassSchedulesResult", propOrder = {
    "classSchedules"
})
public class GetClassSchedulesResult
    extends MBResult
{

    @XmlElement(name = "ClassSchedules")
    protected ArrayOfClassSchedule classSchedules;

    /**
     * Gets the value of the classSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClassSchedule }
     *     
     */
    public ArrayOfClassSchedule getClassSchedules() {
        return classSchedules;
    }

    /**
     * Sets the value of the classSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClassSchedule }
     *     
     */
    public void setClassSchedules(ArrayOfClassSchedule value) {
        this.classSchedules = value;
    }

}
