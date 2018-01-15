
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Liability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Liability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsReleased" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AgreementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReleasedBy" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Liability", propOrder = {
    "isReleased",
    "agreementDate",
    "releasedBy"
})
public class Liability {

    @XmlElement(name = "IsReleased")
    protected boolean isReleased;
    @XmlElement(name = "AgreementDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar agreementDate;
    @XmlElement(name = "ReleasedBy", required = true, type = Long.class, nillable = true)
    protected Long releasedBy;

    /**
     * Gets the value of the isReleased property.
     * 
     */
    public boolean isIsReleased() {
        return isReleased;
    }

    /**
     * Sets the value of the isReleased property.
     * 
     */
    public void setIsReleased(boolean value) {
        this.isReleased = value;
    }

    /**
     * Gets the value of the agreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAgreementDate() {
        return agreementDate;
    }

    /**
     * Sets the value of the agreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAgreementDate(XMLGregorianCalendar value) {
        this.agreementDate = value;
    }

    /**
     * Gets the value of the releasedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReleasedBy() {
        return releasedBy;
    }

    /**
     * Sets the value of the releasedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReleasedBy(Long value) {
        this.releasedBy = value;
    }

}
