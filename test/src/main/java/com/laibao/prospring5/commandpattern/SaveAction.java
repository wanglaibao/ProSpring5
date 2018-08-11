package com.laibao.prospring5.commandpattern;

/**
 * Created by A on 2018/8/11.
 */
public class SaveAction implements Action{

    private final Editor editor;

    public SaveAction(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.save();
    }
}
