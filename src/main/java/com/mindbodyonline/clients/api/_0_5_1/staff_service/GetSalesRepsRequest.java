
package com.mindbodyonline.clients.api._0_5_1.staff_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSalesRepsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSalesRepsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="SalesRepNumbers" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="ShowActiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSalesRepsRequest", propOrder = {
    "salesRepNumbers",
    "showActiveOnly"
})
public class GetSalesRepsRequest
    extends MBRequest
{

    @XmlElement(name = "SalesRepNumbers")
    protected ArrayOfInt salesRepNumbers;
    @XmlElement(name = "ShowActiveOnly", required = true, type = Boolean.class, nillable = true)
    protected Boolean showActiveOnly;

    /**
     * Gets the value of the salesRepNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getSalesRepNumbers() {
        return salesRepNumbers;
    }

    /**
     * Sets the value of the salesRepNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setSalesRepNumbers(ArrayOfInt value) {
        this.salesRepNumbers = value;
    }

    /**
     * Gets the value of the showActiveOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowActiveOnly() {
        return showActiveOnly;
    }

    /**
     * Sets the value of the showActiveOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowActiveOnly(Boolean value) {
        this.showActiveOnly = value;
    }

}
