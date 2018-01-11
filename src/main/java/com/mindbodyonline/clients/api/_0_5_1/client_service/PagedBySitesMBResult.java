
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagedBySitesMBResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PagedBySitesMBResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="ClientAssociatedSitesOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClientAssociatedSitesTotalResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagedBySitesMBResult", propOrder = {
    "clientAssociatedSitesOffset",
    "clientAssociatedSitesTotalResults"
})
@XmlSeeAlso({
    GetClientScheduleResult.class,
    GetClientVisitsResult.class,
    GetClientContractsResult.class,
    GetClientServicesResult.class
})
public class PagedBySitesMBResult
    extends MBResult
{

    @XmlElement(name = "ClientAssociatedSitesOffset")
    protected int clientAssociatedSitesOffset;
    @XmlElement(name = "ClientAssociatedSitesTotalResults")
    protected int clientAssociatedSitesTotalResults;

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

    /**
     * Gets the value of the clientAssociatedSitesTotalResults property.
     * 
     */
    public int getClientAssociatedSitesTotalResults() {
        return clientAssociatedSitesTotalResults;
    }

    /**
     * Sets the value of the clientAssociatedSitesTotalResults property.
     * 
     */
    public void setClientAssociatedSitesTotalResults(int value) {
        this.clientAssociatedSitesTotalResults = value;
    }

}
