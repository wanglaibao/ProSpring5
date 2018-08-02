package com.laibao.prospring5.chapter4;

import com.laibao.prospring5.chapter4.beancreation.Singer;
import com.laibao.prospring5.chapter4.beancreation.SingerInitializingBean;
import com.laibao.prospring5.chapter4.beancreation.SingerWithJSR250;
import com.laibao.prospring5.chapter4.beancreation.configuration.SingerConfig;
import org.junit.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.lang.Nullable;

/**
 * @author laibao wang
 * @date 2018-08-02
 * @version 1.0
 */
public class SingerTest {

    @Test
    public void testSingerInitializeCallback() {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("classpath:META-INF/spring/singer.xml");
        applicationContext.refresh();

        BaseUtils.getBean("singerOne",Singer.class,applicationContext);
        BaseUtils.getBean("singerTwo",Singer.class,applicationContext);
        BaseUtils.getBean("singerThree",Singer.class,applicationContext);

        applicationContext.close();
    }

    @Test
    public void testSingerInitializeCallback2() {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("classpath:META-INF/spring/singer2.xml");
        applicationContext.refresh();

        BaseUtils.getBean("singerOne",Singer.class,applicationContext);
        BaseUtils.getBean("singerTwo",Singer.class,applicationContext);
        BaseUtils.getBean("singerThree",Singer.class,applicationContext);

        applicationContext.close();
    }

    @Test
    public void testSingerInitializingBeanCallback() {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("classpath:META-INF/spring/singer3.xml");
        applicationContext.refresh();

        BaseUtils.getBean("singerOne",SingerInitializingBean.class,applicationContext);
        BaseUtils.getBean("singerTwo",SingerInitializingBean.class,applicationContext);
        BaseUtils.getBean("singerThree",SingerInitializingBean.class,applicationContext);

        applicationContext.close();
    }

    @Test
    public void testSingerWithJSR250() {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("classpath:META-INF/spring/singer4.xml");
        applicationContext.refresh();

        BaseUtils.getBean("singerOne",SingerWithJSR250.class,applicationContext);
        BaseUtils.getBean("singerTwo",SingerWithJSR250.class,applicationContext);
        BaseUtils.getBean("singerThree",SingerWithJSR250.class,applicationContext);

        applicationContext.close();
    }

    @Test
    public void testSingerWithConfiguration() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(SingerConfig.class);
        applicationContext.refresh();

        BaseUtils.getBean("singerOne",Singer.class,applicationContext);
        BaseUtils.getBean("singerTwo",Singer.class,applicationContext);
        BaseUtils.getBean("singerThree",Singer.class,applicationContext);

        applicationContext.close();
    }

}
