
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Client complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Client">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBObject">
 *       &lt;sequence>
 *         &lt;element name="NewID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ClientIndexes" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfClientIndex" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileProvider" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClientCreditCard" type="{http://clients.mindbodyonline.com/api/0_5_1}ClientCreditCard" minOccurs="0"/>
 *         &lt;element name="LastFormulaNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppointmentGenderPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCompany" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClientRelationships" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfClientRelationship" minOccurs="0"/>
 *         &lt;element name="Reps" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfRep" minOccurs="0"/>
 *         &lt;element name="SaleReps" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfSalesRep" minOccurs="0"/>
 *         &lt;element name="CustomClientFields" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfCustomClientField" minOccurs="0"/>
 *         &lt;element name="LiabilityRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmergencyContactInfoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergencyContactInfoRelationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergencyContactInfoPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergencyContactInfoEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionalEmailOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Liability" type="{http://clients.mindbodyonline.com/api/0_5_1}Liability" minOccurs="0"/>
 *         &lt;element name="ProspectStage" type="{http://clients.mindbodyonline.com/api/0_5_1}ProspectStage" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MembershipIcon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://clients.mindbodyonline.com/api/0_5_1}ActionCode" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FirstAppointmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReferredBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeLocation" type="{http://clients.mindbodyonline.com/api/0_5_1}Location" minOccurs="0"/>
 *         &lt;element name="YellowAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RedAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhotoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsProspect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactMethod" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Client", propOrder = {
    "newID",
    "accountBalance",
    "clientIndexes",
    "username",
    "password",
    "notes",
    "mobileProvider",
    "clientCreditCard",
    "lastFormulaNotes",
    "appointmentGenderPreference",
    "gender",
    "isCompany",
    "inactive",
    "clientRelationships",
    "reps",
    "saleReps",
    "customClientFields",
    "liabilityRelease",
    "emergencyContactInfoName",
    "emergencyContactInfoRelationship",
    "emergencyContactInfoPhone",
    "emergencyContactInfoEmail",
    "promotionalEmailOptIn",
    "creationDate",
    "liability",
    "prospectStage",
    "uniqueID",
    "membershipIcon",
    "siteId",
    "action",
    "id",
    "firstName",
    "middleName",
    "lastName",
    "email",
    "emailOptIn",
    "addressLine1",
    "addressLine2",
    "city",
    "state",
    "postalCode",
    "country",
    "mobilePhone",
    "homePhone",
    "workPhone",
    "workExtension",
    "birthDate",
    "firstAppointmentDate",
    "referredBy",
    "homeLocation",
    "yellowAlert",
    "redAlert",
    "photoURL",
    "isProspect",
    "lastModifiedDateTime",
    "status",
    "contactMethod"
})
public class Client
    extends MBObject
{

    @XmlElement(name = "NewID")
    protected String newID;
    @XmlElement(name = "AccountBalance")
    protected Double accountBalance;
    @XmlElement(name = "ClientIndexes")
    protected ArrayOfClientIndex clientIndexes;
    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElementRef(name = "MobileProvider", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mobileProvider;
    @XmlElement(name = "ClientCreditCard")
    protected ClientCreditCard clientCreditCard;
    @XmlElement(name = "LastFormulaNotes")
    protected String lastFormulaNotes;
    @XmlElement(name = "AppointmentGenderPreference")
    protected String appointmentGenderPreference;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElementRef(name = "IsCompany", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCompany;
    @XmlElementRef(name = "Inactive", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> inactive;
    @XmlElement(name = "ClientRelationships")
    protected ArrayOfClientRelationship clientRelationships;
    @XmlElement(name = "Reps")
    protected ArrayOfRep reps;
    @XmlElement(name = "SaleReps")
    protected ArrayOfSalesRep saleReps;
    @XmlElement(name = "CustomClientFields")
    protected ArrayOfCustomClientField customClientFields;
    @XmlElementRef(name = "LiabilityRelease", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> liabilityRelease;
    @XmlElement(name = "EmergencyContactInfoName")
    protected String emergencyContactInfoName;
    @XmlElement(name = "EmergencyContactInfoRelationship")
    protected String emergencyContactInfoRelationship;
    @XmlElement(name = "EmergencyContactInfoPhone")
    protected String emergencyContactInfoPhone;
    @XmlElement(name = "EmergencyContactInfoEmail")
    protected String emergencyContactInfoEmail;
    @XmlElementRef(name = "PromotionalEmailOptIn", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> promotionalEmailOptIn;
    @XmlElementRef(name = "CreationDate", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> creationDate;
    @XmlElement(name = "Liability")
    protected Liability liability;
    @XmlElement(name = "ProspectStage")
    protected ProspectStage prospectStage;
    @XmlElement(name = "UniqueID")
    protected Long uniqueID;
    @XmlElement(name = "MembershipIcon")
    protected Integer membershipIcon;
    @XmlElementRef(name = "SiteId", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> siteId;
    @XmlElement(name = "Action")
    @XmlSchemaType(name = "string")
    protected ActionCode action;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElementRef(name = "EmailOptIn", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> emailOptIn;
    @XmlElement(name = "AddressLine1")
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "MobilePhone")
    protected String mobilePhone;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "WorkPhone")
    protected String workPhone;
    @XmlElement(name = "WorkExtension")
    protected String workExtension;
    @XmlElementRef(name = "BirthDate", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> birthDate;
    @XmlElementRef(name = "FirstAppointmentDate", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> firstAppointmentDate;
    @XmlElement(name = "ReferredBy")
    protected String referredBy;
    @XmlElement(name = "HomeLocation")
    protected Location homeLocation;
    @XmlElement(name = "YellowAlert")
    protected String yellowAlert;
    @XmlElement(name = "RedAlert")
    protected String redAlert;
    @XmlElement(name = "PhotoURL")
    protected String photoURL;
    @XmlElementRef(name = "IsProspect", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isProspect;
    @XmlElement(name = "LastModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDateTime;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "ContactMethod", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> contactMethod;

    /**
     * Gets the value of the newID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewID() {
        return newID;
    }

    /**
     * Sets the value of the newID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewID(String value) {
        this.newID = value;
    }

    /**
     * Gets the value of the accountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccountBalance(Double value) {
        this.accountBalance = value;
    }

    /**
     * Gets the value of the clientIndexes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClientIndex }
     *     
     */
    public ArrayOfClientIndex getClientIndexes() {
        return clientIndexes;
    }

    /**
     * Sets the value of the clientIndexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClientIndex }
     *     
     */
    public void setClientIndexes(ArrayOfClientIndex value) {
        this.clientIndexes = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the mobileProvider property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMobileProvider() {
        return mobileProvider;
    }

    /**
     * Sets the value of the mobileProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMobileProvider(JAXBElement<Integer> value) {
        this.mobileProvider = value;
    }

    /**
     * Gets the value of the clientCreditCard property.
     * 
     * @return
     *     possible object is
     *     {@link ClientCreditCard }
     *     
     */
    public ClientCreditCard getClientCreditCard() {
        return clientCreditCard;
    }

    /**
     * Sets the value of the clientCreditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientCreditCard }
     *     
     */
    public void setClientCreditCard(ClientCreditCard value) {
        this.clientCreditCard = value;
    }

    /**
     * Gets the value of the lastFormulaNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastFormulaNotes() {
        return lastFormulaNotes;
    }

    /**
     * Sets the value of the lastFormulaNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastFormulaNotes(String value) {
        this.lastFormulaNotes = value;
    }

    /**
     * Gets the value of the appointmentGenderPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentGenderPreference() {
        return appointmentGenderPreference;
    }

    /**
     * Sets the value of the appointmentGenderPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentGenderPreference(String value) {
        this.appointmentGenderPreference = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the isCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCompany() {
        return isCompany;
    }

    /**
     * Sets the value of the isCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCompany(JAXBElement<Boolean> value) {
        this.isCompany = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInactive(JAXBElement<Boolean> value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the clientRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClientRelationship }
     *     
     */
    public ArrayOfClientRelationship getClientRelationships() {
        return clientRelationships;
    }

    /**
     * Sets the value of the clientRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClientRelationship }
     *     
     */
    public void setClientRelationships(ArrayOfClientRelationship value) {
        this.clientRelationships = value;
    }

    /**
     * Gets the value of the reps property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRep }
     *     
     */
    public ArrayOfRep getReps() {
        return reps;
    }

    /**
     * Sets the value of the reps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRep }
     *     
     */
    public void setReps(ArrayOfRep value) {
        this.reps = value;
    }

    /**
     * Gets the value of the saleReps property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesRep }
     *     
     */
    public ArrayOfSalesRep getSaleReps() {
        return saleReps;
    }

    /**
     * Sets the value of the saleReps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesRep }
     *     
     */
    public void setSaleReps(ArrayOfSalesRep value) {
        this.saleReps = value;
    }

    /**
     * Gets the value of the customClientFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomClientField }
     *     
     */
    public ArrayOfCustomClientField getCustomClientFields() {
        return customClientFields;
    }

    /**
     * Sets the value of the customClientFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomClientField }
     *     
     */
    public void setCustomClientFields(ArrayOfCustomClientField value) {
        this.customClientFields = value;
    }

    /**
     * Gets the value of the liabilityRelease property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLiabilityRelease() {
        return liabilityRelease;
    }

    /**
     * Sets the value of the liabilityRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLiabilityRelease(JAXBElement<Boolean> value) {
        this.liabilityRelease = value;
    }

    /**
     * Gets the value of the emergencyContactInfoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactInfoName() {
        return emergencyContactInfoName;
    }

    /**
     * Sets the value of the emergencyContactInfoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactInfoName(String value) {
        this.emergencyContactInfoName = value;
    }

    /**
     * Gets the value of the emergencyContactInfoRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactInfoRelationship() {
        return emergencyContactInfoRelationship;
    }

    /**
     * Sets the value of the emergencyContactInfoRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactInfoRelationship(String value) {
        this.emergencyContactInfoRelationship = value;
    }

    /**
     * Gets the value of the emergencyContactInfoPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactInfoPhone() {
        return emergencyContactInfoPhone;
    }

    /**
     * Sets the value of the emergencyContactInfoPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactInfoPhone(String value) {
        this.emergencyContactInfoPhone = value;
    }

    /**
     * Gets the value of the emergencyContactInfoEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactInfoEmail() {
        return emergencyContactInfoEmail;
    }

    /**
     * Sets the value of the emergencyContactInfoEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactInfoEmail(String value) {
        this.emergencyContactInfoEmail = value;
    }

    /**
     * Gets the value of the promotionalEmailOptIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPromotionalEmailOptIn() {
        return promotionalEmailOptIn;
    }

    /**
     * Sets the value of the promotionalEmailOptIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPromotionalEmailOptIn(JAXBElement<Boolean> value) {
        this.promotionalEmailOptIn = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the liability property.
     * 
     * @return
     *     possible object is
     *     {@link Liability }
     *     
     */
    public Liability getLiability() {
        return liability;
    }

    /**
     * Sets the value of the liability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Liability }
     *     
     */
    public void setLiability(Liability value) {
        this.liability = value;
    }

    /**
     * Gets the value of the prospectStage property.
     * 
     * @return
     *     possible object is
     *     {@link ProspectStage }
     *     
     */
    public ProspectStage getProspectStage() {
        return prospectStage;
    }

    /**
     * Sets the value of the prospectStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProspectStage }
     *     
     */
    public void setProspectStage(ProspectStage value) {
        this.prospectStage = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUniqueID(Long value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the membershipIcon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMembershipIcon() {
        return membershipIcon;
    }

    /**
     * Sets the value of the membershipIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMembershipIcon(Integer value) {
        this.membershipIcon = value;
    }

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSiteId(JAXBElement<Integer> value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    public ActionCode getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setAction(ActionCode value) {
        this.action = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailOptIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEmailOptIn() {
        return emailOptIn;
    }

    /**
     * Sets the value of the emailOptIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEmailOptIn(JAXBElement<Boolean> value) {
        this.emailOptIn = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the workExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkExtension() {
        return workExtension;
    }

    /**
     * Sets the value of the workExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkExtension(String value) {
        this.workExtension = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBirthDate(JAXBElement<XMLGregorianCalendar> value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the firstAppointmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirstAppointmentDate() {
        return firstAppointmentDate;
    }

    /**
     * Sets the value of the firstAppointmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirstAppointmentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.firstAppointmentDate = value;
    }

    /**
     * Gets the value of the referredBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferredBy() {
        return referredBy;
    }

    /**
     * Sets the value of the referredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferredBy(String value) {
        this.referredBy = value;
    }

    /**
     * Gets the value of the homeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getHomeLocation() {
        return homeLocation;
    }

    /**
     * Sets the value of the homeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setHomeLocation(Location value) {
        this.homeLocation = value;
    }

    /**
     * Gets the value of the yellowAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYellowAlert() {
        return yellowAlert;
    }

    /**
     * Sets the value of the yellowAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYellowAlert(String value) {
        this.yellowAlert = value;
    }

    /**
     * Gets the value of the redAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedAlert() {
        return redAlert;
    }

    /**
     * Sets the value of the redAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedAlert(String value) {
        this.redAlert = value;
    }

    /**
     * Gets the value of the photoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoURL() {
        return photoURL;
    }

    /**
     * Sets the value of the photoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoURL(String value) {
        this.photoURL = value;
    }

    /**
     * Gets the value of the isProspect property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsProspect() {
        return isProspect;
    }

    /**
     * Sets the value of the isProspect property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsProspect(JAXBElement<Boolean> value) {
        this.isProspect = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDateTime(XMLGregorianCalendar value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the contactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getContactMethod() {
        return contactMethod;
    }

    /**
     * Sets the value of the contactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setContactMethod(JAXBElement<Short> value) {
        this.contactMethod = value;
    }

}
