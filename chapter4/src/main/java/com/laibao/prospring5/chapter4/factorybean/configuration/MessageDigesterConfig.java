package com.laibao.prospring5.chapter4.factorybean.configuration;

import com.laibao.prospring5.chapter4.factorybean.MessageDigestFactoryBean;
import com.laibao.prospring5.chapter4.factorybean.MessageDigester;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author laibao wang
 * @date 2018-08-03
 * @version 1.0
 */
@Configuration
public class MessageDigesterConfig {

    @Lazy
    @Bean
    public MessageDigestFactoryBean shaDigest() {
        MessageDigestFactoryBean factoryBean = new MessageDigestFactoryBean();
        factoryBean.setAlgorithmName("SHA1");
        return factoryBean;
    }

    @Lazy
    @Bean
    public MessageDigestFactoryBean defaultDigest() {
        MessageDigestFactoryBean factoryBean = new MessageDigestFactoryBean();
        return factoryBean;
    }

    @Bean
    MessageDigester digester() throws Exception {
        MessageDigester messageDigester = new MessageDigester();
        messageDigester.setDigesterOne(shaDigest().getObject());
        messageDigester.setDigesterTwo(defaultDigest().getObject());
        return messageDigester;
    }
}
