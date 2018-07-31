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

    /**
     * This kind of IoC is not only prevalent in JEE-based applications (using EJB 2.1 or prior versions), which
     * make extensive use of JNDI lookups to obtain dependencies from a registry, but also pivotal to working with
     * Spring in many environments.
     */
    @Test
    public void testDependencyPull() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocation("classpath:META-INF/spring/beans.xml");
        applicationContext.refresh();

        MessageRender messageRender = applicationContext.getBean("render", MessageRender.class);
        messageRender.render();
        if (applicationContext != null ) {
            applicationContext.close();
        }
    }
}
