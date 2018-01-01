package com.laibao.spring5.chapter1;
/**
 * @author laibao wang
 * @date 2018-01-01
 * @version 1.0
 */
public class RescueDamselQuest implements Quest{

    @Override
    public void embark() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Embarking on a quest to rescue the damsel.");
        }
    }
}
