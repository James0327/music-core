package com.jw.server;

import org.springframework.boot.SpringApplication;

import java.util.concurrent.CountDownLatch;


import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Application {

	public static void main(String[] args) throws InterruptedException{

		SpringApplication.run(Application.class, args);

		new CountDownLatch(1).await(); //hold住应用，防止provider退出
	}
	
}
