
package com.jeiker.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>country complex type�� Java �ࡣ
 * <p>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;complexType name="country">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="population" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="capital" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currency" type="{http://www.yourcompany.com/webservice}currency"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "country", namespace = "http://www.jeiker.com/webservice", propOrder = {
        "name",
        "population",
        "capital",
        "currency"
})
public class Country {

    @XmlElement(namespace = "http://www.jeiker.com/webservice", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.jeiker.com/webservice")
    protected int population;
    @XmlElement(namespace = "http://www.jeiker.com/webservice", required = true)
    protected String capital;
    @XmlElement(namespace = "http://www.jeiker.com/webservice", required = true)
    @XmlSchemaType(name = "string")
    protected Currency currency;


    /**
     * ��ȡname���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡpopulation���Ե�ֵ��
     */
    public int getPopulation() {
        return population;
    }

    /**
     * ����population���Ե�ֵ��
     */
    public void setPopulation(int value) {
        this.population = value;
    }

    /**
     * ��ȡcapital���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCapital() {
        return capital;
    }

    /**
     * ����capital���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCapital(String value) {
        this.capital = value;
    }

    /**
     * ��ȡcurrency���Ե�ֵ��
     *
     * @return possible object is
     * {@link Currency }
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * ����currency���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Currency }
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

}
