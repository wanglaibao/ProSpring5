package com.laibao.prospring5.strategypattern;

import java.util.Arrays;
import java.util.List;

/**
 * Created by A on 2018/8/12.
 */
public class StrategyPatternTraditionalWay {

    public static void main(String[] args) {
        List<Strategy> strategyList = Arrays.asList(
                                                    new LazyStratgey(),
                                                    new ActiveStratgey()
                                    );
        for(Strategy strategy : strategyList){
            strategy.performTask();
        }
    }
}
