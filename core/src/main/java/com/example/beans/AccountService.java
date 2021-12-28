package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class AccountService {

    @Value("#{1 + 1}")
    private Integer years;

    @Value("${year}")
    private Integer year;


     public String getAccount(String accountNumber) {
        return "000".concat(Integer.valueOf(years).toString());
    }

}
