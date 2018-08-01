package com.laibao.prospring5.chapter4;

import org.junit.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.lang.Nullable;

/**
 * @author laibao wang
 * @date 2018-08-02
 * @version 1.0
 */
public class SingerTest {

    @Test
    public void testSingerInitializeCallback() {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("classpath:META-INF/spring/singer.xml");
        applicationContext.refresh();

        getBean("singerOne",Singer.class,applicationContext);
        getBean("singerTwo",Singer.class,applicationContext);
        getBean("singerThree",Singer.class,applicationContext);

        applicationContext.close();
    }

    private static <T> T getBean(String beanName,@Nullable Class<T> requiredType,ApplicationContext applicationContext) {
        try {
            T t =  applicationContext.getBean(beanName,requiredType);
            System.out.println(t);
            return t;
        } catch (BeanCreationException ex) {
            System.out.println("An error occured in bean configuration: " + ex.getMessage());
            return null;
        }
    }
}
