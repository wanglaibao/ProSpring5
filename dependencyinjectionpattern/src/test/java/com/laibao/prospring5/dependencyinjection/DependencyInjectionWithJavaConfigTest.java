package com.laibao.prospring5.dependencyinjection;

import com.laibao.prospring5.dependencyinjection.config.AppConfiguration;
import com.laibao.prospring5.dependencyinjection.domain.Amount;
import com.laibao.prospring5.dependencyinjection.service.TransferService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laibao wang
 * @date 2018-08-04
 * @version 1.0
 */
public class DependencyInjectionWithJavaConfigTest {

    @Test
    public void testDependencyInjectionWithJavaConfig() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfiguration.class);
        applicationContext.refresh();

        TransferService transferService = applicationContext.getBean("transferService",TransferService.class);
        Amount amount = new Amount();
        amount.setBalance(3000.0);
        transferService.transferAmount(1000,1001,amount);
    }
}
