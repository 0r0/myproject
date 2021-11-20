package com.example.myproject;


import com.example.cdi.SomeCdiBusiness;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.cdi")
public class MyprojectCdiApplication {
    private static Logger LOGGER= LoggerFactory.getLogger(MyprojectCdiApplication.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MyprojectCdiApplication.class, args);
        SomeCdiBusiness someCdiBusiness =applicationContext.getBean(SomeCdiBusiness.class);


        LOGGER.info("{}",someCdiBusiness);
        LOGGER.info("{}",someCdiBusiness.getSomeCdiDao());

    }

}
