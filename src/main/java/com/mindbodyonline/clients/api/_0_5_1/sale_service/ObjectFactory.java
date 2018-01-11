
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import java.math.BigDecimal;
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

    private final static QName _CartItemQuantity_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "Quantity");
    private final static QName _CartItemID_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "ID");
    private final static QName _ProductPrice_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "Price");
    private final static QName _ProductGroupID_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "GroupID");
    private final static QName _ProductTaxIncluded_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "TaxIncluded");
    private final static QName _ProductOnlinePrice_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "OnlinePrice");
    private final static QName _VisitLastModifiedDateTime_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "LastModifiedDateTime");
    private final static QName _VisitMakeUp_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "MakeUp");
    private final static QName _VisitSignedIn_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "SignedIn");
    private final static QName _SiteESA_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "ESA");
    private final static QName _SiteTaxInclusivePrices_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "TaxInclusivePrices");
    private final static QName _SiteTotalWOD_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "TotalWOD");
    private final static QName _ContractAssignsMembershipId_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "AssignsMembershipId");
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
    private final static QName _ServiceProgramID_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "ProgramID");
    private final static QName _ServiceCount_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "Count");
    private final static QName _SessionTypeSiteID_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "SiteID");
    private final static QName _ClassDescriptionLastUpdated_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "LastUpdated");
    private final static QName _ClassEndDateTime_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "EndDateTime");
    private final static QName _ClassSemesterID_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "SemesterID");
    private final static QName _ClassIsAvailable_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "IsAvailable");
    private final static QName _ClassStartDateTime_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "StartDateTime");
    private final static QName _SalesRepSalesRepNumber_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "SalesRepNumber");
    private final static QName _AppointmentFirstAppointment_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "FirstAppointment");
    private final static QName _AppointmentStaffRequested_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "StaffRequested");
    private final static QName _StaffIndependentContractor_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "IndependentContractor");
    private final static QName _StaffReservationTrn_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "ReservationTrn");
    private final static QName _StaffAlwaysAllowDoubleBooking_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "AlwaysAllowDoubleBooking");
    private final static QName _StaffAppointmentTrn_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "AppointmentTrn");
    private final static QName _StaffMultiLocation_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "MultiLocation");
    private final static QName _ClientServiceExpirationDate_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "ExpirationDate");
    private final static QName _ClientServicePaymentDate_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "PaymentDate");
    private final static QName _ClientServiceActiveDate_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "ActiveDate");
    private final static QName _CreditCardInfoAmount_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "Amount");
    private final static QName _CreditCardInfoSaveInfo_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "SaveInfo");
    private final static QName _ClassScheduleDayTuesday_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "DayTuesday");
    private final static QName _ClassScheduleEndTime_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "EndTime");
    private final static QName _ClassScheduleDayFriday_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "DayFriday");
    private final static QName _ClassScheduleEndDate_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "EndDate");
    private final static QName _ClassScheduleDayThursday_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "DayThursday");
    private final static QName _ClassScheduleStartTime_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "StartTime");
    private final static QName _ClassScheduleDayMonday_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "DayMonday");
    private final static QName _ClassScheduleDayWednesday_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "DayWednesday");
    private final static QName _ClassScheduleDaySaturday_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "DaySaturday");
    private final static QName _ClassScheduleStartDate_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "StartDate");
    private final static QName _ClassScheduleDaySunday_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "DaySunday");
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
    private final static QName _ShoppingCartDiscountTotal_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "DiscountTotal");
    private final static QName _ShoppingCartGrandTotal_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "GrandTotal");
    private final static QName _ShoppingCartTaxTotal_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "TaxTotal");
    private final static QName _ShoppingCartSubTotal_QNAME = new QName("http://clients.mindbodyonline.com/api/0_5_1", "SubTotal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mindbodyonline.clients.api._0_5_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPackagesResponse }
     * 
     */
    public GetPackagesResponse createGetPackagesResponse() {
        return new GetPackagesResponse();
    }

    /**
     * Create an instance of {@link GetPackagesResult }
     * 
     */
    public GetPackagesResult createGetPackagesResult() {
        return new GetPackagesResult();
    }

    /**
     * Create an instance of {@link GetSalesResponse }
     * 
     */
    public GetSalesResponse createGetSalesResponse() {
        return new GetSalesResponse();
    }

    /**
     * Create an instance of {@link GetSalesResult }
     * 
     */
    public GetSalesResult createGetSalesResult() {
        return new GetSalesResult();
    }

    /**
     * Create an instance of {@link GetPackages }
     * 
     */
    public GetPackages createGetPackages() {
        return new GetPackages();
    }

    /**
     * Create an instance of {@link GetPackagesRequest }
     * 
     */
    public GetPackagesRequest createGetPackagesRequest() {
        return new GetPackagesRequest();
    }

    /**
     * Create an instance of {@link GetCustomPaymentMethodsResponse }
     * 
     */
    public GetCustomPaymentMethodsResponse createGetCustomPaymentMethodsResponse() {
        return new GetCustomPaymentMethodsResponse();
    }

    /**
     * Create an instance of {@link GetCustomPaymentMethodsResult }
     * 
     */
    public GetCustomPaymentMethodsResult createGetCustomPaymentMethodsResult() {
        return new GetCustomPaymentMethodsResult();
    }

    /**
     * Create an instance of {@link GetAcceptedCardType }
     * 
     */
    public GetAcceptedCardType createGetAcceptedCardType() {
        return new GetAcceptedCardType();
    }

    /**
     * Create an instance of {@link GetAcceptedCardTypeRequest }
     * 
     */
    public GetAcceptedCardTypeRequest createGetAcceptedCardTypeRequest() {
        return new GetAcceptedCardTypeRequest();
    }

    /**
     * Create an instance of {@link CheckoutShoppingCart }
     * 
     */
    public CheckoutShoppingCart createCheckoutShoppingCart() {
        return new CheckoutShoppingCart();
    }

    /**
     * Create an instance of {@link CheckoutShoppingCartRequest }
     * 
     */
    public CheckoutShoppingCartRequest createCheckoutShoppingCartRequest() {
        return new CheckoutShoppingCartRequest();
    }

    /**
     * Create an instance of {@link GetSales }
     * 
     */
    public GetSales createGetSales() {
        return new GetSales();
    }

    /**
     * Create an instance of {@link GetSalesRequest }
     * 
     */
    public GetSalesRequest createGetSalesRequest() {
        return new GetSalesRequest();
    }

    /**
     * Create an instance of {@link GetServices }
     * 
     */
    public GetServices createGetServices() {
        return new GetServices();
    }

    /**
     * Create an instance of {@link GetServicesRequest }
     * 
     */
    public GetServicesRequest createGetServicesRequest() {
        return new GetServicesRequest();
    }

    /**
     * Create an instance of {@link GetContractsResponse }
     * 
     */
    public GetContractsResponse createGetContractsResponse() {
        return new GetContractsResponse();
    }

    /**
     * Create an instance of {@link GetContractsResult }
     * 
     */
    public GetContractsResult createGetContractsResult() {
        return new GetContractsResult();
    }

    /**
     * Create an instance of {@link RedeemSpaFinderWellnessCardResponse }
     * 
     */
    public RedeemSpaFinderWellnessCardResponse createRedeemSpaFinderWellnessCardResponse() {
        return new RedeemSpaFinderWellnessCardResponse();
    }

    /**
     * Create an instance of {@link RedeemSpaFinderWellnessCardResult }
     * 
     */
    public RedeemSpaFinderWellnessCardResult createRedeemSpaFinderWellnessCardResult() {
        return new RedeemSpaFinderWellnessCardResult();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link GetProductsRequest }
     * 
     */
    public GetProductsRequest createGetProductsRequest() {
        return new GetProductsRequest();
    }

    /**
     * Create an instance of {@link PurchaseContracts }
     * 
     */
    public PurchaseContracts createPurchaseContracts() {
        return new PurchaseContracts();
    }

    /**
     * Create an instance of {@link PurchaseContractsRequest }
     * 
     */
    public PurchaseContractsRequest createPurchaseContractsRequest() {
        return new PurchaseContractsRequest();
    }

    /**
     * Create an instance of {@link UpdateProductsResponse }
     * 
     */
    public UpdateProductsResponse createUpdateProductsResponse() {
        return new UpdateProductsResponse();
    }

    /**
     * Create an instance of {@link UpdateProductsResult }
     * 
     */
    public UpdateProductsResult createUpdateProductsResult() {
        return new UpdateProductsResult();
    }

    /**
     * Create an instance of {@link UpdateServicesResponse }
     * 
     */
    public UpdateServicesResponse createUpdateServicesResponse() {
        return new UpdateServicesResponse();
    }

    /**
     * Create an instance of {@link UpdateServicesResult }
     * 
     */
    public UpdateServicesResult createUpdateServicesResult() {
        return new UpdateServicesResult();
    }

    /**
     * Create an instance of {@link UpdateSaleDate }
     * 
     */
    public UpdateSaleDate createUpdateSaleDate() {
        return new UpdateSaleDate();
    }

    /**
     * Create an instance of {@link UpdateSaleDateRequest }
     * 
     */
    public UpdateSaleDateRequest createUpdateSaleDateRequest() {
        return new UpdateSaleDateRequest();
    }

    /**
     * Create an instance of {@link ReturnSaleResponse }
     * 
     */
    public ReturnSaleResponse createReturnSaleResponse() {
        return new ReturnSaleResponse();
    }

    /**
     * Create an instance of {@link ReturnSaleResult }
     * 
     */
    public ReturnSaleResult createReturnSaleResult() {
        return new ReturnSaleResult();
    }

    /**
     * Create an instance of {@link CheckoutShoppingCartResponse }
     * 
     */
    public CheckoutShoppingCartResponse createCheckoutShoppingCartResponse() {
        return new CheckoutShoppingCartResponse();
    }

    /**
     * Create an instance of {@link CheckoutShoppingCartResult }
     * 
     */
    public CheckoutShoppingCartResult createCheckoutShoppingCartResult() {
        return new CheckoutShoppingCartResult();
    }

    /**
     * Create an instance of {@link UpdateSaleDateResponse }
     * 
     */
    public UpdateSaleDateResponse createUpdateSaleDateResponse() {
        return new UpdateSaleDateResponse();
    }

    /**
     * Create an instance of {@link UpdateSaleDateResult }
     * 
     */
    public UpdateSaleDateResult createUpdateSaleDateResult() {
        return new UpdateSaleDateResult();
    }

    /**
     * Create an instance of {@link GetAcceptedCardTypeResponse }
     * 
     */
    public GetAcceptedCardTypeResponse createGetAcceptedCardTypeResponse() {
        return new GetAcceptedCardTypeResponse();
    }

    /**
     * Create an instance of {@link GetAcceptedCardTypeResult }
     * 
     */
    public GetAcceptedCardTypeResult createGetAcceptedCardTypeResult() {
        return new GetAcceptedCardTypeResult();
    }

    /**
     * Create an instance of {@link RedeemSpaFinderWellnessCard }
     * 
     */
    public RedeemSpaFinderWellnessCard createRedeemSpaFinderWellnessCard() {
        return new RedeemSpaFinderWellnessCard();
    }

    /**
     * Create an instance of {@link RedeemSpaFinderWellnessCardRequest }
     * 
     */
    public RedeemSpaFinderWellnessCardRequest createRedeemSpaFinderWellnessCardRequest() {
        return new RedeemSpaFinderWellnessCardRequest();
    }

    /**
     * Create an instance of {@link GetContracts }
     * 
     */
    public GetContracts createGetContracts() {
        return new GetContracts();
    }

    /**
     * Create an instance of {@link GetContractsRequest }
     * 
     */
    public GetContractsRequest createGetContractsRequest() {
        return new GetContractsRequest();
    }

    /**
     * Create an instance of {@link GetCustomPaymentMethods }
     * 
     */
    public GetCustomPaymentMethods createGetCustomPaymentMethods() {
        return new GetCustomPaymentMethods();
    }

    /**
     * Create an instance of {@link GetCustomPaymentMethodsRequest }
     * 
     */
    public GetCustomPaymentMethodsRequest createGetCustomPaymentMethodsRequest() {
        return new GetCustomPaymentMethodsRequest();
    }

    /**
     * Create an instance of {@link ReturnSale }
     * 
     */
    public ReturnSale createReturnSale() {
        return new ReturnSale();
    }

    /**
     * Create an instance of {@link ReturnSaleRequest }
     * 
     */
    public ReturnSaleRequest createReturnSaleRequest() {
        return new ReturnSaleRequest();
    }

    /**
     * Create an instance of {@link PurchaseContractsResponse }
     * 
     */
    public PurchaseContractsResponse createPurchaseContractsResponse() {
        return new PurchaseContractsResponse();
    }

    /**
     * Create an instance of {@link PurchaseContractsResult }
     * 
     */
    public PurchaseContractsResult createPurchaseContractsResult() {
        return new PurchaseContractsResult();
    }

    /**
     * Create an instance of {@link GetServicesResponse }
     * 
     */
    public GetServicesResponse createGetServicesResponse() {
        return new GetServicesResponse();
    }

    /**
     * Create an instance of {@link GetServicesResult }
     * 
     */
    public GetServicesResult createGetServicesResult() {
        return new GetServicesResult();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetProductsResult }
     * 
     */
    public GetProductsResult createGetProductsResult() {
        return new GetProductsResult();
    }

    /**
     * Create an instance of {@link UpdateProducts }
     * 
     */
    public UpdateProducts createUpdateProducts() {
        return new UpdateProducts();
    }

    /**
     * Create an instance of {@link UpdateProductsRequest }
     * 
     */
    public UpdateProductsRequest createUpdateProductsRequest() {
        return new UpdateProductsRequest();
    }

    /**
     * Create an instance of {@link UpdateServices }
     * 
     */
    public UpdateServices createUpdateServices() {
        return new UpdateServices();
    }

    /**
     * Create an instance of {@link UpdateServicesRequest }
     * 
     */
    public UpdateServicesRequest createUpdateServicesRequest() {
        return new UpdateServicesRequest();
    }

    /**
     * Create an instance of {@link Appointment }
     * 
     */
    public Appointment createAppointment() {
        return new Appointment();
    }

    /**
     * Create an instance of {@link ArrayOfCartItem }
     * 
     */
    public ArrayOfCartItem createArrayOfCartItem() {
        return new ArrayOfCartItem();
    }

    /**
     * Create an instance of {@link SourceCredentials }
     * 
     */
    public SourceCredentials createSourceCredentials() {
        return new SourceCredentials();
    }

    /**
     * Create an instance of {@link Size }
     * 
     */
    public Size createSize() {
        return new Size();
    }

    /**
     * Create an instance of {@link Staff }
     * 
     */
    public Staff createStaff() {
        return new Staff();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
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
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link ArrayOfContract }
     * 
     */
    public ArrayOfContract createArrayOfContract() {
        return new ArrayOfContract();
    }

    /**
     * Create an instance of {@link ArrayOfPurchasedItem }
     * 
     */
    public ArrayOfPurchasedItem createArrayOfPurchasedItem() {
        return new ArrayOfPurchasedItem();
    }

    /**
     * Create an instance of {@link ArrayOfClientIndex }
     * 
     */
    public ArrayOfClientIndex createArrayOfClientIndex() {
        return new ArrayOfClientIndex();
    }

    /**
     * Create an instance of {@link PaymentInfo }
     * 
     */
    public PaymentInfo createPaymentInfo() {
        return new PaymentInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPackage }
     * 
     */
    public ArrayOfPackage createArrayOfPackage() {
        return new ArrayOfPackage();
    }

    /**
     * Create an instance of {@link ArrayOfRep }
     * 
     */
    public ArrayOfRep createArrayOfRep() {
        return new ArrayOfRep();
    }

    /**
     * Create an instance of {@link ArrayOfClassSchedule }
     * 
     */
    public ArrayOfClassSchedule createArrayOfClassSchedule() {
        return new ArrayOfClassSchedule();
    }

    /**
     * Create an instance of {@link ArrayOfVisit }
     * 
     */
    public ArrayOfVisit createArrayOfVisit() {
        return new ArrayOfVisit();
    }

    /**
     * Create an instance of {@link ArrayOfAvailability }
     * 
     */
    public ArrayOfAvailability createArrayOfAvailability() {
        return new ArrayOfAvailability();
    }

    /**
     * Create an instance of {@link ClientIndexValue }
     * 
     */
    public ClientIndexValue createClientIndexValue() {
        return new ClientIndexValue();
    }

    /**
     * Create an instance of {@link Level }
     * 
     */
    public Level createLevel() {
        return new Level();
    }

    /**
     * Create an instance of {@link Package }
     * 
     */
    public Package createPackage() {
        return new Package();
    }

    /**
     * Create an instance of {@link Contract }
     * 
     */
    public Contract createContract() {
        return new Contract();
    }

    /**
     * Create an instance of {@link Site }
     * 
     */
    public Site createSite() {
        return new Site();
    }

    /**
     * Create an instance of {@link Sale }
     * 
     */
    public Sale createSale() {
        return new Sale();
    }

    /**
     * Create an instance of {@link CartItem }
     * 
     */
    public CartItem createCartItem() {
        return new CartItem();
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
     * Create an instance of {@link ArrayOfMembershipTypeRestriction }
     * 
     */
    public ArrayOfMembershipTypeRestriction createArrayOfMembershipTypeRestriction() {
        return new ArrayOfMembershipTypeRestriction();
    }

    /**
     * Create an instance of {@link ContractItem }
     * 
     */
    public ContractItem createContractItem() {
        return new ContractItem();
    }

    /**
     * Create an instance of {@link ArrayOfClientRelationship }
     * 
     */
    public ArrayOfClientRelationship createArrayOfClientRelationship() {
        return new ArrayOfClientRelationship();
    }

    /**
     * Create an instance of {@link CreditCardInfo }
     * 
     */
    public CreditCardInfo createCreditCardInfo() {
        return new CreditCardInfo();
    }

    /**
     * Create an instance of {@link SalesRep }
     * 
     */
    public SalesRep createSalesRep() {
        return new SalesRep();
    }

    /**
     * Create an instance of {@link ArrayOfProduct }
     * 
     */
    public ArrayOfProduct createArrayOfProduct() {
        return new ArrayOfProduct();
    }

    /**
     * Create an instance of {@link ScheduleItem }
     * 
     */
    public ScheduleItem createScheduleItem() {
        return new ScheduleItem();
    }

    /**
     * Create an instance of {@link ArrayOfClass }
     * 
     */
    public ArrayOfClass createArrayOfClass() {
        return new ArrayOfClass();
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
     * Create an instance of {@link CompInfo }
     * 
     */
    public CompInfo createCompInfo() {
        return new CompInfo();
    }

    /**
     * Create an instance of {@link ShoppingCart }
     * 
     */
    public ShoppingCart createShoppingCart() {
        return new ShoppingCart();
    }

    /**
     * Create an instance of {@link ArrayOfSalesRep }
     * 
     */
    public ArrayOfSalesRep createArrayOfSalesRep() {
        return new ArrayOfSalesRep();
    }

    /**
     * Create an instance of {@link Relationship }
     * 
     */
    public Relationship createRelationship() {
        return new Relationship();
    }

    /**
     * Create an instance of {@link DebitAccountInfo }
     * 
     */
    public DebitAccountInfo createDebitAccountInfo() {
        return new DebitAccountInfo();
    }

    /**
     * Create an instance of {@link Tip }
     * 
     */
    public Tip createTip() {
        return new Tip();
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
     * Create an instance of {@link ClassDescription }
     * 
     */
    public ClassDescription createClassDescription() {
        return new ClassDescription();
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
     * Create an instance of {@link CheckInfo }
     * 
     */
    public CheckInfo createCheckInfo() {
        return new CheckInfo();
    }

    /**
     * Create an instance of {@link EncryptedTrackDataInfo }
     * 
     */
    public EncryptedTrackDataInfo createEncryptedTrackDataInfo() {
        return new EncryptedTrackDataInfo();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link Course }
     * 
     */
    public Course createCourse() {
        return new Course();
    }

    /**
     * Create an instance of {@link MembershipTypeRestriction }
     * 
     */
    public MembershipTypeRestriction createMembershipTypeRestriction() {
        return new MembershipTypeRestriction();
    }

    /**
     * Create an instance of {@link Availability }
     * 
     */
    public Availability createAvailability() {
        return new Availability();
    }

    /**
     * Create an instance of {@link ArrayOfSale }
     * 
     */
    public ArrayOfSale createArrayOfSale() {
        return new ArrayOfSale();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentInfo }
     * 
     */
    public ArrayOfPaymentInfo createArrayOfPaymentInfo() {
        return new ArrayOfPaymentInfo();
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
     * Create an instance of {@link Color }
     * 
     */
    public Color createColor() {
        return new Color();
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
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link ArrayOfProgram }
     * 
     */
    public ArrayOfProgram createArrayOfProgram() {
        return new ArrayOfProgram();
    }

    /**
     * Create an instance of {@link CustomPaymentInfo }
     * 
     */
    public CustomPaymentInfo createCustomPaymentInfo() {
        return new CustomPaymentInfo();
    }

    /**
     * Create an instance of {@link com.mindbodyonline.clients.api._0_5_1.sale_service.Class }
     * 
     */
    public com.mindbodyonline.clients.api._0_5_1.sale_service.Class createClass() {
        return new com.mindbodyonline.clients.api._0_5_1.sale_service.Class();
    }

    /**
     * Create an instance of {@link ArrayOfPayment }
     * 
     */
    public ArrayOfPayment createArrayOfPayment() {
        return new ArrayOfPayment();
    }

    /**
     * Create an instance of {@link SessionType }
     * 
     */
    public SessionType createSessionType() {
        return new SessionType();
    }

    /**
     * Create an instance of {@link AutopaySchedule }
     * 
     */
    public AutopaySchedule createAutopaySchedule() {
        return new AutopaySchedule();
    }

    /**
     * Create an instance of {@link Visit }
     * 
     */
    public Visit createVisit() {
        return new Visit();
    }

    /**
     * Create an instance of {@link ArrayOfClient }
     * 
     */
    public ArrayOfClient createArrayOfClient() {
        return new ArrayOfClient();
    }

    /**
     * Create an instance of {@link ArrayOfService }
     * 
     */
    public ArrayOfService createArrayOfService() {
        return new ArrayOfService();
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
     * Create an instance of {@link ArrayOfAppointment }
     * 
     */
    public ArrayOfAppointment createArrayOfAppointment() {
        return new ArrayOfAppointment();
    }

    /**
     * Create an instance of {@link GiftCardInfo }
     * 
     */
    public GiftCardInfo createGiftCardInfo() {
        return new GiftCardInfo();
    }

    /**
     * Create an instance of {@link CashInfo }
     * 
     */
    public CashInfo createCashInfo() {
        return new CashInfo();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link ClassSchedule }
     * 
     */
    public ClassSchedule createClassSchedule() {
        return new ClassSchedule();
    }

    /**
     * Create an instance of {@link Liability }
     * 
     */
    public Liability createLiability() {
        return new Liability();
    }

    /**
     * Create an instance of {@link StoredCardInfo }
     * 
     */
    public StoredCardInfo createStoredCardInfo() {
        return new StoredCardInfo();
    }

    /**
     * Create an instance of {@link ArrayOfCustomPaymentInfo }
     * 
     */
    public ArrayOfCustomPaymentInfo createArrayOfCustomPaymentInfo() {
        return new ArrayOfCustomPaymentInfo();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link TrackDataInfo }
     * 
     */
    public TrackDataInfo createTrackDataInfo() {
        return new TrackDataInfo();
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
     * Create an instance of {@link ArrayOfContractItem }
     * 
     */
    public ArrayOfContractItem createArrayOfContractItem() {
        return new ArrayOfContractItem();
    }

    /**
     * Create an instance of {@link PurchasedItem }
     * 
     */
    public PurchasedItem createPurchasedItem() {
        return new PurchasedItem();
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
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "Quantity", scope = CartItem.class)
    public JAXBElement<Integer> createCartItemQuantity(Integer value) {
        return new JAXBElement<Integer>(_CartItemQuantity_QNAME, Integer.class, CartItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = CartItem.class)
    public JAXBElement<Integer> createCartItemID(Integer value) {
        return new JAXBElement<Integer>(_CartItemID_QNAME, Integer.class, CartItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "Price", scope = Product.class)
    public JAXBElement<BigDecimal> createProductPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProductPrice_QNAME, BigDecimal.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "GroupID", scope = Product.class)
    public JAXBElement<Integer> createProductGroupID(Integer value) {
        return new JAXBElement<Integer>(_ProductGroupID_QNAME, Integer.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "TaxIncluded", scope = Product.class)
    public JAXBElement<BigDecimal> createProductTaxIncluded(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProductTaxIncluded_QNAME, BigDecimal.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "OnlinePrice", scope = Product.class)
    public JAXBElement<BigDecimal> createProductOnlinePrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProductOnlinePrice_QNAME, BigDecimal.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "LastModifiedDateTime", scope = Visit.class)
    public JAXBElement<XMLGregorianCalendar> createVisitLastModifiedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VisitLastModifiedDateTime_QNAME, XMLGregorianCalendar.class, Visit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "MakeUp", scope = Visit.class)
    public JAXBElement<Boolean> createVisitMakeUp(Boolean value) {
        return new JAXBElement<Boolean>(_VisitMakeUp_QNAME, Boolean.class, Visit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "SignedIn", scope = Visit.class)
    public JAXBElement<Boolean> createVisitSignedIn(Boolean value) {
        return new JAXBElement<Boolean>(_VisitSignedIn_QNAME, Boolean.class, Visit.class, value);
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
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "AssignsMembershipId", scope = Contract.class)
    public JAXBElement<Integer> createContractAssignsMembershipId(Integer value) {
        return new JAXBElement<Integer>(_ContractAssignsMembershipId_QNAME, Integer.class, Contract.class, value);
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
        return new JAXBElement<Integer>(_CartItemID_QNAME, Integer.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = ClientIndexValue.class)
    public JAXBElement<Integer> createClientIndexValueID(Integer value) {
        return new JAXBElement<Integer>(_CartItemID_QNAME, Integer.class, ClientIndexValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = Size.class)
    public JAXBElement<Integer> createSizeID(Integer value) {
        return new JAXBElement<Integer>(_CartItemID_QNAME, Integer.class, Size.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "Price", scope = Service.class)
    public JAXBElement<BigDecimal> createServicePrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProductPrice_QNAME, BigDecimal.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ProgramID", scope = Service.class)
    public JAXBElement<Integer> createServiceProgramID(Integer value) {
        return new JAXBElement<Integer>(_ServiceProgramID_QNAME, Integer.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "OnlinePrice", scope = Service.class)
    public JAXBElement<BigDecimal> createServiceOnlinePrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProductOnlinePrice_QNAME, BigDecimal.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "TaxIncluded", scope = Service.class)
    public JAXBElement<BigDecimal> createServiceTaxIncluded(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProductTaxIncluded_QNAME, BigDecimal.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "Count", scope = Service.class)
    public JAXBElement<Integer> createServiceCount(Integer value) {
        return new JAXBElement<Integer>(_ServiceCount_QNAME, Integer.class, Service.class, value);
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
        return new JAXBElement<Integer>(_CartItemID_QNAME, Integer.class, SessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = ClassDescription.class)
    public JAXBElement<Integer> createClassDescriptionID(Integer value) {
        return new JAXBElement<Integer>(_CartItemID_QNAME, Integer.class, ClassDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "LastUpdated", scope = ClassDescription.class)
    public JAXBElement<XMLGregorianCalendar> createClassDescriptionLastUpdated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClassDescriptionLastUpdated_QNAME, XMLGregorianCalendar.class, ClassDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "EndDateTime", scope = com.mindbodyonline.clients.api._0_5_1.sale_service.Class.class)
    public JAXBElement<XMLGregorianCalendar> createClassEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClassEndDateTime_QNAME, XMLGregorianCalendar.class, com.mindbodyonline.clients.api._0_5_1.sale_service.Class.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "SemesterID", scope = com.mindbodyonline.clients.api._0_5_1.sale_service.Class.class)
    public JAXBElement<Integer> createClassSemesterID(Integer value) {
        return new JAXBElement<Integer>(_ClassSemesterID_QNAME, Integer.class, com.mindbodyonline.clients.api._0_5_1.sale_service.Class.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "IsAvailable", scope = com.mindbodyonline.clients.api._0_5_1.sale_service.Class.class)
    public JAXBElement<Boolean> createClassIsAvailable(Boolean value) {
        return new JAXBElement<Boolean>(_ClassIsAvailable_QNAME, Boolean.class, com.mindbodyonline.clients.api._0_5_1.sale_service.Class.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "StartDateTime", scope = com.mindbodyonline.clients.api._0_5_1.sale_service.Class.class)
    public JAXBElement<XMLGregorianCalendar> createClassStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClassStartDateTime_QNAME, XMLGregorianCalendar.class, com.mindbodyonline.clients.api._0_5_1.sale_service.Class.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = com.mindbodyonline.clients.api._0_5_1.sale_service.Class.class)
    public JAXBElement<Integer> createClassID(Integer value) {
        return new JAXBElement<Integer>(_CartItemID_QNAME, Integer.class, com.mindbodyonline.clients.api._0_5_1.sale_service.Class.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = ClientIndex.class)
    public JAXBElement<Integer> createClientIndexID(Integer value) {
        return new JAXBElement<Integer>(_CartItemID_QNAME, Integer.class, ClientIndex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "EndDateTime", scope = Appointment.class)
    public JAXBElement<XMLGregorianCalendar> createAppointmentEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClassEndDateTime_QNAME, XMLGregorianCalendar.class, Appointment.class, value);
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
        return new JAXBElement<XMLGregorianCalendar>(_ClassStartDateTime_QNAME, XMLGregorianCalendar.class, Appointment.class, value);
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
        return new JAXBElement<Long>(_CartItemID_QNAME, Long.class, Appointment.class, value);
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
        return new JAXBElement<Long>(_CartItemID_QNAME, Long.class, Staff.class, value);
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
        return new JAXBElement<Long>(_CartItemID_QNAME, Long.class, ClientService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = Resource.class)
    public JAXBElement<Integer> createResourceID(Integer value) {
        return new JAXBElement<Integer>(_CartItemID_QNAME, Integer.class, Resource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "Amount", scope = CreditCardInfo.class)
    public JAXBElement<BigDecimal> createCreditCardInfoAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditCardInfoAmount_QNAME, BigDecimal.class, CreditCardInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "SaveInfo", scope = CreditCardInfo.class)
    public JAXBElement<Boolean> createCreditCardInfoSaveInfo(Boolean value) {
        return new JAXBElement<Boolean>(_CreditCardInfoSaveInfo_QNAME, Boolean.class, CreditCardInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "DayTuesday", scope = ClassSchedule.class)
    public JAXBElement<Boolean> createClassScheduleDayTuesday(Boolean value) {
        return new JAXBElement<Boolean>(_ClassScheduleDayTuesday_QNAME, Boolean.class, ClassSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "EndTime", scope = ClassSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createClassScheduleEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClassScheduleEndTime_QNAME, XMLGregorianCalendar.class, ClassSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "SemesterID", scope = ClassSchedule.class)
    public JAXBElement<Integer> createClassScheduleSemesterID(Integer value) {
        return new JAXBElement<Integer>(_ClassSemesterID_QNAME, Integer.class, ClassSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "DayFriday", scope = ClassSchedule.class)
    public JAXBElement<Boolean> createClassScheduleDayFriday(Boolean value) {
        return new JAXBElement<Boolean>(_ClassScheduleDayFriday_QNAME, Boolean.class, ClassSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "EndDate", scope = ClassSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createClassScheduleEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClassScheduleEndDate_QNAME, XMLGregorianCalendar.class, ClassSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "DayThursday", scope = ClassSchedule.class)
    public JAXBElement<Boolean> createClassScheduleDayThursday(Boolean value) {
        return new JAXBElement<Boolean>(_ClassScheduleDayThursday_QNAME, Boolean.class, ClassSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "StartTime", scope = ClassSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createClassScheduleStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClassScheduleStartTime_QNAME, XMLGregorianCalendar.class, ClassSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "DayMonday", scope = ClassSchedule.class)
    public JAXBElement<Boolean> createClassScheduleDayMonday(Boolean value) {
        return new JAXBElement<Boolean>(_ClassScheduleDayMonday_QNAME, Boolean.class, ClassSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "DayWednesday", scope = ClassSchedule.class)
    public JAXBElement<Boolean> createClassScheduleDayWednesday(Boolean value) {
        return new JAXBElement<Boolean>(_ClassScheduleDayWednesday_QNAME, Boolean.class, ClassSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "DaySaturday", scope = ClassSchedule.class)
    public JAXBElement<Boolean> createClassScheduleDaySaturday(Boolean value) {
        return new JAXBElement<Boolean>(_ClassScheduleDaySaturday_QNAME, Boolean.class, ClassSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "StartDate", scope = ClassSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createClassScheduleStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClassScheduleStartDate_QNAME, XMLGregorianCalendar.class, ClassSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = ClassSchedule.class)
    public JAXBElement<Integer> createClassScheduleID(Integer value) {
        return new JAXBElement<Integer>(_CartItemID_QNAME, Integer.class, ClassSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "DaySunday", scope = ClassSchedule.class)
    public JAXBElement<Boolean> createClassScheduleDaySunday(Boolean value) {
        return new JAXBElement<Boolean>(_ClassScheduleDaySunday_QNAME, Boolean.class, ClassSchedule.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "DiscountTotal", scope = ShoppingCart.class)
    public JAXBElement<Double> createShoppingCartDiscountTotal(Double value) {
        return new JAXBElement<Double>(_ShoppingCartDiscountTotal_QNAME, Double.class, ShoppingCart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "GrandTotal", scope = ShoppingCart.class)
    public JAXBElement<Double> createShoppingCartGrandTotal(Double value) {
        return new JAXBElement<Double>(_ShoppingCartGrandTotal_QNAME, Double.class, ShoppingCart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "TaxTotal", scope = ShoppingCart.class)
    public JAXBElement<Double> createShoppingCartTaxTotal(Double value) {
        return new JAXBElement<Double>(_ShoppingCartTaxTotal_QNAME, Double.class, ShoppingCart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "SubTotal", scope = ShoppingCart.class)
    public JAXBElement<Double> createShoppingCartSubTotal(Double value) {
        return new JAXBElement<Double>(_ShoppingCartSubTotal_QNAME, Double.class, ShoppingCart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.mindbodyonline.com/api/0_5_1", name = "ID", scope = Color.class)
    public JAXBElement<Integer> createColorID(Integer value) {
        return new JAXBElement<Integer>(_CartItemID_QNAME, Integer.class, Color.class, value);
    }

}
