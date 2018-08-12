package com.laibao.prospring5.strategypattern;

import java.util.Arrays;
import java.util.List;

/**
 * Created by A on 2018/8/12.
 */
public class StrategyPatternLambdaWay {
    public static void main(String[] args) {
        List<Strategy> strategyList =
                Arrays.asList(() -> {System.out.println("Perform task a day before deadline!");},
                              () -> {System.out.println("Perform task now!");}
                );

        strategyList.forEach(Strategy::performTask);
    }
}
