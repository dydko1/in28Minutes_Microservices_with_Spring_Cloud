package com.in28minutes.cloudDydko.webservices.restfulwebservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "hello-world")
    public String helloWorld() {
        return "Hello World !!";
    }

    @RequestMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World from Bean");
    }
}
