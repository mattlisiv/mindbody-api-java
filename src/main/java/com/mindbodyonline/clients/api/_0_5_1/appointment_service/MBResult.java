
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MBResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MBResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://clients.mindbodyonline.com/api/0_5_1}StatusCode"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMLDetail" type="{http://clients.mindbodyonline.com/api/0_5_1}XMLDetailLevel"/>
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentPageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalPageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MBResult", propOrder = {
    "status",
    "errorCode",
    "message",
    "xmlDetail",
    "resultCount",
    "currentPageIndex",
    "totalPageCount"
})
@XmlSeeAlso({
    GetAppointmentOptionsResult.class,
    AddOrUpdateAvailabilitiesResult.class,
    AddOrUpdateAppointmentsResult.class,
    GetBookableItemsResult.class,
    GetScheduleItemsResult.class,
    GetStaffAppointmentsResult.class,
    GetActiveSessionTimesResult.class
})
public class MBResult {

    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected StatusCode status;
    @XmlElement(name = "ErrorCode")
    protected int errorCode;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "XMLDetail", required = true)
    @XmlSchemaType(name = "string")
    protected XMLDetailLevel xmlDetail;
    @XmlElement(name = "ResultCount")
    protected int resultCount;
    @XmlElement(name = "CurrentPageIndex")
    protected int currentPageIndex;
    @XmlElement(name = "TotalPageCount")
    protected int totalPageCount;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setStatus(StatusCode value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the xmlDetail property.
     * 
     * @return
     *     possible object is
     *     {@link XMLDetailLevel }
     *     
     */
    public XMLDetailLevel getXMLDetail() {
        return xmlDetail;
    }

    /**
     * Sets the value of the xmlDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLDetailLevel }
     *     
     */
    public void setXMLDetail(XMLDetailLevel value) {
        this.xmlDetail = value;
    }

    /**
     * Gets the value of the resultCount property.
     * 
     */
    public int getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     */
    public void setResultCount(int value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the currentPageIndex property.
     * 
     */
    public int getCurrentPageIndex() {
        return currentPageIndex;
    }

    /**
     * Sets the value of the currentPageIndex property.
     * 
     */
    public void setCurrentPageIndex(int value) {
        this.currentPageIndex = value;
    }

    /**
     * Gets the value of the totalPageCount property.
     * 
     */
    public int getTotalPageCount() {
        return totalPageCount;
    }

    /**
     * Sets the value of the totalPageCount property.
     * 
     */
    public void setTotalPageCount(int value) {
        this.totalPageCount = value;
    }

}
