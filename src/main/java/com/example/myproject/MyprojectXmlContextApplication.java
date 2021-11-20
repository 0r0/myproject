package com.example.myproject;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.myproject")
public class MyprojectXmlContextApplication {

    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyprojectXmlContextApplication.class)) {
//
        }

    }

}
