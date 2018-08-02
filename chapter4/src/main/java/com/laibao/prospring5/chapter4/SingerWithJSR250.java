package com.laibao.prospring5.chapter4;

import org.apache.commons.lang3.StringUtils;

import javax.annotation.PostConstruct;

/**
 * @author laibao wang
 * @date 2018-08-02
 * @version 1.0
 */
public class SingerWithJSR250 {
    private static final String DEFAULT_NAME = "金戈";

    private String name;

    private int age = Integer.MIN_VALUE;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @PostConstruct
    private void init() throws Exception {
        System.out.println("Initializing bean");
        if (StringUtils.isBlank(name)) {
            System.out.println("Using default name");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("You must set the age property of any beans of type " + Singer.class);
        }
    }

    @Override
    public String toString() {
        return "SingerWithJSR250{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
