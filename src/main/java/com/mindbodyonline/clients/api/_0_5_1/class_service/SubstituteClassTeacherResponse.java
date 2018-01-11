
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubstituteClassTeacherResult" type="{http://clients.mindbodyonline.com/api/0_5_1}SubstituteClassTeacherResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "substituteClassTeacherResult"
})
@XmlRootElement(name = "SubstituteClassTeacherResponse")
public class SubstituteClassTeacherResponse {

    @XmlElement(name = "SubstituteClassTeacherResult")
    protected SubstituteClassTeacherResult substituteClassTeacherResult;

    /**
     * Gets the value of the substituteClassTeacherResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubstituteClassTeacherResult }
     *     
     */
    public SubstituteClassTeacherResult getSubstituteClassTeacherResult() {
        return substituteClassTeacherResult;
    }

    /**
     * Sets the value of the substituteClassTeacherResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstituteClassTeacherResult }
     *     
     */
    public void setSubstituteClassTeacherResult(SubstituteClassTeacherResult value) {
        this.substituteClassTeacherResult = value;
    }

}
