package com.example.myproject;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.example.myproject")
public class MyprojectXmlContextApplication {

    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext applicationContext
                    = new ClassPathXmlApplicationContext("applicationContext.xml")) {
//
        }

    }

}
