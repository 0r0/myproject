package com.example.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeCdiBusiness {
    @Autowired
    SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCdiDao() {
        return someCdiDao;
    }

    public void setSomeCDIDAO(SomeCdiDao someCdiDao) {
        this.someCdiDao = someCdiDao;
    }
}
