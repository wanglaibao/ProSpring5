package com.laibao.prospring5.commandpattern;

/**
 * @author laibao wang
 * @date 2018-08-12
 * @version 1.0
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
