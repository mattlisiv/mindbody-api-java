
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientRelationship">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBObject">
 *       &lt;sequence>
 *         &lt;element name="RelatedClient" type="{http://clients.mindbodyonline.com/api/0_5_1}Client" minOccurs="0"/>
 *         &lt;element name="Relationship" type="{http://clients.mindbodyonline.com/api/0_5_1}Relationship" minOccurs="0"/>
 *         &lt;element name="RelationshipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientRelationship", propOrder = {
    "relatedClient",
    "relationship",
    "relationshipName"
})
public class ClientRelationship
    extends MBObject
{

    @XmlElement(name = "RelatedClient")
    protected Client relatedClient;
    @XmlElement(name = "Relationship")
    protected Relationship relationship;
    @XmlElement(name = "RelationshipName")
    protected String relationshipName;

    /**
     * Gets the value of the relatedClient property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getRelatedClient() {
        return relatedClient;
    }

    /**
     * Sets the value of the relatedClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setRelatedClient(Client value) {
        this.relatedClient = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link Relationship }
     *     
     */
    public Relationship getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationship }
     *     
     */
    public void setRelationship(Relationship value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the relationshipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipName() {
        return relationshipName;
    }

    /**
     * Sets the value of the relationshipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipName(String value) {
        this.relationshipName = value;
    }

}
