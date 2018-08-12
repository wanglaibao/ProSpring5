package com.laibao.prospring5.strategypattern;

import com.laibao.prospring5.commandpattern.Editor;

import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipOutputStream;

/**
 * Created by A on 2018/8/12.
 */
public class CompressorTest {

    public static void main(String[] args) {

        CompressionStrategy gzipCompressionStrategy = (OutputStream outputStream) -> new GZIPOutputStream(outputStream);

        CompressionStrategy zipCompressionStrategy = (OutputStream outputStream) -> new ZipOutputStream(outputStream);

        Compressor compressor = new Compressor(GZIPOutputStream ::new);

        Compressor zipCompressor = new Compressor(ZipOutputStream::new);

    }
}
