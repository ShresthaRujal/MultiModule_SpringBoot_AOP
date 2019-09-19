package com.ruzal.application;

import com.ruzal.loggerapp.aspects.LoggerHandler;
import com.ruzal.loggerapp.interfaces.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.ruzal")
@RestController
public class Application {
    public static void main(String[] args)
    {
//        ApplicationContext ctx =  SpringApplication.run(Application.class,args);
//        LoggerHandler loggerHandler = ctx.getBean(LoggerHandler.class);
//        assert  loggerHandler !=null;
        SpringApplication.run(Application.class,args);
    }

    @GetMapping("/test")
    @Logger
    public ResponseEntity<?> get(){
        return new ResponseEntity<>("running......", HttpStatus.OK);
    }
}
