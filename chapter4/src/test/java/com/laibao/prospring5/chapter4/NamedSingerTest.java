package com.laibao.prospring5.chapter4;

import com.laibao.prospring5.chapter4.springaware.NamedSinger;
import com.laibao.prospring5.chapter4.springaware.configuration.NamedSingerConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author laibao wang
 * @date 2018-08-03
 * @version 1.0
 */
public class NamedSingerTest {

    @Test
    public void testNamedSinger() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocation("classpath:META-INF/spring/namedsinger.xml");
        applicationContext.refresh();
        NamedSinger namedSinger = applicationContext.getBean("namedSinger",NamedSinger.class);
        namedSinger.sing();
        System.out.println("namedSinger's name is " + namedSinger.getName());
        applicationContext.close();
    }

    @Test
    public void testNamedSingerConfig() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(NamedSingerConfig.class);
        applicationContext.refresh();

        NamedSinger namedSinger = applicationContext.getBean("namedSinger",NamedSinger.class);
        namedSinger.sing();
        System.out.println("namedSinger's name is " + namedSinger.getName());
        applicationContext.close();
    }
}
