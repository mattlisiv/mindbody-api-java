
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetClassDescriptionsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClassDescriptionsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="ClassDescriptions" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfClassDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClassDescriptionsResult", propOrder = {
    "classDescriptions"
})
public class GetClassDescriptionsResult
    extends MBResult
{

    @XmlElement(name = "ClassDescriptions")
    protected ArrayOfClassDescription classDescriptions;

    /**
     * Gets the value of the classDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClassDescription }
     *     
     */
    public ArrayOfClassDescription getClassDescriptions() {
        return classDescriptions;
    }

    /**
     * Sets the value of the classDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClassDescription }
     *     
     */
    public void setClassDescriptions(ArrayOfClassDescription value) {
        this.classDescriptions = value;
    }

}
