package com.xiao.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XiaoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiaoServerApplication.class, args);

		System.out.println("XiaoServerApplication success");
	}
}
