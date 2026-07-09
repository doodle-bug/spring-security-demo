package com.fr3nzy.spring_security_demo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet(HttpServletRequest req){

        return "Hello World! ";
    }

    @GetMapping("about")
    public String about(HttpServletRequest req){

        return "Engineer " + req.getSession().getId();
    }
}
