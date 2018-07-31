package com.laibao.spring5.chapter3.container;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public interface Container {
    Object getDependency(String key);
}
