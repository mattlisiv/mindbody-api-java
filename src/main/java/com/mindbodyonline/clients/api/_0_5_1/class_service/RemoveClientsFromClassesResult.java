
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveClientsFromClassesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveClientsFromClassesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="Classes" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfClass" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveClientsFromClassesResult", propOrder = {
    "classes"
})
public class RemoveClientsFromClassesResult
    extends MBResult
{

    @XmlElement(name = "Classes")
    protected ArrayOfClass classes;

    /**
     * Gets the value of the classes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClass }
     *     
     */
    public ArrayOfClass getClasses() {
        return classes;
    }

    /**
     * Sets the value of the classes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClass }
     *     
     */
    public void setClasses(ArrayOfClass value) {
        this.classes = value;
    }

}
