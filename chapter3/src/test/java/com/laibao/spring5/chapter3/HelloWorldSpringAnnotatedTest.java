package com.laibao.spring5.chapter3;

import com.laibao.spring5.chapter3.configuration.HelloWorldConfiguration;
import com.laibao.spring5.chapter3.render.MessageRender;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laibao wang
 * @date 2018-08-01
 * @version 1.0
 */
public class HelloWorldSpringAnnotatedTest {

    @Test
    public void testHelloWorldSpringAnnotated() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(HelloWorldConfiguration.class);
        applicationContext.refresh();
        MessageRender messageRender = applicationContext.getBean("render", MessageRender.class);
        messageRender.render();
        applicationContext.close();
    }
}
