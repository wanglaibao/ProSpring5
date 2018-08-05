package com.laibao.prospring5.dependencyinjectionannotation.configuration;

import com.laibao.prospring5.dependencyinjectionannotation.SimpleAopBeanPostProcessor;
import com.laibao.prospring5.dependencyinjectionannotation.repository.AccountRepository;
import com.laibao.prospring5.dependencyinjectionannotation.service.TransferService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author laibao wang
 * @date 2018-08-05
 * @version 1.0
 */
@Configuration
@ComponentScan(basePackageClasses = {AccountRepository.class, TransferService.class, SimpleAopBeanPostProcessor.class})
//@ComponentScan(basePackages = {"com.laibao.prospring5.dependencyinjectionannotation.repository","com.laibao.prospring5.dependencyinjectionannotation.service"})
public class AppConfig {
}
