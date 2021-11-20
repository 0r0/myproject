package com.example.myproject;


import com.example.myproject.xml.XmlPersonDoa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configuration
@ComponentScan("com.example.myproject")
public class MyprojectXmlContextApplication {
    private static Logger logger= LoggerFactory.getLogger(MyprojectXmlContextApplication.class);
    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext applicationContext
                    = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            logger.info("beans loaded {}",(Object) applicationContext.getBeanDefinitionNames());

            XmlPersonDoa personDoa=applicationContext.getBean(XmlPersonDoa.class);
            System.out.println(personDoa);
            System.out.println(personDoa.getXmlJdbcConnection());
            logger.info("{}",personDoa);
            logger.info("{}",personDoa.getXmlJdbcConnection());

//
        }

    }

}
