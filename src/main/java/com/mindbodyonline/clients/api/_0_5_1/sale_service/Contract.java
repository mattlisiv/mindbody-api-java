
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Contract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBObject">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignsMembershipId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AssignsMembershipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoldOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ContractItems" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfContractItem" minOccurs="0"/>
 *         &lt;element name="IntroOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutopaySchedule" type="{http://clients.mindbodyonline.com/api/0_5_1}AutopaySchedule" minOccurs="0"/>
 *         &lt;element name="NumberOfAutopays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AutopayTriggerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActionUponCompletionOfAutopays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientsChargedOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientsChargedOnSpecificDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DepositAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FirstAutopayFree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LastAutopayFree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ClientTerminateOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MembershipTypeRestrictions" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfMembershipTypeRestriction" minOccurs="0"/>
 *         &lt;element name="LocationPurchaseRestrictionIds" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="AgreementTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequiresElectronicConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AutopayEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FirstPaymentAmountSubtotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FirstPaymentAmountTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FirstPaymentAmountTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RecurringPaymentAmountSubtotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RecurringPaymentAmountTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RecurringPaymentAmountTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalContractAmountSubtotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalContractAmountTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalContractAmountTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract", propOrder = {
    "id",
    "name",
    "description",
    "assignsMembershipId",
    "assignsMembershipName",
    "soldOnline",
    "contractItems",
    "introOffer",
    "autopaySchedule",
    "numberOfAutopays",
    "autopayTriggerType",
    "actionUponCompletionOfAutopays",
    "clientsChargedOn",
    "clientsChargedOnSpecificDate",
    "discountAmount",
    "depositAmount",
    "firstAutopayFree",
    "lastAutopayFree",
    "clientTerminateOnline",
    "membershipTypeRestrictions",
    "locationPurchaseRestrictionIds",
    "agreementTerms",
    "requiresElectronicConfirmation",
    "autopayEnabled",
    "firstPaymentAmountSubtotal",
    "firstPaymentAmountTax",
    "firstPaymentAmountTotal",
    "recurringPaymentAmountSubtotal",
    "recurringPaymentAmountTax",
    "recurringPaymentAmountTotal",
    "totalContractAmountSubtotal",
    "totalContractAmountTax",
    "totalContractAmountTotal"
})
public class Contract
    extends MBObject
{

    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "AssignsMembershipId", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> assignsMembershipId;
    @XmlElement(name = "AssignsMembershipName")
    protected String assignsMembershipName;
    @XmlElement(name = "SoldOnline")
    protected boolean soldOnline;
    @XmlElement(name = "ContractItems")
    protected ArrayOfContractItem contractItems;
    @XmlElement(name = "IntroOffer")
    protected String introOffer;
    @XmlElement(name = "AutopaySchedule")
    protected AutopaySchedule autopaySchedule;
    @XmlElement(name = "NumberOfAutopays", required = true, type = Integer.class, nillable = true)
    protected Integer numberOfAutopays;
    @XmlElement(name = "AutopayTriggerType")
    protected String autopayTriggerType;
    @XmlElement(name = "ActionUponCompletionOfAutopays")
    protected String actionUponCompletionOfAutopays;
    @XmlElement(name = "ClientsChargedOn")
    protected String clientsChargedOn;
    @XmlElement(name = "ClientsChargedOnSpecificDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientsChargedOnSpecificDate;
    @XmlElement(name = "DiscountAmount", required = true)
    protected BigDecimal discountAmount;
    @XmlElement(name = "DepositAmount", required = true)
    protected BigDecimal depositAmount;
    @XmlElement(name = "FirstAutopayFree")
    protected boolean firstAutopayFree;
    @XmlElement(name = "LastAutopayFree")
    protected boolean lastAutopayFree;
    @XmlElement(name = "ClientTerminateOnline")
    protected boolean clientTerminateOnline;
    @XmlElement(name = "MembershipTypeRestrictions")
    protected ArrayOfMembershipTypeRestriction membershipTypeRestrictions;
    @XmlElement(name = "LocationPurchaseRestrictionIds")
    protected ArrayOfInt locationPurchaseRestrictionIds;
    @XmlElement(name = "AgreementTerms")
    protected String agreementTerms;
    @XmlElement(name = "RequiresElectronicConfirmation")
    protected boolean requiresElectronicConfirmation;
    @XmlElement(name = "AutopayEnabled")
    protected boolean autopayEnabled;
    @XmlElement(name = "FirstPaymentAmountSubtotal", required = true)
    protected BigDecimal firstPaymentAmountSubtotal;
    @XmlElement(name = "FirstPaymentAmountTax", required = true)
    protected BigDecimal firstPaymentAmountTax;
    @XmlElement(name = "FirstPaymentAmountTotal", required = true)
    protected BigDecimal firstPaymentAmountTotal;
    @XmlElement(name = "RecurringPaymentAmountSubtotal", required = true)
    protected BigDecimal recurringPaymentAmountSubtotal;
    @XmlElement(name = "RecurringPaymentAmountTax", required = true)
    protected BigDecimal recurringPaymentAmountTax;
    @XmlElement(name = "RecurringPaymentAmountTotal", required = true)
    protected BigDecimal recurringPaymentAmountTotal;
    @XmlElement(name = "TotalContractAmountSubtotal", required = true)
    protected BigDecimal totalContractAmountSubtotal;
    @XmlElement(name = "TotalContractAmountTax", required = true)
    protected BigDecimal totalContractAmountTax;
    @XmlElement(name = "TotalContractAmountTotal", required = true)
    protected BigDecimal totalContractAmountTotal;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the assignsMembershipId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAssignsMembershipId() {
        return assignsMembershipId;
    }

    /**
     * Sets the value of the assignsMembershipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAssignsMembershipId(JAXBElement<Integer> value) {
        this.assignsMembershipId = value;
    }

    /**
     * Gets the value of the assignsMembershipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignsMembershipName() {
        return assignsMembershipName;
    }

    /**
     * Sets the value of the assignsMembershipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignsMembershipName(String value) {
        this.assignsMembershipName = value;
    }

    /**
     * Gets the value of the soldOnline property.
     * 
     */
    public boolean isSoldOnline() {
        return soldOnline;
    }

    /**
     * Sets the value of the soldOnline property.
     * 
     */
    public void setSoldOnline(boolean value) {
        this.soldOnline = value;
    }

    /**
     * Gets the value of the contractItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContractItem }
     *     
     */
    public ArrayOfContractItem getContractItems() {
        return contractItems;
    }

    /**
     * Sets the value of the contractItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContractItem }
     *     
     */
    public void setContractItems(ArrayOfContractItem value) {
        this.contractItems = value;
    }

    /**
     * Gets the value of the introOffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroOffer() {
        return introOffer;
    }

    /**
     * Sets the value of the introOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroOffer(String value) {
        this.introOffer = value;
    }

    /**
     * Gets the value of the autopaySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link AutopaySchedule }
     *     
     */
    public AutopaySchedule getAutopaySchedule() {
        return autopaySchedule;
    }

    /**
     * Sets the value of the autopaySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutopaySchedule }
     *     
     */
    public void setAutopaySchedule(AutopaySchedule value) {
        this.autopaySchedule = value;
    }

    /**
     * Gets the value of the numberOfAutopays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfAutopays() {
        return numberOfAutopays;
    }

    /**
     * Sets the value of the numberOfAutopays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfAutopays(Integer value) {
        this.numberOfAutopays = value;
    }

    /**
     * Gets the value of the autopayTriggerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutopayTriggerType() {
        return autopayTriggerType;
    }

    /**
     * Sets the value of the autopayTriggerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutopayTriggerType(String value) {
        this.autopayTriggerType = value;
    }

    /**
     * Gets the value of the actionUponCompletionOfAutopays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionUponCompletionOfAutopays() {
        return actionUponCompletionOfAutopays;
    }

    /**
     * Sets the value of the actionUponCompletionOfAutopays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionUponCompletionOfAutopays(String value) {
        this.actionUponCompletionOfAutopays = value;
    }

    /**
     * Gets the value of the clientsChargedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientsChargedOn() {
        return clientsChargedOn;
    }

    /**
     * Sets the value of the clientsChargedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientsChargedOn(String value) {
        this.clientsChargedOn = value;
    }

    /**
     * Gets the value of the clientsChargedOnSpecificDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClientsChargedOnSpecificDate() {
        return clientsChargedOnSpecificDate;
    }

    /**
     * Sets the value of the clientsChargedOnSpecificDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClientsChargedOnSpecificDate(XMLGregorianCalendar value) {
        this.clientsChargedOnSpecificDate = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepositAmount(BigDecimal value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the firstAutopayFree property.
     * 
     */
    public boolean isFirstAutopayFree() {
        return firstAutopayFree;
    }

    /**
     * Sets the value of the firstAutopayFree property.
     * 
     */
    public void setFirstAutopayFree(boolean value) {
        this.firstAutopayFree = value;
    }

    /**
     * Gets the value of the lastAutopayFree property.
     * 
     */
    public boolean isLastAutopayFree() {
        return lastAutopayFree;
    }

    /**
     * Sets the value of the lastAutopayFree property.
     * 
     */
    public void setLastAutopayFree(boolean value) {
        this.lastAutopayFree = value;
    }

    /**
     * Gets the value of the clientTerminateOnline property.
     * 
     */
    public boolean isClientTerminateOnline() {
        return clientTerminateOnline;
    }

    /**
     * Sets the value of the clientTerminateOnline property.
     * 
     */
    public void setClientTerminateOnline(boolean value) {
        this.clientTerminateOnline = value;
    }

    /**
     * Gets the value of the membershipTypeRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMembershipTypeRestriction }
     *     
     */
    public ArrayOfMembershipTypeRestriction getMembershipTypeRestrictions() {
        return membershipTypeRestrictions;
    }

    /**
     * Sets the value of the membershipTypeRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMembershipTypeRestriction }
     *     
     */
    public void setMembershipTypeRestrictions(ArrayOfMembershipTypeRestriction value) {
        this.membershipTypeRestrictions = value;
    }

    /**
     * Gets the value of the locationPurchaseRestrictionIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getLocationPurchaseRestrictionIds() {
        return locationPurchaseRestrictionIds;
    }

    /**
     * Sets the value of the locationPurchaseRestrictionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setLocationPurchaseRestrictionIds(ArrayOfInt value) {
        this.locationPurchaseRestrictionIds = value;
    }

    /**
     * Gets the value of the agreementTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementTerms() {
        return agreementTerms;
    }

    /**
     * Sets the value of the agreementTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementTerms(String value) {
        this.agreementTerms = value;
    }

    /**
     * Gets the value of the requiresElectronicConfirmation property.
     * 
     */
    public boolean isRequiresElectronicConfirmation() {
        return requiresElectronicConfirmation;
    }

    /**
     * Sets the value of the requiresElectronicConfirmation property.
     * 
     */
    public void setRequiresElectronicConfirmation(boolean value) {
        this.requiresElectronicConfirmation = value;
    }

    /**
     * Gets the value of the autopayEnabled property.
     * 
     */
    public boolean isAutopayEnabled() {
        return autopayEnabled;
    }

    /**
     * Sets the value of the autopayEnabled property.
     * 
     */
    public void setAutopayEnabled(boolean value) {
        this.autopayEnabled = value;
    }

    /**
     * Gets the value of the firstPaymentAmountSubtotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstPaymentAmountSubtotal() {
        return firstPaymentAmountSubtotal;
    }

    /**
     * Sets the value of the firstPaymentAmountSubtotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstPaymentAmountSubtotal(BigDecimal value) {
        this.firstPaymentAmountSubtotal = value;
    }

    /**
     * Gets the value of the firstPaymentAmountTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstPaymentAmountTax() {
        return firstPaymentAmountTax;
    }

    /**
     * Sets the value of the firstPaymentAmountTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstPaymentAmountTax(BigDecimal value) {
        this.firstPaymentAmountTax = value;
    }

    /**
     * Gets the value of the firstPaymentAmountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstPaymentAmountTotal() {
        return firstPaymentAmountTotal;
    }

    /**
     * Sets the value of the firstPaymentAmountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstPaymentAmountTotal(BigDecimal value) {
        this.firstPaymentAmountTotal = value;
    }

    /**
     * Gets the value of the recurringPaymentAmountSubtotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecurringPaymentAmountSubtotal() {
        return recurringPaymentAmountSubtotal;
    }

    /**
     * Sets the value of the recurringPaymentAmountSubtotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecurringPaymentAmountSubtotal(BigDecimal value) {
        this.recurringPaymentAmountSubtotal = value;
    }

    /**
     * Gets the value of the recurringPaymentAmountTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecurringPaymentAmountTax() {
        return recurringPaymentAmountTax;
    }

    /**
     * Sets the value of the recurringPaymentAmountTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecurringPaymentAmountTax(BigDecimal value) {
        this.recurringPaymentAmountTax = value;
    }

    /**
     * Gets the value of the recurringPaymentAmountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecurringPaymentAmountTotal() {
        return recurringPaymentAmountTotal;
    }

    /**
     * Sets the value of the recurringPaymentAmountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecurringPaymentAmountTotal(BigDecimal value) {
        this.recurringPaymentAmountTotal = value;
    }

    /**
     * Gets the value of the totalContractAmountSubtotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalContractAmountSubtotal() {
        return totalContractAmountSubtotal;
    }

    /**
     * Sets the value of the totalContractAmountSubtotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalContractAmountSubtotal(BigDecimal value) {
        this.totalContractAmountSubtotal = value;
    }

    /**
     * Gets the value of the totalContractAmountTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalContractAmountTax() {
        return totalContractAmountTax;
    }

    /**
     * Sets the value of the totalContractAmountTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalContractAmountTax(BigDecimal value) {
        this.totalContractAmountTax = value;
    }

    /**
     * Gets the value of the totalContractAmountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalContractAmountTotal() {
        return totalContractAmountTotal;
    }

    /**
     * Sets the value of the totalContractAmountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalContractAmountTotal(BigDecimal value) {
        this.totalContractAmountTotal = value;
    }

}
