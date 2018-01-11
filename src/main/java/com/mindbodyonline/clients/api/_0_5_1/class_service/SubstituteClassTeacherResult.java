
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubstituteClassTeacherResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstituteClassTeacherResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="Class" type="{http://clients.mindbodyonline.com/api/0_5_1}Class" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstituteClassTeacherResult", propOrder = {
    "clazz"
})
public class SubstituteClassTeacherResult
    extends MBResult
{

    @XmlElement(name = "Class")
    protected com.mindbodyonline.clients.api._0_5_1.class_service.Class clazz;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link com.mindbodyonline.clients.api._0_5_1.class_service.Class }
     *     
     */
    public com.mindbodyonline.clients.api._0_5_1.class_service.Class getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mindbodyonline.clients.api._0_5_1.class_service.Class }
     *     
     */
    public void setClazz(com.mindbodyonline.clients.api._0_5_1.class_service.Class value) {
        this.clazz = value;
    }

}
