package com.laibao.prospring5.dependencyinjectionxml.service.impl;

/**
 * @author laibao wang
 * @date 2018-08-06
 * @version 1.0
 */
public class HelloServiceImpl {
    public String sayHello(String message) {
        return "hello, nice to meet you, " + message;
    }
}
