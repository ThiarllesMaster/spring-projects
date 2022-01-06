package com.example.springwebrest.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class FirstBean {

    private SecondBean secondBean;

    public String fromFirstBean() {
        return "From the First Bean".concat(secondBean.fromSecondBean());
    }

    @Autowired
    public void setSecondBean(final SecondBean secondBean) {
        this.secondBean = secondBean;
    }
}
