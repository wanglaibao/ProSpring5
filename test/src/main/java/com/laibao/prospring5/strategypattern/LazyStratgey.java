package com.laibao.prospring5.strategypattern;

/**
 * Created by A on 2018/8/12.
 */
public class LazyStratgey implements Strategy{

    @Override
    public void performTask() {
        System.out.println("Perform task a day before deadline!");
    }
}
