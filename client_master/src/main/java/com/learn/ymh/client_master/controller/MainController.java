package com.learn.ymh.client_master.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/api/")
public class MainController {

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(){
        return "this is the client master";
    }
}
