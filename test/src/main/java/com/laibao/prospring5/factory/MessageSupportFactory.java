package com.laibao.prospring5.factory;

import com.laibao.prospring5.provider.MessageProvider;
import com.laibao.prospring5.render.MessageRender;

import java.util.Properties;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class MessageSupportFactory {

    private static final MessageSupportFactory instance;

    private Properties properties;

    private MessageRender messageRender;

    private MessageProvider messageProvider;

    static {
        instance = new MessageSupportFactory();
    }

    private MessageSupportFactory() {
        properties = new Properties();
        try{
            properties.load(getClass().getResourceAsStream("/META-INF/message.properties"));
            String rendererClass = properties.getProperty("renderer.class");
            String providerClass = properties.getProperty("provider.class");

            messageRender = (MessageRender) Class.forName(rendererClass).newInstance();
            messageProvider = (MessageProvider) Class.forName(providerClass).newInstance();

        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRender getMessageRender() {
        return messageRender;
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
