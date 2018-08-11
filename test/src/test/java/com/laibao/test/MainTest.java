// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MainTest.java

package com.laibao.test;

import java.io.PrintStream;

public class MainTest
{

    public MainTest()
    {
    }

    public static void main(String args[])
    {
        String s = "asdfasfd";
        String s1 = "zxvczxvc";
        System.out.println((new StringBuilder()).append(1321).append(s).append(0x56832).append(s1).toString());
    }
}


//注意，在IntelliJ IDEA里，这个上面红框，像个小计算器的按钮就是临时执行的功能，点击之后，会弹出按钮下方这个Evaluate Expression（Ctrl+F8）的框，输入代码，点击右下角的Evalute即可。返回值会显示在Result处