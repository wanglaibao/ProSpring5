package com.laibao.spring5.chapter2;

/**
 * @author laibao wang
 * @date 2017-12-31
 * @version 1.0
 */
public class HelloWorldWithCommandLine {
    public static void main(String... args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        }else {
            System.out.println("Hello World");
        }
    }
}
