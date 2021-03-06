package com.laibao.prospring5;

import com.laibao.prospring5.provider.MessageProvider;
import com.laibao.prospring5.provider.impl.HelloWorldMessageProvider;
import com.laibao.prospring5.render.MessageRender;
import com.laibao.prospring5.render.impl.StandardOutMessageRender;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageRender messageRender = new StandardOutMessageRender();
        MessageProvider messageProvider = new HelloWorldMessageProvider();
        messageRender.setMessageProvider(messageProvider);
        messageRender.render();
    }
}
