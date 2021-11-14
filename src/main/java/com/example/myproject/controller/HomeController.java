package com.example.myproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
    @GetMapping("/")
    public @ResponseBody String  printAtHome(){
        return "Hello Mehdi";
    }

}
