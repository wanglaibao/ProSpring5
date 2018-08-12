package com.laibao.prospring5.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author laibao wang
 * @date 2018-08-12
 * @version 1.0
 */
public class Macro {
    private final List<Action> actions;

    public Macro() {
        actions = new ArrayList<>();
    }

    public void record(Action action) {
        actions.add(action);
    }

    public void run() {
        actions.forEach(Action::perform);
    }
}
