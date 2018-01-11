
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEnrollmentsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEnrollmentsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="Enrollments" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfClassSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEnrollmentsResult", propOrder = {
    "enrollments"
})
public class GetEnrollmentsResult
    extends MBResult
{

    @XmlElement(name = "Enrollments")
    protected ArrayOfClassSchedule enrollments;

    /**
     * Gets the value of the enrollments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClassSchedule }
     *     
     */
    public ArrayOfClassSchedule getEnrollments() {
        return enrollments;
    }

    /**
     * Sets the value of the enrollments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClassSchedule }
     *     
     */
    public void setEnrollments(ArrayOfClassSchedule value) {
        this.enrollments = value;
    }

}
