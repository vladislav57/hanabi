package ru.petproject.hanabi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/service")
public class TestController {

    @RequestMapping(path = "/test")
    public String testMethod() {
        return "Hello";
    }

}
