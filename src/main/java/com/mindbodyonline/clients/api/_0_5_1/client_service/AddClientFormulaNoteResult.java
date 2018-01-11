
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddClientFormulaNoteResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddClientFormulaNoteResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="FormulaNote" type="{http://clients.mindbodyonline.com/api/0_5_1}FormulaNote" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddClientFormulaNoteResult", propOrder = {
    "formulaNote"
})
public class AddClientFormulaNoteResult
    extends MBResult
{

    @XmlElement(name = "FormulaNote")
    protected FormulaNote formulaNote;

    /**
     * Gets the value of the formulaNote property.
     * 
     * @return
     *     possible object is
     *     {@link FormulaNote }
     *     
     */
    public FormulaNote getFormulaNote() {
        return formulaNote;
    }

    /**
     * Sets the value of the formulaNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormulaNote }
     *     
     */
    public void setFormulaNote(FormulaNote value) {
        this.formulaNote = value;
    }

}
