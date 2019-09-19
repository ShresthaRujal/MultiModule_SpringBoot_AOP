package com.ruzal.loggerapp.controllers;

import com.ruzal.loggerapp.interfaces.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    @Logger
    public void test(){
        System.out.println("running..");
    }
}
