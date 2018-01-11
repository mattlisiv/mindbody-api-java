
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnSaleResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnSaleResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="ReturnSaleID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TrainerID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnSaleResult", propOrder = {
    "returnSaleID",
    "trainerID",
    "amount"
})
public class ReturnSaleResult
    extends MBResult
{

    @XmlElement(name = "ReturnSaleID", required = true, type = Long.class, nillable = true)
    protected Long returnSaleID;
    @XmlElement(name = "TrainerID", required = true, type = Long.class, nillable = true)
    protected Long trainerID;
    @XmlElement(name = "Amount", required = true, nillable = true)
    protected BigDecimal amount;

    /**
     * Gets the value of the returnSaleID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReturnSaleID() {
        return returnSaleID;
    }

    /**
     * Sets the value of the returnSaleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReturnSaleID(Long value) {
        this.returnSaleID = value;
    }

    /**
     * Gets the value of the trainerID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrainerID() {
        return trainerID;
    }

    /**
     * Sets the value of the trainerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrainerID(Long value) {
        this.trainerID = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

}
