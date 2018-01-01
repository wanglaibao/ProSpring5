package com.laibao.spring5.chapter1;

import com.laibao.spring5.chapter1.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laibao wang
 * @date 2018-01-01
 * @version 1.0
 */
public class ConfigKnightMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = applicationContext.getBean(Knight.class);
        knight.embarkOnQuest();


        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
        String hello = helloWorld.sayHello();
        System.out.println(hello);

        applicationContext.close();
    }

}
