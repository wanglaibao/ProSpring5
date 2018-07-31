package com.laibao.spring5.chapter3;

import com.laibao.spring5.chapter3.render.MessageRender;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class DependencyPullTest {

    @Test
    public void testDependencyPull() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocation("classpath:META-INF/spring/beans.xml");
        applicationContext.refresh();

        MessageRender messageRender = applicationContext.getBean("render", MessageRender.class);
        messageRender.render();
        applicationContext.close();
    }
}
