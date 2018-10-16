package com.xiao.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginLog {
    @RequestMapping("/login")
    public String Login(){
        return "Login ";
    }


}


