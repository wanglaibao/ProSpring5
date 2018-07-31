package com.laibao.spring5.chapter3.xmlbeanfactory;

import com.laibao.spring5.chapter3.injection.Oracle;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class XmlBeanFactoryTest {

    @Test
    public void testBeanFactoryInitialize() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader =  new XmlBeanDefinitionReader(beanFactory);
        //can not do as this : ClassPathResource resource = new ClassPathResource("META-INF/spring/xml-beanfactory-config.xml");
        ClassPathResource resource = new ClassPathResource("META-INF/spring/xml-beanfactory-config.xml");
        beanDefinitionReader.loadBeanDefinitions(resource);

        Oracle oracle = beanFactory.getBean("oracle", Oracle.class);
        System.out.println(oracle.defineMeaningOfLife());

        System.out.println();
        System.out.println();

        Oracle oracle1 = beanFactory.getBean("wiseworm",Oracle.class);
        System.out.println(oracle.defineMeaningOfLife());
    }
}
