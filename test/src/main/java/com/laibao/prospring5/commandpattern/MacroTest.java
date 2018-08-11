package com.laibao.prospring5.commandpattern;

/**
 * Created by A on 2018/8/11.
 */
public class MacroTest {

    public static void main(String[] args) {
        Editor editor = new Editor() {
            @Override
            public void save() {
                System.out.println("aa");
            }

            @Override
            public void open() {
                System.out.println("bb");
            }

            @Override
            public void close() {
                System.out.println("cc");
            }
        };

//        Macro macro = new Macro();
//        macro.record(new OpenAction(editor));
//        macro.record(new SaveAction(editor));
//        macro.record(new CloseAction(editor));
//        macro.run();


        Macro macro = new Macro();
        macro.record(() -> editor.open());
        macro.record(() -> editor.save());
        macro.record(() -> editor.close());
        macro.run();


        Macro newMacro = new Macro();
        newMacro.record(editor::open);
        newMacro.record(editor::save);
        newMacro.record(editor::close);
        newMacro.run();
    }
}
