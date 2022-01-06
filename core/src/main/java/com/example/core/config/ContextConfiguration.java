package com.example.core.config;

import com.example.beans.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("com.example")
public class ContextConfiguration {

    @Bean
    public AccountService accountService() {
        System.out.println("accountService() called");
        return new AccountService();
    }

    @Bean
    @Primary
    public AccountService accountService2() {
        System.out.println("accountService2() called");
        return new AccountService();

    }
}
