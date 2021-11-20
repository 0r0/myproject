package com.example.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class SomeExternalService {
    //read from property file
    @Value("${external.service.url}")
    private String url;

    public String returnServiceUrl(){
        return url;
    }

}
