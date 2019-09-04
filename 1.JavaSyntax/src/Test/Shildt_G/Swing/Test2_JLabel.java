package Test.Shildt_G.Swing;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.Formatter;

/**
 * Created by Антон on 20.06.2017.
 */
public class Test2_JLabel {
    public static void main(String[] args) {
        // установка Look and Feel для текущей ОС
        try { UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) { }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("My application");
                frame.setSize(300, 200);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Formatter f = new Formatter();
                JLabel label = new JLabel(f.format("%s", new Date().toString()).toString());
                label.setText(label.getText().toUpperCase());
                frame.add(label, BorderLayout.CENTER);

                JTextField textField = new JTextField("Text", 20);
                String text = textField.getText();
                //int number = Integer.parseInt(text);
                frame.add(textField, BorderLayout.PAGE_START);

                System.out.println(text);
            }
        });
    }
}
