package com.xiao.server.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class LoginLog {
    //@ResponseBody
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String Login(@RequestParam("name") String name, @RequestParam("pwd") String pwd){
        System.out.println("-----------login GET");
        System.out.println("name:"+name);
        System.out.println("pwd: "+pwd);
        return ("login:"+name+"  "+pwd);
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String Login2(@RequestParam("name") String name, @RequestParam("pwd") String pwd){
        System.out.println("-----------login POST");
        System.out.println("name:"+name);
        System.out.println("pwd: "+pwd);
        return ("login:"+name+"  "+pwd);
    }


}


