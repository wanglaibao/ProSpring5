package com.laibao.prospring5.chapter4;

import com.laibao.prospring5.chapter4.beandestruction.DestructionBean;
import com.laibao.prospring5.chapter4.beandestruction.DestructionBeanWithInterface;
import com.laibao.prospring5.chapter4.beandestruction.DestructionBeanWithJSR250;
import com.laibao.prospring5.chapter4.beandestruction.DestructionConfigBean;
import com.laibao.prospring5.chapter4.beandestruction.configuration.DestructionBeanConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author laibao wang
 * @date 2018-08-02
 * @version 1.0
 */
public class DestructionBeanTest {

    @Test
    public void testDestructionBean(){
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("classpath:META-INF/spring/destruction.xml");
        applicationContext.refresh();

        DestructionBean bean = applicationContext.getBean("destruction",DestructionBean.class);
        System.out.println("Calling destroy()");
        applicationContext.destroy();
        System.out.println("Called destroy()");
    }

    @Test
    public void testDestructionBeanWithInterface(){
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("classpath:META-INF/spring/destruction1.xml");
        applicationContext.refresh();
        DestructionBeanWithInterface bean = applicationContext.getBean("destruction", DestructionBeanWithInterface.class);
        System.out.println("Calling destroy()");
        //applicationContext.close();
        applicationContext.registerShutdownHook();
        System.out.println("Called destroy()");
    }

    @Test
    public void testDestructionBeanWithJSR250(){
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("classpath:META-INF/spring/destruction2.xml");
        applicationContext.refresh();
        DestructionBeanWithJSR250 bean = applicationContext.getBean("destruction", DestructionBeanWithJSR250.class);
        System.out.println("Calling destroy()");
        applicationContext.close();
        System.out.println("Called destroy()");
    }

    @Test
    public void testDestructionBeanConfig() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(DestructionBeanConfig.class);
        applicationContext.refresh();
        DestructionConfigBean destructionBean = applicationContext.getBean("destructionBean", DestructionConfigBean.class);
        System.out.println("Calling destroy()");
        applicationContext.close();
        System.out.println("Called destroy()");
    }

    @Test
    public void testDestructionBeanWithHook() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(DestructionBeanConfig.class);
        applicationContext.refresh();
        DestructionConfigBean destructionBean = applicationContext.getBean("destructionBean", DestructionConfigBean.class);
        System.out.println("Calling destroy()");
        applicationContext.registerShutdownHook();
        System.out.println("Called destroy()");
    }
}
