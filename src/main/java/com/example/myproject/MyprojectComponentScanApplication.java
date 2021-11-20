package com.example.myproject;

import com.example.componentscan.ComponentDoa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan("com.example.componentscan")
public class MyprojectComponentScanApplication {
    private static Logger LOGGER= LoggerFactory.getLogger(MyprojectScopeApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyprojectComponentScanApplication.class);
//                SpringApplication.run(MyprojectComponentScanApplication.class, args);
        ComponentDoa componentDoa1=applicationContext.getBean(ComponentDoa.class);
        ComponentDoa componentDoa2=applicationContext.getBean(ComponentDoa.class);
        LOGGER.info("{}",componentDoa1);
        LOGGER.info("{}",componentDoa1.getComponentJdbcConnection());
        LOGGER.info("{}",componentDoa2);
        LOGGER.info("{}",componentDoa2.getComponentJdbcConnection());



    }

}
