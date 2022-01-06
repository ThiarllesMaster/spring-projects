package com.example.springwebrest.api;

import com.example.springwebrest.beans.AnimalBean;
import com.example.springwebrest.beans.FirstBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    FirstBean bean;

    @Autowired
    @Qualifier("catBean")
    AnimalBean animalBean;

    @GetMapping("/hello")
    public String hello() {
        animalBean.eat("");
        return bean.fromFirstBean();
    }
}
