package com.laibao.prospring5.chapter4.factorybean;

import java.security.MessageDigest;

/**
 * @author laibao wang
 * @date 2018-08-03
 * @version 1.0
 */
public class MessageDigester {

    private MessageDigest digesterOne;

    private MessageDigest digesterTwo;

    public void setDigesterOne(MessageDigest digesterOne) {
        this.digesterOne = digesterOne;
    }

    public void setDigesterTwo(MessageDigest digesterTwo) {
        this.digesterTwo = digesterTwo;
    }

    public void digest(String msg) {
        System.out.println("Using digesterOne");
        digest(msg, digesterOne);
        System.out.println("Using digesterTwo");
        digest(msg, digesterTwo);
    }
    private void digest(String msg, MessageDigest digest) {
        System.out.println("Using alogrithm: " + digest.getAlgorithm());
        digest.reset();
        byte[] bytes = msg.getBytes();
        byte[] out = digest.digest(bytes);
        System.out.println(out);
    }
}
