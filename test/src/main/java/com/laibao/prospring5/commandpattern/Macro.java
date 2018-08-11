package com.laibao.prospring5.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by A on 2018/8/11.
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
