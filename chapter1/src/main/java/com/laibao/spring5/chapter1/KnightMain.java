package com.laibao.spring5.chapter1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author laibao wang
 * @date 2018-01-01
 * @version 1.0
 */
public class KnightMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
        Knight knight = applicationContext.getBean(Knight.class);
        knight.embarkOnQuest();
        applicationContext.close();
    }

}
