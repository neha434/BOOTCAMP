package com.example.RestService.assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//Q.1) Create a simple REST ful service in Spring Boot which returns the Response "Welcome to spring boot".
@RestController
public class HelloControllerAns1 {
    @RequestMapping(path = "/Hello World")
    public String hello() {
        return "Welcome to spring boot";
    }
}

//    @GetMapping(path = "/hello-world-bean")
//    public HelloWorldBean helloWorldBean() {
//        return new HelloWorldBean(("hello ttn"));
//    }
//}

//    @GetMapping(path = "/hello-world/path-variable/{name}")
//    public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
//    {
//        return new HelloWorldBean(String.format("Hello World, %s", name));
//    }
//}
