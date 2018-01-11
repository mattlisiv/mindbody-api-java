
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetClientFormulaNotesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientFormulaNotesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="FormulaNotes" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfFormulaNote" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientFormulaNotesResult", propOrder = {
    "formulaNotes"
})
public class GetClientFormulaNotesResult
    extends MBResult
{

    @XmlElement(name = "FormulaNotes")
    protected ArrayOfFormulaNote formulaNotes;

    /**
     * Gets the value of the formulaNotes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormulaNote }
     *     
     */
    public ArrayOfFormulaNote getFormulaNotes() {
        return formulaNotes;
    }

    /**
     * Sets the value of the formulaNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormulaNote }
     *     
     */
    public void setFormulaNotes(ArrayOfFormulaNote value) {
        this.formulaNotes = value;
    }

}
