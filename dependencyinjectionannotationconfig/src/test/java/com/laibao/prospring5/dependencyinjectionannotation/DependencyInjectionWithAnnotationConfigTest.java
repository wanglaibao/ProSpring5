package com.laibao.prospring5.dependencyinjectionannotation;

import com.laibao.prospring5.dependencyinjectionannotation.configuration.AppConfig;
import com.laibao.prospring5.dependencyinjectionannotation.domain.Amount;
import com.laibao.prospring5.dependencyinjectionannotation.service.TransferService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laibao wang
 * @date 2018-08-05
 * @version 1.0
 */
public class DependencyInjectionWithAnnotationConfigTest {

    @Test
    public void testDependencyInjectionWithAnnotationConfig() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();

        TransferService transferService = applicationContext.getBean("transferService",TransferService.class);
        Amount amount = new Amount();
        amount.setBalance(9000.0);
        transferService.transferAmount(800,901,amount);
        System.out.println();
        applicationContext.close();
    }
}
