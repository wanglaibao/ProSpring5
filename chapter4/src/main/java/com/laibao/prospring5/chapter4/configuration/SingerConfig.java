package com.laibao.prospring5.chapter4.configuration;

import com.laibao.prospring5.chapter4.Singer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author laibao wang
 * @date 2018-08-02
 * @version 1.0
 */

@Configuration
public class SingerConfig {

    @Lazy
    @Bean(initMethod = "init")
    public Singer singerOne() {
        Singer singer = new Singer();
        singer.setName("老王");
        singer.setAge(39);
        return singer;
    }

    @Lazy
    @Bean(initMethod = "init")
    public Singer singerTwo() {
        Singer singer = new Singer();
        singer.setAge(72);
        return singer;
    }

    @Lazy
    @Bean(initMethod = "init")
    public Singer singerThree() {
        Singer singer = new Singer();
        singer.setName("老姜汤");
        return singer;
    }
}
