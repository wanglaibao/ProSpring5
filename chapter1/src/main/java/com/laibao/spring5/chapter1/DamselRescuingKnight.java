package com.laibao.spring5.chapter1;

/**
 * @author laibao wang
 * @date 2018-01-01
 * @version 1.0
 */

public class DamselRescuingKnight implements Knight{

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
