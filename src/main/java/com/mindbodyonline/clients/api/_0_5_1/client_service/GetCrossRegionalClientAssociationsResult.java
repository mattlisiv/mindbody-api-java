
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCrossRegionalClientAssociationsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCrossRegionalClientAssociationsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="CrossRegionalClientAssociations" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfCrossRegionalAssociation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCrossRegionalClientAssociationsResult", propOrder = {
    "crossRegionalClientAssociations"
})
public class GetCrossRegionalClientAssociationsResult
    extends MBResult
{

    @XmlElement(name = "CrossRegionalClientAssociations")
    protected ArrayOfCrossRegionalAssociation crossRegionalClientAssociations;

    /**
     * Gets the value of the crossRegionalClientAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrossRegionalAssociation }
     *     
     */
    public ArrayOfCrossRegionalAssociation getCrossRegionalClientAssociations() {
        return crossRegionalClientAssociations;
    }

    /**
     * Sets the value of the crossRegionalClientAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrossRegionalAssociation }
     *     
     */
    public void setCrossRegionalClientAssociations(ArrayOfCrossRegionalAssociation value) {
        this.crossRegionalClientAssociations = value;
    }

}
