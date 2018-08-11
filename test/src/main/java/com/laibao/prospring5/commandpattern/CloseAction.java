package com.laibao.prospring5.commandpattern;

/**
 * Created by A on 2018/8/11.
 */
public class CloseAction implements Action{

    private final Editor editor;

    public CloseAction(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.close();
    }
}
