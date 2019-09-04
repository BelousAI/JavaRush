package Test.Shildt_G.Anonymous;

/**
 * Created by Антон on 20.06.2017.
 */

import javax.swing.*;

/**Захват переменных (т.е. обращение) в анонимных классах
 * до версии 1.8
 */

public class A {
    private JFrame frame = new JFrame(); //Поле не обязано быть final

    public void showWindow(final int y) { //Переменные аргумент и локальная д.б. final (до 1.8)
        final int x = 3;

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println(x + y);
                frame.setVisible(true);
                frame.setSize(300, 200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
