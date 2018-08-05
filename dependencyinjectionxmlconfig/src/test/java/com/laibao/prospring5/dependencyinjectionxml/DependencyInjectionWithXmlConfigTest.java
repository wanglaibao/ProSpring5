package com.laibao.prospring5.dependencyinjectionxml;

import com.laibao.prospring5.dependencyinjectionxml.domain.Amount;
import com.laibao.prospring5.dependencyinjectionxml.service.TransferService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author laibao wang
 * @date 2018-08-05
 * @version 1.0
 */
public class DependencyInjectionWithXmlConfigTest {

    @Test
    public void testDependencyInjectionWithXmlConfig() {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("classpath:META-INF/spring/beans.xml");
        applicationContext.refresh();

        TransferService transferService1 = applicationContext.getBean("transferByConstructor",TransferService.class);
        Amount amount1 = new Amount();
        amount1.setBalance(3000.0);
        transferService1.transferAmount(100,101,amount1);

        System.out.println();

        TransferService transferService2 = applicationContext.getBean("transferBySetter",TransferService.class);
        Amount amount2 = new Amount();
        amount1.setBalance(5000.0);
        transferService1.transferAmount(200,201,amount2);

        applicationContext.registerShutdownHook();
    }
}
