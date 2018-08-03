package com.laibao.prospring5.chapter4;

import com.laibao.prospring5.chapter4.factorybean.MessageDigester;
import com.laibao.prospring5.chapter4.factorybean.configuration.MessageDigesterConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author laibao wang
 * @date 2018-08-03
 * @version 1.0
 */
public class MessageDigestFactoryBeanTest {

    @Test
    public void testMessageDigest() {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("classpath:META-INF/spring/messagedigest.xml");
        applicationContext.refresh();

        MessageDigester digester = applicationContext.getBean("digester", MessageDigester.class);
        digester.digest("Hello World!");
        applicationContext.close();
    }

    @Test
    public void testMessageDigestConfig() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(MessageDigesterConfig.class);
        applicationContext.refresh();

        MessageDigester digester = applicationContext.getBean("digester", MessageDigester.class);
        digester.digest("金戈!");
        applicationContext.close();
    }

    @Test
    public void testMessageDigestFactory() {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("classpath:META-INF/spring/messagedigest.xml");
        applicationContext.refresh();

        MessageDigester digester = applicationContext.getBean("digesterByFactory", MessageDigester.class);
        digester.digest("Hello World!");
        applicationContext.close();
    }

}
