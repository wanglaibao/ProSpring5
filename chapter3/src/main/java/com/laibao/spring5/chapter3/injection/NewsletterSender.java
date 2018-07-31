package com.laibao.spring5.chapter3.injection;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public interface NewsletterSender {
    void setSmtpServer(String smtpServer);
    String getSmtpServer();
    void setFromAddress(String fromAddress);
    String getFromAddress();
    void send();
}
