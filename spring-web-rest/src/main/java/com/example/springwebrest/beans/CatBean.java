package com.example.springwebrest.beans;

import org.springframework.stereotype.Component;

@Component("catBean")
public class CatBean extends AnimalBean {

    public void eat(String food) {
        super.eat(food);
    }
}
