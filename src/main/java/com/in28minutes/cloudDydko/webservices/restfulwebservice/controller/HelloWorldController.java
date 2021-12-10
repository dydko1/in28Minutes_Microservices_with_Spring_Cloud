package com.in28minutes.cloudDydko.webservices.restfulwebservice.controller;

import com.in28minutes.cloudDydko.webservices.restfulwebservice.controller.helloWorldBean.HelloWorldBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "hello-world")
    public String helloWorld() {
        return "Hello World !!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World from Bean");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean("Doberek Pani/Panu: " + name);
    }

    @GetMapping(path = "hello-world-internationalized")
    public String helloWorldInternationalized(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {

        return messageSource.getMessage("good.morning.message", null,"Default message", LocaleContextHolder.getLocale());
    }
}
