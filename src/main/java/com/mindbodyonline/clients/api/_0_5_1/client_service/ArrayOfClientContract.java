
package com.mindbodyonline.clients.api._0_5_1.client_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClientContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClientContract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientContract" type="{http://clients.mindbodyonline.com/api/0_5_1}ClientContract" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClientContract", propOrder = {
    "clientContract"
})
public class ArrayOfClientContract {

    @XmlElement(name = "ClientContract", nillable = true)
    protected List<ClientContract> clientContract;

    /**
     * Gets the value of the clientContract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientContract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientContract }
     * 
     * 
     */
    public List<ClientContract> getClientContract() {
        if (clientContract == null) {
            clientContract = new ArrayList<ClientContract>();
        }
        return this.clientContract;
    }

}
