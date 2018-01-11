
package com.mindbodyonline.clients.api._0_5_1.client_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContactLogSubtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContactLogSubtype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactLogSubtype" type="{http://clients.mindbodyonline.com/api/0_5_1}ContactLogSubtype" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContactLogSubtype", propOrder = {
    "contactLogSubtype"
})
public class ArrayOfContactLogSubtype {

    @XmlElement(name = "ContactLogSubtype", nillable = true)
    protected List<ContactLogSubtype> contactLogSubtype;

    /**
     * Gets the value of the contactLogSubtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactLogSubtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactLogSubtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactLogSubtype }
     * 
     * 
     */
    public List<ContactLogSubtype> getContactLogSubtype() {
        if (contactLogSubtype == null) {
            contactLogSubtype = new ArrayList<ContactLogSubtype>();
        }
        return this.contactLogSubtype;
    }

}
