package com.laibao.prospring5.strategypattern;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by A on 2018/8/12.
 */
@FunctionalInterface
public interface CompressionStrategy {
    OutputStream compress(OutputStream originalData) throws IOException;
}
