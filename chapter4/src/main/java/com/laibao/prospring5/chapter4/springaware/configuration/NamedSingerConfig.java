package com.laibao.prospring5.chapter4.springaware.configuration;

import com.laibao.prospring5.chapter4.springaware.NamedSinger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author laibao wang
 * @date 2018-08-03
 * @version 11.0
 */
@Configuration
public class NamedSingerConfig {

    @Bean
    public NamedSinger namedSinger() {
        NamedSinger singer = new NamedSinger();
        return singer;
    }
}
