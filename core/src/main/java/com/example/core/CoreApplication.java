package com.example.core;

import com.example.beans.AccountService;
import com.example.core.config.ContextConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ContextConfiguration.class);
		AccountService accountService = ctx.getBean(AccountService.class);
		System.out.println(accountService.getAccount(""));
	}

}
