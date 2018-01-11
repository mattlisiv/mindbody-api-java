
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossRegionalRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossRegionalRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}PagedBySitesMBRequest">
 *       &lt;sequence>
 *         &lt;element name="CrossRegionalLookup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossRegionalRequest", propOrder = {
    "crossRegionalLookup"
})
@XmlSeeAlso({
    GetClientContractsRequest.class
})
public class CrossRegionalRequest
    extends PagedBySitesMBRequest
{

    @XmlElement(name = "CrossRegionalLookup")
    protected boolean crossRegionalLookup;

    /**
     * Gets the value of the crossRegionalLookup property.
     * 
     */
    public boolean isCrossRegionalLookup() {
        return crossRegionalLookup;
    }

    /**
     * Sets the value of the crossRegionalLookup property.
     * 
     */
    public void setCrossRegionalLookup(boolean value) {
        this.crossRegionalLookup = value;
    }

}
