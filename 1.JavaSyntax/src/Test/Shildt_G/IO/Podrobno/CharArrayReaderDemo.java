package Test.Shildt_G.IO.Podrobno;

/**
 * Created by Антон on 13.06.2017.
 */
import java.io.*;

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        char[] buf = s.toCharArray();
        int i;

        try (CharArrayReader input1 = new CharArrayReader(buf);
             CharArrayReader input2 = new CharArrayReader(buf, 0, 5))
        {
            System.out.println("input1: ");
            while ((i = input1.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();

            System.out.println("input2: ");
            while ((i = input2.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
