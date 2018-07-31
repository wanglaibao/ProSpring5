package com.laibao.spring5.chapter3.injection;

/**
 * @author laibao wang
 * @date 2018-07-31
 * @version 1.0
 */
public class BookwormOracle implements Oracle{

    private Encyclopedia encyclopedia;

    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;
    }

    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedias are a waste of money - go see the world instead";
    }
}
