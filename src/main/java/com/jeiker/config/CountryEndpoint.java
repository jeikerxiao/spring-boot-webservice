package com.jeiker.config;

import com.jeiker.dto.Country;
import com.jeiker.dto.GetCountryRequest;
import com.jeiker.dto.GetCountryResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by Administrator on 2018/7/10 0010.
 */
@Endpoint
public class CountryEndpoint {

    private static final String NAMESPACE_URI = "http://www.jeiker.com/webservice";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        Country country = new Country();
        country.setName("长沙");
        response.setCountry(country);

        return response;
    }
}