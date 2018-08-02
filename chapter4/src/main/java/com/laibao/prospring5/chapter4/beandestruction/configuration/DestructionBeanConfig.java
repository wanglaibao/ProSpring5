package com.laibao.prospring5.chapter4.beandestruction.configuration;

import com.laibao.prospring5.chapter4.beandestruction.DestructionBean;
import com.laibao.prospring5.chapter4.beandestruction.DestructionConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

/**
 * @author laibao wang
 * @date 2018-08-02
 * @version 1.0
 */
public class DestructionBeanConfig {

    @Lazy
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public DestructionConfigBean destructionBean() {
        DestructionConfigBean destructionBean = new DestructionConfigBean();
        destructionBean.setFilePath(System.getProperty("java.io.tmpdir")+System.getProperty("file.separator"+"test.txt"));
        return destructionBean;
    }
}
