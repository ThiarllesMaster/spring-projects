package com.example.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Component
@Aspect
@EnableAspectJAutoProxy
public class MyAspect {

    @Before("execution (public String getAccount(..))")
    public void log() {
        System.out.println("Get Account called");
    }
}
