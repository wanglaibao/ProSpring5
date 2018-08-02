package com.laibao.prospring5.chapter4.beancreation;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author laibao wang
 * @date 2018-08-02
 * @version 1.0
 */
public class SingerInitializingBean implements InitializingBean {

    private static final String DEFAULT_NAME = "金戈";

    private String name;

    private int age = Integer.MIN_VALUE;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        if (StringUtils.isBlank(name)) {
            System.out.println("Using default name "+DEFAULT_NAME);
            name = DEFAULT_NAME;
        }

        if (age == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("You must set the age property of any beans of type " + SingerInitializingBean.class);
        }
    }

    @Override
    public String toString() {
        return "SingerInitializingBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
