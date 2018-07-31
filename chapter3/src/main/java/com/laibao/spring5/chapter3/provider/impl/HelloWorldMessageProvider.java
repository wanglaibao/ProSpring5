package com.laibao.spring5.chapter3.provider.impl;


import com.laibao.spring5.chapter3.provider.MessageProvider;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage(String message) {
        return "Hello World!" + message;
    }
}
