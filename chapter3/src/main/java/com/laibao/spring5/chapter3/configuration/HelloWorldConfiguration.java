package com.laibao.spring5.chapter3.configuration;

import com.laibao.spring5.chapter3.provider.MessageProvider;
import com.laibao.spring5.chapter3.provider.impl.HelloWorldMessageProvider;
import com.laibao.spring5.chapter3.render.MessageRender;
import com.laibao.spring5.chapter3.render.impl.StandardOutMessageRender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author laibao wang
 * @date 2018-08-01
 * @version 1.0
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRender render(){
        MessageRender render = new StandardOutMessageRender();
        render.setMessageProvider(provider());
        return render;
    }
}
