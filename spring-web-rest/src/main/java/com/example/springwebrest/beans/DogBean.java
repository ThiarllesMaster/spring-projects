package com.example.springwebrest.beans;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class DogBean extends AnimalBean {

    public void eat(String food) {
        super.eat(food);
    }
}
