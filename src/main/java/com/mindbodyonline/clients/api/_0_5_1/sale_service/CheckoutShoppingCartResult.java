
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckoutShoppingCartResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckoutShoppingCartResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="ShoppingCart" type="{http://clients.mindbodyonline.com/api/0_5_1}ShoppingCart" minOccurs="0"/>
 *         &lt;element name="Classes" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfClass" minOccurs="0"/>
 *         &lt;element name="Appointments" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfAppointment" minOccurs="0"/>
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
@XmlType(name = "CheckoutShoppingCartResult", propOrder = {
    "shoppingCart",
    "classes",
    "appointments",
    "enrollments"
})
public class CheckoutShoppingCartResult
    extends MBResult
{

    @XmlElement(name = "ShoppingCart")
    protected ShoppingCart shoppingCart;
    @XmlElement(name = "Classes")
    protected ArrayOfClass classes;
    @XmlElement(name = "Appointments")
    protected ArrayOfAppointment appointments;
    @XmlElement(name = "Enrollments")
    protected ArrayOfClassSchedule enrollments;

    /**
     * Gets the value of the shoppingCart property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCart }
     *     
     */
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    /**
     * Sets the value of the shoppingCart property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCart }
     *     
     */
    public void setShoppingCart(ShoppingCart value) {
        this.shoppingCart = value;
    }

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

    /**
     * Gets the value of the appointments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAppointment }
     *     
     */
    public ArrayOfAppointment getAppointments() {
        return appointments;
    }

    /**
     * Sets the value of the appointments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAppointment }
     *     
     */
    public void setAppointments(ArrayOfAppointment value) {
        this.appointments = value;
    }

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
