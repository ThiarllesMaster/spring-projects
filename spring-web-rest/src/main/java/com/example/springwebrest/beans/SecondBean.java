package com.example.springwebrest.beans;

import org.springframework.stereotype.Component;

@Component
public class SecondBean {

    public String fromSecondBean() {
        return "From Second Bean";
    }
}
