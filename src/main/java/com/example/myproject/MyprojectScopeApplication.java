package com.example.myproject;


import com.example.myproject.scope.PersonDoa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyprojectScopeApplication {
    private static Logger LOGGER= LoggerFactory.getLogger(MyprojectScopeApplication.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MyprojectScopeApplication.class, args);
        PersonDoa personDoa =applicationContext.getBean(PersonDoa.class);
        PersonDoa personDoa2=applicationContext.getBean(PersonDoa.class);

        LOGGER.info("{}",personDoa);
        LOGGER.info("{}",personDoa.getJdbcConnection());
        LOGGER.info("{}",personDoa2);
        LOGGER.info("{}",personDoa2.getJdbcConnection());
    }

}
