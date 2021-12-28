package com.example.core.config;

import com.example.beans.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("com.example")
public class ContextConfiguration {

    @Bean
    public AccountService accountService() {
        return new AccountService();
    }

}
