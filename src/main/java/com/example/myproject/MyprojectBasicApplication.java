package com.example.myproject;

import com.example.myproject.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyprojectBasicApplication {

    public static void main(String[] args) {
//        BinarySearchImpl binarySearch=new BinarySearchImpl(new BubbleSortAlgorithm());
//
//        System.out.println(result);
        ApplicationContext applicationContext = SpringApplication.run(MyprojectBasicApplication.class, args);
        BinarySearchImpl binarySearch1=applicationContext.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch2=applicationContext.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch3=applicationContext.getBean(BinarySearchImpl.class);
        System.out.println(binarySearch1);
        System.out.println(binarySearch2);
        System.out.println(binarySearch3);
        int result=binarySearch1.binarySearch(new int[]{12,4,6},3);
        System.out.println(result);

    }

}
