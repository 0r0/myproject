package com.example.myproject;


import com.example.cdi.SomeCdiBusiness;
import com.example.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.example")
@PropertySource("classpath:app.properties")
public class MyprojectPropertiesApplication {
    private static Logger LOGGER= LoggerFactory.getLogger(MyprojectPropertiesApplication.class);
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext
                     = new AnnotationConfigApplicationContext(MyprojectPropertiesApplication.class))
        {
        SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);


        LOGGER.info("{}", someExternalService);
        LOGGER.info("{}", someExternalService.returnServiceUrl());
    }

    }

}
