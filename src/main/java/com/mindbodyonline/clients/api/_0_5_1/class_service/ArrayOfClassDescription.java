
package com.mindbodyonline.clients.api._0_5_1.class_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClassDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClassDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassDescription" type="{http://clients.mindbodyonline.com/api/0_5_1}ClassDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClassDescription", propOrder = {
    "classDescription"
})
public class ArrayOfClassDescription {

    @XmlElement(name = "ClassDescription", nillable = true)
    protected List<ClassDescription> classDescription;

    /**
     * Gets the value of the classDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassDescription }
     * 
     * 
     */
    public List<ClassDescription> getClassDescription() {
        if (classDescription == null) {
            classDescription = new ArrayList<ClassDescription>();
        }
        return this.classDescription;
    }

}
