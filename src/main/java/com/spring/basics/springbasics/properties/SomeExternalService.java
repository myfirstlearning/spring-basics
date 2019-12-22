package com.spring.basics.springbasics.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    //read the values from the properties
    @Value("${external.service.url}")
    private String url;

    public String returnServiceURL(){
        return url;
    }


}
