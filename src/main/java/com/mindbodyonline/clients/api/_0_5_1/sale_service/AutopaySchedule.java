
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutopaySchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutopaySchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrequencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrequencyValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FrequencyTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutopaySchedule", propOrder = {
    "frequencyType",
    "frequencyValue",
    "frequencyTimeUnit"
})
public class AutopaySchedule {

    @XmlElement(name = "FrequencyType")
    protected String frequencyType;
    @XmlElement(name = "FrequencyValue", required = true, type = Integer.class, nillable = true)
    protected Integer frequencyValue;
    @XmlElement(name = "FrequencyTimeUnit")
    protected String frequencyTimeUnit;

    /**
     * Gets the value of the frequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyType() {
        return frequencyType;
    }

    /**
     * Sets the value of the frequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyType(String value) {
        this.frequencyType = value;
    }

    /**
     * Gets the value of the frequencyValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequencyValue() {
        return frequencyValue;
    }

    /**
     * Sets the value of the frequencyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequencyValue(Integer value) {
        this.frequencyValue = value;
    }

    /**
     * Gets the value of the frequencyTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyTimeUnit() {
        return frequencyTimeUnit;
    }

    /**
     * Sets the value of the frequencyTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyTimeUnit(String value) {
        this.frequencyTimeUnit = value;
    }

}
