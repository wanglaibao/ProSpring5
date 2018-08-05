package com.laibao.prospring5.dependencyinjection.config;

import com.laibao.prospring5.dependencyinjection.postprocessor.SimpleAopBeanPostProcessor;
import com.laibao.prospring5.dependencyinjection.repository.AccountRepository;
import com.laibao.prospring5.dependencyinjection.repository.TransferRepository;
import com.laibao.prospring5.dependencyinjection.repository.impl.JdbcAccountRepositoryImpl;
import com.laibao.prospring5.dependencyinjection.repository.impl.JdbcTransferRepositoryImpl;
import com.laibao.prospring5.dependencyinjection.service.TransferService;
import com.laibao.prospring5.dependencyinjection.service.impl.TransferServiceImpl;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @author laibao wang
 * @date 2018-08-04
 * @version 1.0
 */
@Configuration
public class AppConfiguration {

    @Bean
    public TransferService transferService() {
        return new TransferServiceImpl(accountRepository(), transferRepository());
    }

    @Bean(initMethod = "populateCache")
    public AccountRepository accountRepository() {
        return new JdbcAccountRepositoryImpl();
    }

    @Bean
    public TransferRepository transferRepository() {
        return new JdbcTransferRepositoryImpl();
    }

    @Bean
    public BeanPostProcessor beanPostProcessor() {
        BeanPostProcessor beanPostProcessor = new SimpleAopBeanPostProcessor();
        return beanPostProcessor;
    }
}
