package com.chrhsmt.sample.microservice.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestScope;

@RestController
@RequestMapping("hello")
@Scope("request")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public String getHello() {
        return "hello";
    }

    @GetMapping("/id/{id}")
    public String getId(@PathVariable("id") String id) {
        return String.format("hello %s", id);
    }

    @GetMapping("/ex")
    public String getEx() {
        throw new RuntimeException(("ex from hello!!!"));
    }

}