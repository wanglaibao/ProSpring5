package com.laibao.prospring5;

import com.laibao.prospring5.configuration.HelloWorldConfiguration;
import com.laibao.prospring5.render.MessageRender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class HelloWorldSpringAnnotated {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(HelloWorldConfiguration.class);
        applicationContext.refresh();

        MessageRender messageRender = applicationContext.getBean("render", MessageRender.class);
        messageRender.render();
        applicationContext.close();
    }
}
