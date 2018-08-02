package com.laibao.prospring5.chapter4.beancreation;

import org.apache.commons.lang3.StringUtils;

/**
 * @author laibao wang
 * @date 2018-08-01
 * @version 1.0
 */
public class Singer {
    private static final String DEFAULT_NAME = "金戈";

    private String name;

    private int age = Integer.MIN_VALUE;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void init() {
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
        return "Singer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
