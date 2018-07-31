package com.laibao.spring5.chapter3.service;

import com.laibao.spring5.chapter3.container.Container;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public interface ManagedComponent {
    void performLookup(Container container);
}
