package com.zys.spring.di;

public class BraveKnights implements Knights {

    private Quest quest;

    public BraveKnights(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
