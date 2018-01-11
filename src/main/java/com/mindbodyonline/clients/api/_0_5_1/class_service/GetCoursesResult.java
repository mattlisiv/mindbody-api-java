
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCoursesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCoursesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="Courses" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfCourse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCoursesResult", propOrder = {
    "courses"
})
public class GetCoursesResult
    extends MBResult
{

    @XmlElement(name = "Courses")
    protected ArrayOfCourse courses;

    /**
     * Gets the value of the courses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCourse }
     *     
     */
    public ArrayOfCourse getCourses() {
        return courses;
    }

    /**
     * Sets the value of the courses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCourse }
     *     
     */
    public void setCourses(ArrayOfCourse value) {
        this.courses = value;
    }

}
