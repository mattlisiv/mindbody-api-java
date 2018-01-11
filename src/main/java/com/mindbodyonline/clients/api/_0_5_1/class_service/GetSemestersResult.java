
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSemestersResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSemestersResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="Semesters" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfSemester" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSemestersResult", propOrder = {
    "semesters"
})
public class GetSemestersResult
    extends MBResult
{

    @XmlElement(name = "Semesters")
    protected ArrayOfSemester semesters;

    /**
     * Gets the value of the semesters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSemester }
     *     
     */
    public ArrayOfSemester getSemesters() {
        return semesters;
    }

    /**
     * Sets the value of the semesters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSemester }
     *     
     */
    public void setSemesters(ArrayOfSemester value) {
        this.semesters = value;
    }

}
