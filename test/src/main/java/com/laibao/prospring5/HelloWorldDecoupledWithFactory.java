package com.laibao.prospring5;

import com.laibao.prospring5.factory.MessageSupportFactory;
import com.laibao.prospring5.provider.MessageProvider;
import com.laibao.prospring5.renderer.MessageRender;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class HelloWorldDecoupledWithFactory {

    public static void main(String[] args) {
        MessageRender messageRender = MessageSupportFactory.getInstance().getMessageRender();
        MessageProvider messageProvider = MessageSupportFactory.getInstance().getMessageProvider();
        messageRender.setMessageProvider(messageProvider);
        messageRender.render();
    }
}
