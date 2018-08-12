package com.laibao.prospring5.strategypattern;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;

/**
 * Created by A on 2018/8/12.
 */
public class ZipCompressionStrategy implements CompressionStrategy{

    public ZipCompressionStrategy() {}

    @Override
    public OutputStream compress(OutputStream originalData) throws IOException {
        return new ZipOutputStream(originalData);
    }
}
