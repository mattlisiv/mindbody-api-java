
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagedBySitesMBRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PagedBySitesMBRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientAssociatedSitesOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagedBySitesMBRequest", propOrder = {
    "clientAssociatedSitesOffset"
})
@XmlSeeAlso({
    GetClientServicesRequest.class,
    GetClientScheduleRequest.class,
    GetClientVisitsRequest.class,
    CrossRegionalRequest.class
})
public class PagedBySitesMBRequest
    extends MBRequest
{

    @XmlElement(name = "ClientAssociatedSitesOffset")
    protected int clientAssociatedSitesOffset;

    /**
     * Gets the value of the clientAssociatedSitesOffset property.
     * 
     */
    public int getClientAssociatedSitesOffset() {
        return clientAssociatedSitesOffset;
    }

    /**
     * Sets the value of the clientAssociatedSitesOffset property.
     * 
     */
    public void setClientAssociatedSitesOffset(int value) {
        this.clientAssociatedSitesOffset = value;
    }

}
