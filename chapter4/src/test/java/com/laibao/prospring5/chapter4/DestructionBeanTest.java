package com.laibao.prospring5.chapter4;

import com.laibao.prospring5.chapter4.beandestruction.DestructionBean;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author laibao wang
 * @date 2018-08-02
 * @version 1.0
 */
public class DestructionBeanTest {

    @Test
    public void testDestructiveBean(){
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("classpath:META-INF/spring/destruction.xml");
        applicationContext.refresh();

        DestructionBean bean = applicationContext.getBean("destruction",DestructionBean.class);
        System.out.println("Calling destroy()");
        applicationContext.destroy();
        //applicationContext.close();
        System.out.println("Called destroy()");
    }
}
