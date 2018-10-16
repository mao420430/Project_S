package com.xiao.server.controller;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class TimePage{
    @RequestMapping("/time")
    public String Time()
    {
        LocalDate localDate = LocalDate.now();


        String message = "";

        message = message + localDate.toString() + "\r\n";


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MM dd HH:mm:ss E");
        message = message + simpleDateFormat.format(new Date());

        System.out.printf("message:"+message);

        return message;
    }
}