package com.xiao.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class TimePage{
    @RequestMapping("/time")
    public String Time()
    {
        LocalDate localDate = LocalDate.now();

        return localDate.toString();
    }
}