
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClientContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientContract">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBObject">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiteID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AgreementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OriginationLocationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AutopayStatus" type="{http://clients.mindbodyonline.com/api/0_5_1}EAutopayStatus"/>
 *         &lt;element name="UpcomingAutopayEvents" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfUpcomingAutopayEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientContract", propOrder = {
    "id",
    "contractName",
    "siteID",
    "agreementDate",
    "originationLocationID",
    "startDate",
    "endDate",
    "autopayStatus",
    "upcomingAutopayEvents"
})
public class ClientContract
    extends MBObject
{

    @XmlElement(name = "ID", required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(name = "ContractName")
    protected String contractName;
    @XmlElement(name = "SiteID")
    protected int siteID;
    @XmlElement(name = "AgreementDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar agreementDate;
    @XmlElement(name = "OriginationLocationID", required = true, type = Integer.class, nillable = true)
    protected Integer originationLocationID;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "AutopayStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EAutopayStatus autopayStatus;
    @XmlElement(name = "UpcomingAutopayEvents")
    protected ArrayOfUpcomingAutopayEvent upcomingAutopayEvents;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the contractName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * Sets the value of the contractName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractName(String value) {
        this.contractName = value;
    }

    /**
     * Gets the value of the siteID property.
     * 
     */
    public int getSiteID() {
        return siteID;
    }

    /**
     * Sets the value of the siteID property.
     * 
     */
    public void setSiteID(int value) {
        this.siteID = value;
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
     * Gets the value of the originationLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginationLocationID() {
        return originationLocationID;
    }

    /**
     * Sets the value of the originationLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginationLocationID(Integer value) {
        this.originationLocationID = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the autopayStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EAutopayStatus }
     *     
     */
    public EAutopayStatus getAutopayStatus() {
        return autopayStatus;
    }

    /**
     * Sets the value of the autopayStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAutopayStatus }
     *     
     */
    public void setAutopayStatus(EAutopayStatus value) {
        this.autopayStatus = value;
    }

    /**
     * Gets the value of the upcomingAutopayEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpcomingAutopayEvent }
     *     
     */
    public ArrayOfUpcomingAutopayEvent getUpcomingAutopayEvents() {
        return upcomingAutopayEvents;
    }

    /**
     * Sets the value of the upcomingAutopayEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpcomingAutopayEvent }
     *     
     */
    public void setUpcomingAutopayEvents(ArrayOfUpcomingAutopayEvent value) {
        this.upcomingAutopayEvents = value;
    }

}
