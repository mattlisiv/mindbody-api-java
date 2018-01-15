
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mindbodyonline.clients.api._0_5_1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ClientIndexValueID_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "ID");
    private final static QName _ClientServiceExpirationDate_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "ExpirationDate");
    private final static QName _ClientServicePaymentDate_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "PaymentDate");
    private final static QName _ClientServiceActiveDate_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "ActiveDate");
    private final static QName _SalesRepSalesRepNumber_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "SalesRepNumber");
    private final static QName _StaffIndependentContractor_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "IndependentContractor");
    private final static QName _StaffReservationTrn_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "ReservationTrn");
    private final static QName _StaffAlwaysAllowDoubleBooking_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "AlwaysAllowDoubleBooking");
    private final static QName _StaffAppointmentTrn_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "AppointmentTrn");
    private final static QName _StaffMultiLocation_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "MultiLocation");
    private final static QName _LocationTax2_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "Tax2");
    private final static QName _LocationTax1_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "Tax1");
    private final static QName _LocationHasSite_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "HasSite");
    private final static QName _LocationCanBook_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "CanBook");
    private final static QName _LocationTax5_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "Tax5");
    private final static QName _LocationLongitude_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "Longitude");
    private final static QName _LocationDistanceInMiles_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "DistanceInMiles");
    private final static QName _LocationTax4_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "Tax4");
    private final static QName _LocationTax3_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "Tax3");
    private final static QName _LocationLatitude_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "Latitude");
    private final static QName _LocationTreatmentRooms_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "TreatmentRooms");
    private final static QName _LocationFacilitySquareFeet_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "FacilitySquareFeet");
    private final static QName _LocationBusinessID_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "BusinessID");
    private final static QName _SessionTypeSiteID_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "SiteID");
    private final static QName _AppointmentEndDateTime_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "EndDateTime");
    private final static QName _AppointmentFirstAppointment_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "FirstAppointment");
    private final static QName _AppointmentStartDateTime_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "StartDateTime");
    private final static QName _AppointmentStaffRequested_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "StaffRequested");
    private final static QName _ClientEmailOptIn_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "EmailOptIn");
    private final static QName _ClientIsProspect_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "IsProspect");
    private final static QName _ClientCreationDate_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "CreationDate");
    private final static QName _ClientSiteId_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "SiteId");
    private final static QName _ClientContactMethod_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "ContactMethod");
    private final static QName _ClientMobileProvider_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "MobileProvider");
    private final static QName _ClientPromotionalEmailOptIn_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "PromotionalEmailOptIn");
    private final static QName _ClientBirthDate_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "BirthDate");
    private final static QName _ClientIsCompany_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "IsCompany");
    private final static QName _ClientInactive_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "Inactive");
    private final static QName _ClientFirstAppointmentDate_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "FirstAppointmentDate");
    private final static QName _ClientLiabilityRelease_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "LiabilityRelease");
    private final static QName _SiteESA_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "ESA");
    private final static QName _SiteTaxInclusivePrices_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "TaxInclusivePrices");
    private final static QName _SiteTotalWOD_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "TotalWOD");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mindbodyonline.clients.api._0_5_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAppointmentOptions }
     * 
     */
    public GetAppointmentOptions createGetAppointmentOptions() {
        return new GetAppointmentOptions();
    }

    /**
     * Create an instance of {@link GetAppointmentOptionsRequest }
     * 
     */
    public GetAppointmentOptionsRequest createGetAppointmentOptionsRequest() {
        return new GetAppointmentOptionsRequest();
    }

    /**
     * Create an instance of {@link GetBookableItems }
     * 
     */
    public GetBookableItems createGetBookableItems() {
        return new GetBookableItems();
    }

    /**
     * Create an instance of {@link GetBookableItemsRequest }
     * 
     */
    public GetBookableItemsRequest createGetBookableItemsRequest() {
        return new GetBookableItemsRequest();
    }

    /**
     * Create an instance of {@link GetAppointmentOptionsResponse }
     * 
     */
    public GetAppointmentOptionsResponse createGetAppointmentOptionsResponse() {
        return new GetAppointmentOptionsResponse();
    }

    /**
     * Create an instance of {@link GetAppointmentOptionsResult }
     * 
     */
    public GetAppointmentOptionsResult createGetAppointmentOptionsResult() {
        return new GetAppointmentOptionsResult();
    }

    /**
     * Create an instance of {@link GetStaffAppointments }
     * 
     */
    public GetStaffAppointments createGetStaffAppointments() {
        return new GetStaffAppointments();
    }

    /**
     * Create an instance of {@link GetStaffAppointmentsRequest }
     * 
     */
    public GetStaffAppointmentsRequest createGetStaffAppointmentsRequest() {
        return new GetStaffAppointmentsRequest();
    }

    /**
     * Create an instance of {@link AddOrUpdateAvailabilitiesResponse }
     * 
     */
    public AddOrUpdateAvailabilitiesResponse createAddOrUpdateAvailabilitiesResponse() {
        return new AddOrUpdateAvailabilitiesResponse();
    }

    /**
     * Create an instance of {@link AddOrUpdateAvailabilitiesResult }
     * 
     */
    public AddOrUpdateAvailabilitiesResult createAddOrUpdateAvailabilitiesResult() {
        return new AddOrUpdateAvailabilitiesResult();
    }

    /**
     * Create an instance of {@link GetActiveSessionTimes }
     * 
     */
    public GetActiveSessionTimes createGetActiveSessionTimes() {
        return new GetActiveSessionTimes();
    }

    /**
     * Create an instance of {@link GetActiveSessionTimesRequest }
     * 
     */
    public GetActiveSessionTimesRequest createGetActiveSessionTimesRequest() {
        return new GetActiveSessionTimesRequest();
    }

    /**
     * Create an instance of {@link AddOrUpdateAppointmentsResponse }
     * 
     */
    public AddOrUpdateAppointmentsResponse createAddOrUpdateAppointmentsResponse() {
        return new AddOrUpdateAppointmentsResponse();
    }

    /**
     * Create an instance of {@link AddOrUpdateAppointmentsResult }
     * 
     */
    public AddOrUpdateAppointmentsResult createAddOrUpdateAppointmentsResult() {
        return new AddOrUpdateAppointmentsResult();
    }

    /**
     * Create an instance of {@link GetBookableItemsResponse }
     * 
     */
    public GetBookableItemsResponse createGetBookableItemsResponse() {
        return new GetBookableItemsResponse();
    }

    /**
     * Create an instance of {@link GetBookableItemsResult }
     * 
     */
    public GetBookableItemsResult createGetBookableItemsResult() {
        return new GetBookableItemsResult();
    }

    /**
     * Create an instance of {@link AddOrUpdateAppointments }
     * 
     */
    public AddOrUpdateAppointments createAddOrUpdateAppointments() {
        return new AddOrUpdateAppointments();
    }

    /**
     * Create an instance of {@link AddOrUpdateAppointmentsRequest }
     * 
     */
    public AddOrUpdateAppointmentsRequest createAddOrUpdateAppointmentsRequest() {
        return new AddOrUpdateAppointmentsRequest();
    }

    /**
     * Create an instance of {@link AddOrUpdateAvailabilities }
     * 
     */
    public AddOrUpdateAvailabilities createAddOrUpdateAvailabilities() {
        return new AddOrUpdateAvailabilities();
    }

    /**
     * Create an instance of {@link AddOrUpdateAvailabilitiesRequest }
     * 
     */
    public AddOrUpdateAvailabilitiesRequest createAddOrUpdateAvailabilitiesRequest() {
        return new AddOrUpdateAvailabilitiesRequest();
    }

    /**
     * Create an instance of {@link GetScheduleItemsResponse }
     * 
     */
    public GetScheduleItemsResponse createGetScheduleItemsResponse() {
        return new GetScheduleItemsResponse();
    }

    /**
     * Create an instance of {@link GetScheduleItemsResult }
     * 
     */
    public GetScheduleItemsResult createGetScheduleItemsResult() {
        return new GetScheduleItemsResult();
    }

    /**
     * Create an instance of {@link GetStaffAppointmentsResponse }
     * 
     */
    public GetStaffAppointmentsResponse createGetStaffAppointmentsResponse() {
        return new GetStaffAppointmentsResponse();
    }

    /**
     * Create an instance of {@link GetStaffAppointmentsResult }
     * 
     */
    public GetStaffAppointmentsResult createGetStaffAppointmentsResult() {
        return new GetStaffAppointmentsResult();
    }

    /**
     * Create an instance of {@link GetScheduleItems }
     * 
     */
    public GetScheduleItems createGetScheduleItems() {
        return new GetScheduleItems();
    }

    /**
     * Create an instance of {@link GetScheduleItemsRequest }
     * 
     */
    public GetScheduleItemsRequest createGetScheduleItemsRequest() {
        return new GetScheduleItemsRequest();
    }

    /**
     * Create an instance of {@link GetActiveSessionTimesResponse }
     * 
     */
    public GetActiveSessionTimesResponse createGetActiveSessionTimesResponse() {
        return new GetActiveSessionTimesResponse();
    }

    /**
     * Create an instance of {@link GetActiveSessionTimesResult }
     * 
     */
    public GetActiveSessionTimesResult createGetActiveSessionTimesResult() {
        return new GetActiveSessionTimesResult();
    }

    /**
     * Create an instance of {@link Appointment }
     * 
     */
    public Appointment createAppointment() {
        return new Appointment();
    }

    /**
     * Create an instance of {@link SourceCredentials }
     * 
     */
    public SourceCredentials createSourceCredentials() {
        return new SourceCredentials();
    }

    /**
     * Create an instance of {@link Staff }
     * 
     */
    public Staff createStaff() {
        return new Staff();
    }

    /**
     * Create an instance of {@link ProspectStage }
     * 
     */
    public ProspectStage createProspectStage() {
        return new ProspectStage();
    }

    /**
     * Create an instance of {@link MBRequest }
     * 
     */
    public MBRequest createMBRequest() {
        return new MBRequest();
    }

    /**
     * Create an instance of {@link Unavailability }
     * 
     */
    public Unavailability createUnavailability() {
        return new Unavailability();
    }

    /**
     * Create an instance of {@link ArrayOfLocation }
     * 
     */
    public ArrayOfLocation createArrayOfLocation() {
        return new ArrayOfLocation();
    }

    /**
     * Create an instance of {@link ProviderIDUpdate }
     * 
     */
    public ProviderIDUpdate createProviderIDUpdate() {
        return new ProviderIDUpdate();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link ArrayOfClientIndex }
     * 
     */
    public ArrayOfClientIndex createArrayOfClientIndex() {
        return new ArrayOfClientIndex();
    }

    /**
     * Create an instance of {@link Availability }
     * 
     */
    public Availability createAvailability() {
        return new Availability();
    }

    /**
     * Create an instance of {@link Program }
     * 
     */
    public Program createProgram() {
        return new Program();
    }

    /**
     * Create an instance of {@link ClientService }
     * 
     */
    public ClientService createClientService() {
        return new ClientService();
    }

    /**
     * Create an instance of {@link Resource }
     * 
     */
    public Resource createResource() {
        return new Resource();
    }

    /**
     * Create an instance of {@link ArrayOfRep }
     * 
     */
    public ArrayOfRep createArrayOfRep() {
        return new ArrayOfRep();
    }

    /**
     * Create an instance of {@link ArrayOfResource }
     * 
     */
    public ArrayOfResource createArrayOfResource() {
        return new ArrayOfResource();
    }

    /**
     * Create an instance of {@link ArrayOfAvailability }
     * 
     */
    public ArrayOfAvailability createArrayOfAvailability() {
        return new ArrayOfAvailability();
    }

    /**
     * Create an instance of {@link ArrayOfProgram }
     * 
     */
    public ArrayOfProgram createArrayOfProgram() {
        return new ArrayOfProgram();
    }

    /**
     * Create an instance of {@link ArrayOfStaff }
     * 
     */
    public ArrayOfStaff createArrayOfStaff() {
        return new ArrayOfStaff();
    }

    /**
     * Create an instance of {@link ClientIndexValue }
     * 
     */
    public ClientIndexValue createClientIndexValue() {
        return new ClientIndexValue();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link Site }
     * 
     */
    public Site createSite() {
        return new Site();
    }

    /**
     * Create an instance of {@link SessionType }
     * 
     */
    public SessionType createSessionType() {
        return new SessionType();
    }

    /**
     * Create an instance of {@link StaffCredentials }
     * 
     */
    public StaffCredentials createStaffCredentials() {
        return new StaffCredentials();
    }

    /**
     * Create an instance of {@link ArrayOfOption }
     * 
     */
    public ArrayOfOption createArrayOfOption() {
        return new ArrayOfOption();
    }

    /**
     * Create an instance of {@link ArrayOfDayOfWeek }
     * 
     */
    public ArrayOfDayOfWeek createArrayOfDayOfWeek() {
        return new ArrayOfDayOfWeek();
    }

    /**
     * Create an instance of {@link ArrayOfUnavailability }
     * 
     */
    public ArrayOfUnavailability createArrayOfUnavailability() {
        return new ArrayOfUnavailability();
    }

    /**
     * Create an instance of {@link MBObject }
     * 
     */
    public MBObject createMBObject() {
        return new MBObject();
    }

    /**
     * Create an instance of {@link ArrayOfScheduleItem }
     * 
     */
    public ArrayOfScheduleItem createArrayOfScheduleItem() {
        return new ArrayOfScheduleItem();
    }

    /**
     * Create an instance of {@link CustomClientField }
     * 
     */
    public CustomClientField createCustomClientField() {
        return new CustomClientField();
    }

    /**
     * Create an instance of {@link ArrayOfCustomClientField }
     * 
     */
    public ArrayOfCustomClientField createArrayOfCustomClientField() {
        return new ArrayOfCustomClientField();
    }

    /**
     * Create an instance of {@link ArrayOfProviderIDUpdate }
     * 
     */
    public ArrayOfProviderIDUpdate createArrayOfProviderIDUpdate() {
        return new ArrayOfProviderIDUpdate();
    }

    /**
     * Create an instance of {@link MBResult }
     * 
     */
    public MBResult createMBResult() {
        return new MBResult();
    }

    /**
     * Create an instance of {@link ClientRelationship }
     * 
     */
    public ClientRelationship createClientRelationship() {
        return new ClientRelationship();
    }

    /**
     * Create an instance of {@link ArrayOfClientRelationship }
     * 
     */
    public ArrayOfClientRelationship createArrayOfClientRelationship() {
        return new ArrayOfClientRelationship();
    }

    /**
     * Create an instance of {@link ArrayOfAppointment }
     * 
     */
    public ArrayOfAppointment createArrayOfAppointment() {
        return new ArrayOfAppointment();
    }

    /**
     * Create an instance of {@link SalesRep }
     * 
     */
    public SalesRep createSalesRep() {
        return new SalesRep();
    }

    /**
     * Create an instance of {@link ScheduleItem }
     * 
     */
    public ScheduleItem createScheduleItem() {
        return new ScheduleItem();
    }

    /**
     * Create an instance of {@link ClientCreditCard }
     * 
     */
    public ClientCreditCard createClientCreditCard() {
        return new ClientCreditCard();
    }

    /**
     * Create an instance of {@link ClientIndex }
     * 
     */
    public ClientIndex createClientIndex() {
        return new ClientIndex();
    }

    /**
     * Create an instance of {@link Liability }
     * 
     */
    public Liability createLiability() {
        return new Liability();
    }

    /**
     * Create an instance of {@link ArrayOfDateTime }
     * 
     */
    public ArrayOfDateTime createArrayOfDateTime() {
        return new ArrayOfDateTime();
    }

    /**
     * Create an instance of {@link ArrayOfSalesRep }
     * 
     */
    public ArrayOfSalesRep createArrayOfSalesRep() {
        return new ArrayOfSalesRep();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link Relationship }
     * 
     */
    public Relationship createRelationship() {
        return new Relationship();
    }

    /**
     * Create an instance of {@link UserCredentials }
     * 
     */
    public UserCredentials createUserCredentials() {
        return new UserCredentials();
    }

    /**
     * Create an instance of {@link ArrayOfClientIndexValue }
     * 
     */
    public ArrayOfClientIndexValue createArrayOfClientIndexValue() {
        return new ArrayOfClientIndexValue();
    }

    /**
     * Create an instance of {@link ArrayOfInt }
     * 
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
    }

    /**
     * Create an instance of {@link Rep }
     * 
     */
    public Rep createRep() {
        return new Rep();
    }

    /**
     * Create an instance of {@link ArrayOfLong }
     * 
     */
    public ArrayOfLong createArrayOfLong() {
        return new ArrayOfLong();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = ClientIndexValue.class)
    public JAXBElement<Integer> createClientIndexValueID(Integer value) {
        return new JAXBElement<Integer>(_ClientIndexValueID_QNAME, Integer.class, ClientIndexValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ExpirationDate", scope = ClientService.class)
    public JAXBElement<XMLGregorianCalendar> createClientServiceExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClientServiceExpirationDate_QNAME, XMLGregorianCalendar.class, ClientService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "PaymentDate", scope = ClientService.class)
    public JAXBElement<XMLGregorianCalendar> createClientServicePaymentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClientServicePaymentDate_QNAME, XMLGregorianCalendar.class, ClientService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ActiveDate", scope = ClientService.class)
    public JAXBElement<XMLGregorianCalendar> createClientServiceActiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClientServiceActiveDate_QNAME, XMLGregorianCalendar.class, ClientService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = ClientService.class)
    public JAXBElement<Long> createClientServiceID(Long value) {
        return new JAXBElement<Long>(_ClientIndexValueID_QNAME, Long.class, ClientService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "SalesRepNumber", scope = SalesRep.class)
    public JAXBElement<Integer> createSalesRepSalesRepNumber(Integer value) {
        return new JAXBElement<Integer>(_SalesRepSalesRepNumber_QNAME, Integer.class, SalesRep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "IndependentContractor", scope = Staff.class)
    public JAXBElement<Boolean> createStaffIndependentContractor(Boolean value) {
        return new JAXBElement<Boolean>(_StaffIndependentContractor_QNAME, Boolean.class, Staff.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ReservationTrn", scope = Staff.class)
    public JAXBElement<Boolean> createStaffReservationTrn(Boolean value) {
        return new JAXBElement<Boolean>(_StaffReservationTrn_QNAME, Boolean.class, Staff.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "AlwaysAllowDoubleBooking", scope = Staff.class)
    public JAXBElement<Boolean> createStaffAlwaysAllowDoubleBooking(Boolean value) {
        return new JAXBElement<Boolean>(_StaffAlwaysAllowDoubleBooking_QNAME, Boolean.class, Staff.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "AppointmentTrn", scope = Staff.class)
    public JAXBElement<Boolean> createStaffAppointmentTrn(Boolean value) {
        return new JAXBElement<Boolean>(_StaffAppointmentTrn_QNAME, Boolean.class, Staff.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "MultiLocation", scope = Staff.class)
    public JAXBElement<Boolean> createStaffMultiLocation(Boolean value) {
        return new JAXBElement<Boolean>(_StaffMultiLocation_QNAME, Boolean.class, Staff.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = Staff.class)
    public JAXBElement<Long> createStaffID(Long value) {
        return new JAXBElement<Long>(_ClientIndexValueID_QNAME, Long.class, Staff.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "Tax2", scope = Location.class)
    public JAXBElement<Float> createLocationTax2(Float value) {
        return new JAXBElement<Float>(_LocationTax2_QNAME, Float.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "Tax1", scope = Location.class)
    public JAXBElement<Float> createLocationTax1(Float value) {
        return new JAXBElement<Float>(_LocationTax1_QNAME, Float.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "HasSite", scope = Location.class)
    public JAXBElement<Boolean> createLocationHasSite(Boolean value) {
        return new JAXBElement<Boolean>(_LocationHasSite_QNAME, Boolean.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "CanBook", scope = Location.class)
    public JAXBElement<Boolean> createLocationCanBook(Boolean value) {
        return new JAXBElement<Boolean>(_LocationCanBook_QNAME, Boolean.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "Tax5", scope = Location.class)
    public JAXBElement<Float> createLocationTax5(Float value) {
        return new JAXBElement<Float>(_LocationTax5_QNAME, Float.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "Longitude", scope = Location.class)
    public JAXBElement<Double> createLocationLongitude(Double value) {
        return new JAXBElement<Double>(_LocationLongitude_QNAME, Double.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "DistanceInMiles", scope = Location.class)
    public JAXBElement<Double> createLocationDistanceInMiles(Double value) {
        return new JAXBElement<Double>(_LocationDistanceInMiles_QNAME, Double.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "Tax4", scope = Location.class)
    public JAXBElement<Float> createLocationTax4(Float value) {
        return new JAXBElement<Float>(_LocationTax4_QNAME, Float.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "Tax3", scope = Location.class)
    public JAXBElement<Float> createLocationTax3(Float value) {
        return new JAXBElement<Float>(_LocationTax3_QNAME, Float.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "Latitude", scope = Location.class)
    public JAXBElement<Double> createLocationLatitude(Double value) {
        return new JAXBElement<Double>(_LocationLatitude_QNAME, Double.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "TreatmentRooms", scope = Location.class)
    public JAXBElement<Integer> createLocationTreatmentRooms(Integer value) {
        return new JAXBElement<Integer>(_LocationTreatmentRooms_QNAME, Integer.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "FacilitySquareFeet", scope = Location.class)
    public JAXBElement<Integer> createLocationFacilitySquareFeet(Integer value) {
        return new JAXBElement<Integer>(_LocationFacilitySquareFeet_QNAME, Integer.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "BusinessID", scope = Location.class)
    public JAXBElement<Integer> createLocationBusinessID(Integer value) {
        return new JAXBElement<Integer>(_LocationBusinessID_QNAME, Integer.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = Location.class)
    public JAXBElement<Integer> createLocationID(Integer value) {
        return new JAXBElement<Integer>(_ClientIndexValueID_QNAME, Integer.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = ClientIndex.class)
    public JAXBElement<Integer> createClientIndexID(Integer value) {
        return new JAXBElement<Integer>(_ClientIndexValueID_QNAME, Integer.class, ClientIndex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "SiteID", scope = SessionType.class)
    public JAXBElement<Integer> createSessionTypeSiteID(Integer value) {
        return new JAXBElement<Integer>(_SessionTypeSiteID_QNAME, Integer.class, SessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = SessionType.class)
    public JAXBElement<Integer> createSessionTypeID(Integer value) {
        return new JAXBElement<Integer>(_ClientIndexValueID_QNAME, Integer.class, SessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "EndDateTime", scope = Appointment.class)
    public JAXBElement<XMLGregorianCalendar> createAppointmentEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AppointmentEndDateTime_QNAME, XMLGregorianCalendar.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "FirstAppointment", scope = Appointment.class)
    public JAXBElement<Boolean> createAppointmentFirstAppointment(Boolean value) {
        return new JAXBElement<Boolean>(_AppointmentFirstAppointment_QNAME, Boolean.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "StartDateTime", scope = Appointment.class)
    public JAXBElement<XMLGregorianCalendar> createAppointmentStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AppointmentStartDateTime_QNAME, XMLGregorianCalendar.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "StaffRequested", scope = Appointment.class)
    public JAXBElement<Boolean> createAppointmentStaffRequested(Boolean value) {
        return new JAXBElement<Boolean>(_AppointmentStaffRequested_QNAME, Boolean.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = Appointment.class)
    public JAXBElement<Long> createAppointmentID(Long value) {
        return new JAXBElement<Long>(_ClientIndexValueID_QNAME, Long.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "EmailOptIn", scope = Client.class)
    public JAXBElement<Boolean> createClientEmailOptIn(Boolean value) {
        return new JAXBElement<Boolean>(_ClientEmailOptIn_QNAME, Boolean.class, Client.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "IsProspect", scope = Client.class)
    public JAXBElement<Boolean> createClientIsProspect(Boolean value) {
        return new JAXBElement<Boolean>(_ClientIsProspect_QNAME, Boolean.class, Client.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "CreationDate", scope = Client.class)
    public JAXBElement<XMLGregorianCalendar> createClientCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClientCreationDate_QNAME, XMLGregorianCalendar.class, Client.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "SiteId", scope = Client.class)
    public JAXBElement<Integer> createClientSiteId(Integer value) {
        return new JAXBElement<Integer>(_ClientSiteId_QNAME, Integer.class, Client.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ContactMethod", scope = Client.class)
    public JAXBElement<Short> createClientContactMethod(Short value) {
        return new JAXBElement<Short>(_ClientContactMethod_QNAME, Short.class, Client.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "MobileProvider", scope = Client.class)
    public JAXBElement<Integer> createClientMobileProvider(Integer value) {
        return new JAXBElement<Integer>(_ClientMobileProvider_QNAME, Integer.class, Client.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "PromotionalEmailOptIn", scope = Client.class)
    public JAXBElement<Boolean> createClientPromotionalEmailOptIn(Boolean value) {
        return new JAXBElement<Boolean>(_ClientPromotionalEmailOptIn_QNAME, Boolean.class, Client.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "BirthDate", scope = Client.class)
    public JAXBElement<XMLGregorianCalendar> createClientBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClientBirthDate_QNAME, XMLGregorianCalendar.class, Client.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "IsCompany", scope = Client.class)
    public JAXBElement<Boolean> createClientIsCompany(Boolean value) {
        return new JAXBElement<Boolean>(_ClientIsCompany_QNAME, Boolean.class, Client.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "Inactive", scope = Client.class)
    public JAXBElement<Boolean> createClientInactive(Boolean value) {
        return new JAXBElement<Boolean>(_ClientInactive_QNAME, Boolean.class, Client.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "FirstAppointmentDate", scope = Client.class)
    public JAXBElement<XMLGregorianCalendar> createClientFirstAppointmentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClientFirstAppointmentDate_QNAME, XMLGregorianCalendar.class, Client.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "LiabilityRelease", scope = Client.class)
    public JAXBElement<Boolean> createClientLiabilityRelease(Boolean value) {
        return new JAXBElement<Boolean>(_ClientLiabilityRelease_QNAME, Boolean.class, Client.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ESA", scope = Site.class)
    public JAXBElement<Boolean> createSiteESA(Boolean value) {
        return new JAXBElement<Boolean>(_SiteESA_QNAME, Boolean.class, Site.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "TaxInclusivePrices", scope = Site.class)
    public JAXBElement<Boolean> createSiteTaxInclusivePrices(Boolean value) {
        return new JAXBElement<Boolean>(_SiteTaxInclusivePrices_QNAME, Boolean.class, Site.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "TotalWOD", scope = Site.class)
    public JAXBElement<Boolean> createSiteTotalWOD(Boolean value) {
        return new JAXBElement<Boolean>(_SiteTotalWOD_QNAME, Boolean.class, Site.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = Resource.class)
    public JAXBElement<Integer> createResourceID(Integer value) {
        return new JAXBElement<Integer>(_ClientIndexValueID_QNAME, Integer.class, Resource.class, value);
    }

}
