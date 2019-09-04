package Test.Shildt_G.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Антон on 20.06.2017.
 */

/**
 * SwingUtilities.invokeLater заставляет код
 * внутри метода run выполниться в потоке- диспетчере событий
 */
public class Test_LFrame {
    public static void main(String[] args) {
        //Получить размер экрана
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("My first GUI application");
                frame.setSize(300, 200); //размер окна
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //задать, что делать при закрытии окна-
                //EXIT_ON_CLOSE - завершить программу
                //по умолчанию, это не так - программа не завершается
                frame.setVisible(true); // Показать фрейм
                frame.setTitle("Hello!"); //Задать заголовок окна

                Image img = Toolkit.getDefaultToolkit().getImage("d://images.png");
                frame.setIconImage(img);

                //Добавить панель во фрейм
                JPanel panel = new JPanel(); //создали панель
                frame.add(panel, BorderLayout.PAGE_START);

                //Создаем кнопку и добавляем ее во фрейм
                JButton button1 = new JButton("Button 1");
                JButton button3 = new JButton("Button 3");
                JButton button4 = new JButton("Button 4");
                JButton button5 = new JButton("Button 5");
                frame.add(button1, BorderLayout.LINE_START);
                frame.add(button3, BorderLayout.LINE_END);
                frame.add(button4, BorderLayout.CENTER);
                frame.add(button5, BorderLayout.PAGE_END);

                JButton buttonA = new JButton("Button A");
                JButton buttonB = new JButton("Button B");
                panel.add(buttonA);
                panel.add(buttonB);

                //Программируем кнопку на нажатие
                buttonA.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Hello!");
                    }
                });


            }
        });
    }
}
