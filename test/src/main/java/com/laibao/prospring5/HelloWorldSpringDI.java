package com.laibao.prospring5;

import com.laibao.prospring5.render.MessageRender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class HelloWorldSpringDI {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocation("classpath:META-INF/spring/beans.xml");
        applicationContext.refresh();

        MessageRender messageRender = applicationContext.getBean("render", MessageRender.class);
        messageRender.render();
        applicationContext.close();
    }
}
