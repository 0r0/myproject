package com.example.myproject;

import com.example.myproject.basic.BinarySearchImpl;
import org.mockito.Mockito;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class BinarySearchImplTest {

    public BinarySearchImpl binarySearchImpl(){
        return Mockito.mock(BinarySearchImpl.class);
    }

}
