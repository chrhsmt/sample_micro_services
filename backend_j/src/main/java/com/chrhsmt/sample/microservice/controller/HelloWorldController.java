package com.chrhsmt.sample.microservice.controller;

import com.chrhsmt.sample.microservice.model.Contact;
import com.chrhsmt.sample.microservice.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("hello")
@Scope("request")
public class HelloWorldController {

    @Autowired
    ContactRepository contactRepository;

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

    // http :8080/hello/contacts
    @GetMapping("/contacts")
    public String getContactList() {
        List<Contact> list = contactRepository.findAll();
        return list.stream().map(c -> c.getName()).collect(Collectors.joining());
    }

    // curl -XPOST http://localhost:8080/hello/contacts -H "Content-Type: application/json" -d '{"name": "helo"}'
    @PostMapping("/contacts")
    public String addAction(@RequestBody(required = false) Contact contact) {
        contactRepository.save(contact);
        return "ok";
    }
}