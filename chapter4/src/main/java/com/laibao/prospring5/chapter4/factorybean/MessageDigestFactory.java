package com.laibao.prospring5.chapter4.factorybean;

import java.security.MessageDigest;

/**
 * @author laibao wang
 * @date 2018-08-03
 * @version 1.0
 */
public class MessageDigestFactory {

    private String algorithmName = "MD5";

    public MessageDigest createInstance() throws Exception {
        return MessageDigest.getInstance(algorithmName);
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }
}
