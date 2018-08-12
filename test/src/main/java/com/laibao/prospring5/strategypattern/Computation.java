package com.laibao.prospring5.strategypattern;

/**
 * Created by A on 2018/8/12.
 */
public interface Computation<T> {
    public T compute(T n, T m);
}
