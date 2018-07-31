package com.laibao.spring5.chapter3.setterinjection;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class SetterInjection {

    private Object dependency;

    public void setDependency(Object dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
