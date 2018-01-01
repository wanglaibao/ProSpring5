package com.laibao.spring5.chapter1;

import java.io.PrintStream;
/**
 * @author laibao wang
 * @date 2018-01-01
 * @version 1.0
 */
public class SlayDragonQuest implements Quest{

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        for(int i = 0; i < 10; i++) {
            printStream.println("Embarking on quest to slay the dragon!");
            printStream.println("Embarking on quest to slay the dragon!");
            printStream.println("Embarking on quest to slay the dragon!");
        }
    }
}
