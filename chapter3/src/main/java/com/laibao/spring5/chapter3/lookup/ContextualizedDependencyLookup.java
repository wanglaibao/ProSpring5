package com.laibao.spring5.chapter3.lookup;

import com.laibao.spring5.chapter3.container.Container;
import com.laibao.spring5.chapter3.service.ManagedComponent;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class ContextualizedDependencyLookup implements ManagedComponent {

    private Object dependency;

    @Override
    public void performLookup(Container container) {
            dependency = container.getDependency("dependencyKey");
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
