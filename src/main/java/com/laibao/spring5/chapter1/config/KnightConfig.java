package com.laibao.spring5.chapter1.config;

import com.laibao.spring5.chapter1.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public HelloWorld hello() {
        return new HelloWorld();
    }
}
