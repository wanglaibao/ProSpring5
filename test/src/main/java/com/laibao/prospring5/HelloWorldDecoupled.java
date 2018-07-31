package com.laibao.prospring5;

import com.laibao.prospring5.provider.MessageProvider;
import com.laibao.prospring5.provider.impl.HelloWorldMessageProvider;
import com.laibao.prospring5.renderer.MessageRender;
import com.laibao.prospring5.renderer.impl.StandardOutMessageRenderer;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageRender messageRender = new StandardOutMessageRenderer();
        MessageProvider messageProvider = new HelloWorldMessageProvider();
        messageRender.setMessageProvider(messageProvider);
        messageRender.render();
    }
}
