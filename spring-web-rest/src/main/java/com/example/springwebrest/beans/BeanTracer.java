package com.example.springwebrest.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanTracer implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(final Object bean, final String beanName) throws BeansException {
        System.out.println("Bean Rafinha '" + beanName + "' created : " + bean.toString());
        if (beanName.equals("firstBean")) {
            System.out.println("Eu sou seu papai");
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
