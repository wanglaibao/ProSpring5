package com.laibao.spring5.chapter3.constructorinjection;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class ConstructorInjection {

    private final Object dependency;

    private ConstructorInjection(Object dependency) {
        this.dependency = dependency;
    }

    public String toString() {
        return dependency.toString();
    }
}
