
package com.mindbodyonline.clients.api._0_5_1.site_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
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

    private final static QName _SessionTypeSiteID_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "SiteID");
    private final static QName _SessionTypeID_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "ID");
    private final static QName _SiteESA_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "ESA");
    private final static QName _SiteTaxInclusivePrices_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "TaxInclusivePrices");
    private final static QName _SiteTotalWOD_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "TotalWOD");
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

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mindbodyonline.clients.api._0_5_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLocationsResponse }
     * 
     */
    public GetLocationsResponse createGetLocationsResponse() {
        return new GetLocationsResponse();
    }

    /**
     * Create an instance of {@link GetLocationsResult }
     * 
     */
    public GetLocationsResult createGetLocationsResult() {
        return new GetLocationsResult();
    }

    /**
     * Create an instance of {@link GetGendersResponse }
     * 
     */
    public GetGendersResponse createGetGendersResponse() {
        return new GetGendersResponse();
    }

    /**
     * Create an instance of {@link GetGendersResult }
     * 
     */
    public GetGendersResult createGetGendersResult() {
        return new GetGendersResult();
    }

    /**
     * Create an instance of {@link GetSites }
     * 
     */
    public GetSites createGetSites() {
        return new GetSites();
    }

    /**
     * Create an instance of {@link GetSitesRequest }
     * 
     */
    public GetSitesRequest createGetSitesRequest() {
        return new GetSitesRequest();
    }

    /**
     * Create an instance of {@link GetResourceSchedule }
     * 
     */
    public GetResourceSchedule createGetResourceSchedule() {
        return new GetResourceSchedule();
    }

    /**
     * Create an instance of {@link GetResourceScheduleRequest }
     * 
     */
    public GetResourceScheduleRequest createGetResourceScheduleRequest() {
        return new GetResourceScheduleRequest();
    }

    /**
     * Create an instance of {@link GetProgramsResponse }
     * 
     */
    public GetProgramsResponse createGetProgramsResponse() {
        return new GetProgramsResponse();
    }

    /**
     * Create an instance of {@link GetProgramsResult }
     * 
     */
    public GetProgramsResult createGetProgramsResult() {
        return new GetProgramsResult();
    }

    /**
     * Create an instance of {@link GetResources }
     * 
     */
    public GetResources createGetResources() {
        return new GetResources();
    }

    /**
     * Create an instance of {@link GetResourcesRequest }
     * 
     */
    public GetResourcesRequest createGetResourcesRequest() {
        return new GetResourcesRequest();
    }

    /**
     * Create an instance of {@link GetRelationships }
     * 
     */
    public GetRelationships createGetRelationships() {
        return new GetRelationships();
    }

    /**
     * Create an instance of {@link GetRelationshipsRequest }
     * 
     */
    public GetRelationshipsRequest createGetRelationshipsRequest() {
        return new GetRelationshipsRequest();
    }

    /**
     * Create an instance of {@link GetGenders }
     * 
     */
    public GetGenders createGetGenders() {
        return new GetGenders();
    }

    /**
     * Create an instance of {@link GetGendersRequest }
     * 
     */
    public GetGendersRequest createGetGendersRequest() {
        return new GetGendersRequest();
    }

    /**
     * Create an instance of {@link GetProspectStages }
     * 
     */
    public GetProspectStages createGetProspectStages() {
        return new GetProspectStages();
    }

    /**
     * Create an instance of {@link GetProspectStagesRequest }
     * 
     */
    public GetProspectStagesRequest createGetProspectStagesRequest() {
        return new GetProspectStagesRequest();
    }

    /**
     * Create an instance of {@link GetActivationCode }
     * 
     */
    public GetActivationCode createGetActivationCode() {
        return new GetActivationCode();
    }

    /**
     * Create an instance of {@link GetActivationCodeRequest }
     * 
     */
    public GetActivationCodeRequest createGetActivationCodeRequest() {
        return new GetActivationCodeRequest();
    }

    /**
     * Create an instance of {@link GetResourcesResponse }
     * 
     */
    public GetResourcesResponse createGetResourcesResponse() {
        return new GetResourcesResponse();
    }

    /**
     * Create an instance of {@link GetResourcesResult }
     * 
     */
    public GetResourcesResult createGetResourcesResult() {
        return new GetResourcesResult();
    }

    /**
     * Create an instance of {@link GetMobileProviders }
     * 
     */
    public GetMobileProviders createGetMobileProviders() {
        return new GetMobileProviders();
    }

    /**
     * Create an instance of {@link GetMobileProvidersRequest }
     * 
     */
    public GetMobileProvidersRequest createGetMobileProvidersRequest() {
        return new GetMobileProvidersRequest();
    }

    /**
     * Create an instance of {@link GetSitesResponse }
     * 
     */
    public GetSitesResponse createGetSitesResponse() {
        return new GetSitesResponse();
    }

    /**
     * Create an instance of {@link GetSitesResult }
     * 
     */
    public GetSitesResult createGetSitesResult() {
        return new GetSitesResult();
    }

    /**
     * Create an instance of {@link GetSessionTypesResponse }
     * 
     */
    public GetSessionTypesResponse createGetSessionTypesResponse() {
        return new GetSessionTypesResponse();
    }

    /**
     * Create an instance of {@link GetSessionTypesResult }
     * 
     */
    public GetSessionTypesResult createGetSessionTypesResult() {
        return new GetSessionTypesResult();
    }

    /**
     * Create an instance of {@link GetProspectStagesResponse }
     * 
     */
    public GetProspectStagesResponse createGetProspectStagesResponse() {
        return new GetProspectStagesResponse();
    }

    /**
     * Create an instance of {@link GetProspectStagesResult }
     * 
     */
    public GetProspectStagesResult createGetProspectStagesResult() {
        return new GetProspectStagesResult();
    }

    /**
     * Create an instance of {@link GetLocations }
     * 
     */
    public GetLocations createGetLocations() {
        return new GetLocations();
    }

    /**
     * Create an instance of {@link GetLocationsRequest }
     * 
     */
    public GetLocationsRequest createGetLocationsRequest() {
        return new GetLocationsRequest();
    }

    /**
     * Create an instance of {@link ReserveResource }
     * 
     */
    public ReserveResource createReserveResource() {
        return new ReserveResource();
    }

    /**
     * Create an instance of {@link ReserveResourceRequest }
     * 
     */
    public ReserveResourceRequest createReserveResourceRequest() {
        return new ReserveResourceRequest();
    }

    /**
     * Create an instance of {@link ReserveResourceResponse }
     * 
     */
    public ReserveResourceResponse createReserveResourceResponse() {
        return new ReserveResourceResponse();
    }

    /**
     * Create an instance of {@link ReserveResourceResult }
     * 
     */
    public ReserveResourceResult createReserveResourceResult() {
        return new ReserveResourceResult();
    }

    /**
     * Create an instance of {@link GetActivationCodeResponse }
     * 
     */
    public GetActivationCodeResponse createGetActivationCodeResponse() {
        return new GetActivationCodeResponse();
    }

    /**
     * Create an instance of {@link GetActivationCodeResult }
     * 
     */
    public GetActivationCodeResult createGetActivationCodeResult() {
        return new GetActivationCodeResult();
    }

    /**
     * Create an instance of {@link GetSessionTypes }
     * 
     */
    public GetSessionTypes createGetSessionTypes() {
        return new GetSessionTypes();
    }

    /**
     * Create an instance of {@link GetSessionTypesRequest }
     * 
     */
    public GetSessionTypesRequest createGetSessionTypesRequest() {
        return new GetSessionTypesRequest();
    }

    /**
     * Create an instance of {@link GetRelationshipsResponse }
     * 
     */
    public GetRelationshipsResponse createGetRelationshipsResponse() {
        return new GetRelationshipsResponse();
    }

    /**
     * Create an instance of {@link GetRelationshipsResult }
     * 
     */
    public GetRelationshipsResult createGetRelationshipsResult() {
        return new GetRelationshipsResult();
    }

    /**
     * Create an instance of {@link GetResourceScheduleResponse }
     * 
     */
    public GetResourceScheduleResponse createGetResourceScheduleResponse() {
        return new GetResourceScheduleResponse();
    }

    /**
     * Create an instance of {@link GetResourceScheduleResult }
     * 
     */
    public GetResourceScheduleResult createGetResourceScheduleResult() {
        return new GetResourceScheduleResult();
    }

    /**
     * Create an instance of {@link GetMobileProvidersResponse }
     * 
     */
    public GetMobileProvidersResponse createGetMobileProvidersResponse() {
        return new GetMobileProvidersResponse();
    }

    /**
     * Create an instance of {@link GetMobileProvidersResult }
     * 
     */
    public GetMobileProvidersResult createGetMobileProvidersResult() {
        return new GetMobileProvidersResult();
    }

    /**
     * Create an instance of {@link GetPrograms }
     * 
     */
    public GetPrograms createGetPrograms() {
        return new GetPrograms();
    }

    /**
     * Create an instance of {@link GetProgramsRequest }
     * 
     */
    public GetProgramsRequest createGetProgramsRequest() {
        return new GetProgramsRequest();
    }

    /**
     * Create an instance of {@link SourceCredentials }
     * 
     */
    public SourceCredentials createSourceCredentials() {
        return new SourceCredentials();
    }

    /**
     * Create an instance of {@link ArrayOfSessionType }
     * 
     */
    public ArrayOfSessionType createArrayOfSessionType() {
        return new ArrayOfSessionType();
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
     * Create an instance of {@link ArrayOfLocation }
     * 
     */
    public ArrayOfLocation createArrayOfLocation() {
        return new ArrayOfLocation();
    }

    /**
     * Create an instance of {@link MobileProvider }
     * 
     */
    public MobileProvider createMobileProvider() {
        return new MobileProvider();
    }

    /**
     * Create an instance of {@link ArrayOfSite }
     * 
     */
    public ArrayOfSite createArrayOfSite() {
        return new ArrayOfSite();
    }

    /**
     * Create an instance of {@link Program }
     * 
     */
    public Program createProgram() {
        return new Program();
    }

    /**
     * Create an instance of {@link Resource }
     * 
     */
    public Resource createResource() {
        return new Resource();
    }

    /**
     * Create an instance of {@link ArrayOfResource }
     * 
     */
    public ArrayOfResource createArrayOfResource() {
        return new ArrayOfResource();
    }

    /**
     * Create an instance of {@link ArrayOfProgram }
     * 
     */
    public ArrayOfProgram createArrayOfProgram() {
        return new ArrayOfProgram();
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
     * Create an instance of {@link ArrayOfProspectStage }
     * 
     */
    public ArrayOfProspectStage createArrayOfProspectStage() {
        return new ArrayOfProspectStage();
    }

    /**
     * Create an instance of {@link MBObject }
     * 
     */
    public MBObject createMBObject() {
        return new MBObject();
    }

    /**
     * Create an instance of {@link ArrayOfMobileProvider }
     * 
     */
    public ArrayOfMobileProvider createArrayOfMobileProvider() {
        return new ArrayOfMobileProvider();
    }

    /**
     * Create an instance of {@link MBResult }
     * 
     */
    public MBResult createMBResult() {
        return new MBResult();
    }

    /**
     * Create an instance of {@link GenderOption }
     * 
     */
    public GenderOption createGenderOption() {
        return new GenderOption();
    }

    /**
     * Create an instance of {@link ArrayOfRelationship }
     * 
     */
    public ArrayOfRelationship createArrayOfRelationship() {
        return new ArrayOfRelationship();
    }

    /**
     * Create an instance of {@link ArrayOfGenderOption }
     * 
     */
    public ArrayOfGenderOption createArrayOfGenderOption() {
        return new ArrayOfGenderOption();
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
     * Create an instance of {@link ArrayOfInt }
     * 
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
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
        return new JAXBElement<Integer>(_SessionTypeID_QNAME, Integer.class, SessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = Resource.class)
    public JAXBElement<Integer> createResourceID(Integer value) {
        return new JAXBElement<Integer>(_SessionTypeID_QNAME, Integer.class, Resource.class, value);
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
        return new JAXBElement<Integer>(_SessionTypeID_QNAME, Integer.class, Location.class, value);
    }

}
