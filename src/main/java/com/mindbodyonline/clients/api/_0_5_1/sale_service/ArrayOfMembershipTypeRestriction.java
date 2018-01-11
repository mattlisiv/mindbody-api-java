
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMembershipTypeRestriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMembershipTypeRestriction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MembershipTypeRestriction" type="{http://clients.mindbodyonline.com/api/0_5_1}MembershipTypeRestriction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMembershipTypeRestriction", propOrder = {
    "membershipTypeRestriction"
})
public class ArrayOfMembershipTypeRestriction {

    @XmlElement(name = "MembershipTypeRestriction", nillable = true)
    protected List<MembershipTypeRestriction> membershipTypeRestriction;

    /**
     * Gets the value of the membershipTypeRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membershipTypeRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembershipTypeRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MembershipTypeRestriction }
     * 
     * 
     */
    public List<MembershipTypeRestriction> getMembershipTypeRestriction() {
        if (membershipTypeRestriction == null) {
            membershipTypeRestriction = new ArrayList<MembershipTypeRestriction>();
        }
        return this.membershipTypeRestriction;
    }

}
