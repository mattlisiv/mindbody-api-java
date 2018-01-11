
package com.mindbodyonline.clients.api._0_5_1.site_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetProspectStagesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProspectStagesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="ProspectStages" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfProspectStage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProspectStagesResult", propOrder = {
    "prospectStages"
})
public class GetProspectStagesResult
    extends MBResult
{

    @XmlElement(name = "ProspectStages")
    protected ArrayOfProspectStage prospectStages;

    /**
     * Gets the value of the prospectStages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProspectStage }
     *     
     */
    public ArrayOfProspectStage getProspectStages() {
        return prospectStages;
    }

    /**
     * Sets the value of the prospectStages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProspectStage }
     *     
     */
    public void setProspectStages(ArrayOfProspectStage value) {
        this.prospectStages = value;
    }

}
