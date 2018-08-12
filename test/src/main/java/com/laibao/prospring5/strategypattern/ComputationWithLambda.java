package com.laibao.prospring5.strategypattern;

import java.util.Arrays;
import java.util.List;

/**
 * Created by A on 2018/8/12.
 */
public class ComputationWithLambda {

    public static void main(String[] args) {
        List<Computation<Integer>> computations = Arrays.asList(
                                                                (n, m)-> { return n+m; },
                                                                (n, m)-> { return n*m; },
                                                                (n, m)-> { return n-m; }
                                                    );
        computations.forEach(computation -> System.out.println(computation.compute(10,4)));
    }
}
