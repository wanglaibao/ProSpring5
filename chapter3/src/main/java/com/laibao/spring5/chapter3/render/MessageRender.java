package com.laibao.spring5.chapter3.render;
import com.laibao.spring5.chapter3.provider.MessageProvider;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public interface MessageRender {
    void render();

    void setMessageProvider(MessageProvider messageProvider);

    MessageProvider getMessageProvider();
}
