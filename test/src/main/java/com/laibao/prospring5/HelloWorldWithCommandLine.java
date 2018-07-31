package com.laibao.prospring5;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class HelloWorldWithCommandLine {

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        }else {
            System.out.println("Welcome to Pro Spring5 World");
        }
    }
}
