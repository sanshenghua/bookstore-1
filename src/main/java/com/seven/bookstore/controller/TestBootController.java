package com.seven.bookstore.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TestBootController {
    private final Logger log = LoggerFactory.getLogger(TestBootController.class);

    @GetMapping("/home")
    public String home(){
        log.info("hello home");
        return "home";
    }

}
