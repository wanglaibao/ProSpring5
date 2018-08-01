package com.laibao.spring5.chapter3;

import com.laibao.spring5.chapter3.render.MessageRender;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author laibao wang
 * @date 2018-08-01
 * @version 1.0
 */
public class DeclareSpringComponentsTest {

    @Test
    public void testSetXXXInjection() {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load(new String[]{"classpath:META-INF/spring/app-context-config.xml","classpath:META-INF/spring/xml-beanfactory-config.xml"});
        applicationContext.refresh();

        MessageRender messageRender = applicationContext.getBean("render", MessageRender.class);
        messageRender.render();

        System.out.println();
        System.out.println();

        MessageRender newMessageRender = applicationContext.getBean("render_new", MessageRender.class);
        newMessageRender.render();

        applicationContext.close();
    }
}
