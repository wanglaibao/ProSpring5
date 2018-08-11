package com.laibao.prospring5.commandpattern;

/**
 * Created by A on 2018/8/11.
 */
public class OpenAction implements Action{

    private final Editor editor;

    public OpenAction(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.open();
    }
}
