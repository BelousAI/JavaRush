package Test.Shildt_G.IO.Podrobno.Input_Output_Stream.SequenceInputStream_class;

/**
 * Created by Антон on 13.06.2017.
 */

import java.io.*;
import java.util.*;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int ch;
        Vector<String> files = new Vector<>();

        files.addElement("Test/file1.txt");
        files.addElement("Test/file2.txt");
        files.addElement("Test/file3.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        //InputStream input = new SequenceInputStream(ise);

        try (InputStream input = new SequenceInputStream(ise)) {
            while((ch = input.read()) != -1) {
                System.out.print((char) ch);
            }
        }
        catch (NullPointerException e) {
            System.out.println("Ошибка открытия файла.");
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        /*finally {
            try {
                input.close();
            }
            catch (IOException e) {
                System.out.println("Ошибка закрытия потока ввода SequenceInputStream");
            }
        }*/
    }
}
