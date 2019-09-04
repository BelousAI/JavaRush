package Test.Shildt_G.Anonymous;

import javax.swing.*;

/**
 * Created by Антон on 20.06.2017.
 */
public class B {
    private JFrame frame = new JFrame();

    public void showWindow(int y) { //Теперь final можно не писать, но д.б. final по факту (v 1.8)
        int x = 3;
        //x = 4; Ошибка, если раскоментировать!!!!

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println(x + y);
                frame.setVisible(true);
            }

            public static final int f = 5; //аноним классы могут иметь только статические константы!!!!
        });
    }


}
