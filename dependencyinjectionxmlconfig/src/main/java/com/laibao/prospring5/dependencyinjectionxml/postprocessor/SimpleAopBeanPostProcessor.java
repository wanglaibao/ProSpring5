package com.laibao.prospring5.dependencyinjectionxml.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author laibao wang
 * @date 2018-08-06
 * @version 1.0
 */
public class SimpleAopBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In Before bean Initialization method. Bean name is "+beanName + " and Bean class name is " +bean.getClass().getName());
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In After bean Initialization method. Bean name is "+beanName + " and Bean class name is " +bean.getClass().getName());
        return bean;
    }
}
