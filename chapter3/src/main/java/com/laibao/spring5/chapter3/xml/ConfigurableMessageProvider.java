package com.laibao.spring5.chapter3.xml;

import com.laibao.spring5.chapter3.provider.MessageProvider;

/**
 * @author laibao wang
 * @date 2018-08-01
 * @version 1.0
 */
public class ConfigurableMessageProvider implements MessageProvider {

    private String message;
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage(String message) {
        return message;
    }
}
