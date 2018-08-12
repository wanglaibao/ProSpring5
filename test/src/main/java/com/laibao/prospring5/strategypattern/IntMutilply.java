package com.laibao.prospring5.strategypattern;

/**
 * Created by A on 2018/8/12.
 */
public class IntMutilply implements Computation<Integer>{
    @Override
    public Integer compute(Integer n, Integer m) {
        return n * m;
    }
}
