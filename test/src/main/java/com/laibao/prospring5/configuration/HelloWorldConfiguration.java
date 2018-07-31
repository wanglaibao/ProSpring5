package com.laibao.prospring5.configuration;

import com.laibao.prospring5.provider.MessageProvider;
import com.laibao.prospring5.provider.impl.HelloWorldMessageProvider;
import com.laibao.prospring5.render.MessageRender;
import com.laibao.prospring5.render.impl.StandardOutMessageRender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
@Configuration
public class HelloWorldConfiguration {

    // equivalent to <bean id="provider" class=".."/>
    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    // equivalent to <bean id="render" class=".."/>
    @Bean
    public MessageRender render(){
        MessageRender render = new StandardOutMessageRender();
        render.setMessageProvider(provider());
        return render;
    }
}
