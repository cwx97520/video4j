package com.chenwenxin.video4j.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping(path = "/")
    public String hello(){
        return "hello world";
    }
}
