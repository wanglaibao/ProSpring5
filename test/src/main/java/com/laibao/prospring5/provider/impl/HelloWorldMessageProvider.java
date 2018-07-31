package com.laibao.prospring5.provider.impl;

import com.laibao.prospring5.provider.MessageProvider;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class HelloWorldMessageProvider implements MessageProvider{

    @Override
    public String getMessage(String message) {
        return "Hello World!" + message;
    }
}
