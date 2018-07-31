package com.laibao.spring5.chapter3.injection;

/**
 * @author laibao wang
 * @date 2018-08-01
 * @version
 */
public class InjectRef {
    private Oracle oracle;

    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }

    public String toString() {
        return oracle.defineMeaningOfLife();
    }
}
