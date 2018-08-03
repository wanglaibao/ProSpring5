package com.laibao.prospring5.chapter4.factorybean;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.security.MessageDigest;

/**
 * @author laibao wang
 * @date 2018-08-03
 * @version 1.0
 */
public class MessageDigestFactoryBean implements FactoryBean<MessageDigest>,InitializingBean{

    private String DEFAULT_ALGORITHM_NAME = "MD5";

    private String algorithmName;

    private MessageDigest messageDigest;

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    @Override
    public MessageDigest getObject() throws Exception {
        return messageDigest;
    }

    @Override
    public Class<?> getObjectType() {
        return MessageDigest.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (StringUtils.isBlank(algorithmName)) {
            algorithmName = DEFAULT_ALGORITHM_NAME;
        }
        messageDigest = MessageDigest.getInstance(algorithmName);
    }
}
