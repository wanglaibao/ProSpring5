package com.laibao.prospring5.strategypattern;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by A on 2018/8/12.
 */
public class GzipCompressionStrategy implements CompressionStrategy{

    public GzipCompressionStrategy() {}

    @Override
    public OutputStream compress(OutputStream originalData) throws IOException {
        return new GZIPOutputStream(originalData);
    }
}
