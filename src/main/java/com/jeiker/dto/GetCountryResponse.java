
package com.jeiker.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * <p>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://www.yourcompany.com/webservice}country"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "country"
})
@XmlRootElement(name = "getCountryResponse", namespace = "http://www.jeiker.com/webservice")
public class GetCountryResponse {

    @XmlElement(namespace = "http://www.jeiker.com/webservice", required = true)
    protected Country country;

    /**
     * ��ȡcountry���Ե�ֵ��
     *
     * @return possible object is
     * {@link Country }
     */
    public Country getCountry() {
        return country;
    }

    /**
     * ����country���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Country }
     */
    public void setCountry(Country value) {
        this.country = value;
    }

}
