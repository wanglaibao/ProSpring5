package com.laibao.spring5.chapter1;

/**
 * @author laibao wang
 * @date 2018-01-01
 * @version 1.0
 */
public class BraveKnight implements Knight{

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
