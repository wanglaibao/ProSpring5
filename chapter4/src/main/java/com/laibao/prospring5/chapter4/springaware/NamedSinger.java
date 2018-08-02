package com.laibao.prospring5.chapter4.springaware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author laibao wang
 * @date 2018-08-03
 * @version 1.0
 */
public class NamedSinger implements BeanNameAware{

    private String name;

    public void sing() {
        System.out.println("Singer " + name + " - sing()");
    }

    public String getName() {
        return name;
    }

    @Override
    public void setBeanName(String beanName) {
        this.name =beanName;
    }

    @Override
    public String toString() {
        return "NamedSinger{" +
                "name='" + name + '\'' +
                '}';
    }
}
