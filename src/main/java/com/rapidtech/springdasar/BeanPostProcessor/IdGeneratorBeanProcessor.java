package com.rapidtech.springdasar.BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.UUID;

public class IdGeneratorBeanProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
        if (bean instanceof IdAware){
            IdAware idAware = (IdAware) bean;
            idAware.setId(UUID.randomUUID().toString());
        }
        return bean;
    }
}
