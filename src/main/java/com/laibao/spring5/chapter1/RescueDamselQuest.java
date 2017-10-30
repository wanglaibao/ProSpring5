package com.laibao.spring5.chapter1;

public class RescueDamselQuest implements Quest{

    @Override
    public void embark() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Embarking on a quest to rescue the damsel.");
        }
    }
}
