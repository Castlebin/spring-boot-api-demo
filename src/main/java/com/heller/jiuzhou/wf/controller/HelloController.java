package com.heller.jiuzhou.wf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/hello")
@RestController
public class HelloController {

    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}
