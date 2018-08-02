package com.laibao.prospring5.chapter4.springaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author laibao wang
 * @date 2018-08-03
 * @version 1.0
 */
public class ShutdownHookBean implements ApplicationContextAware{

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        if (applicationContext instanceof GenericApplicationContext) {
            ((GenericApplicationContext) applicationContext).registerShutdownHook();
        }
    }
}
