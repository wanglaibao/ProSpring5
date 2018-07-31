package com.laibao.spring5.chapter3.render.impl;


import com.laibao.spring5.chapter3.provider.MessageProvider;
import com.laibao.spring5.chapter3.render.MessageRender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
@Component("render")
public class StandardOutMessageRender implements MessageRender {

    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class:" + StandardOutMessageRender.class.getName());
        }
        System.out.println(messageProvider.getMessage("Pro Spring"));
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
