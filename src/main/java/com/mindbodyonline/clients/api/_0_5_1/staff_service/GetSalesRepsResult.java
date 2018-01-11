
package com.mindbodyonline.clients.api._0_5_1.staff_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSalesRepsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSalesRepsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="SalesReps" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfSalesRep" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSalesRepsResult", propOrder = {
    "salesReps"
})
public class GetSalesRepsResult
    extends MBResult
{

    @XmlElement(name = "SalesReps")
    protected ArrayOfSalesRep salesReps;

    /**
     * Gets the value of the salesReps property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesRep }
     *     
     */
    public ArrayOfSalesRep getSalesReps() {
        return salesReps;
    }

    /**
     * Sets the value of the salesReps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesRep }
     *     
     */
    public void setSalesReps(ArrayOfSalesRep value) {
        this.salesReps = value;
    }

}
