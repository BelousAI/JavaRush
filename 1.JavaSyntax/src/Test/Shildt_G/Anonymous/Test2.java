package Test.Shildt_G.Anonymous;

import javax.swing.*;


/**
 * Created by Антон on 20.06.2017.
 */
public class Test2 {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Message");
                frame.setSize(300, 200);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                /*JOptionPane.showMessageDialog(frame,
                        "Eggs are not supposed to be green.");*/

                /*JOptionPane.showMessageDialog(frame,
                        "Eggs are not supposed to be green.",
                        "Inane warning", JOptionPane.WARNING_MESSAGE);*/

                /*JOptionPane.showMessageDialog(frame,
                        "Eggs are not supposed to be green.",
                        "Inane error", JOptionPane.ERROR_MESSAGE);*/

                /*JOptionPane.showMessageDialog(frame,
                        "Eggs are not supposed to be green.",
                        "A plain message", JOptionPane.PLAIN_MESSAGE);*/

                //Окно подтверждения
                /*int dialogResult = JOptionPane.showConfirmDialog(frame,
                        "The …", JOptionPane.YES_NO_OPTION);

                if (dialogResult == JOptionPane.CLOSED_OPTION) {
                // окно было просто закрыто
                }
                else if (dialogResult == JOptionPane.YES_OPTION) {
                // нажали Yes
                }*/
            }
        });
    }
}
