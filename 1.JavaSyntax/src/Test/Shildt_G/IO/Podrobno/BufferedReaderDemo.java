package Test.Shildt_G.IO.Podrobno;

/**
 * Created by Антон on 13.06.2017.
 */

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String s = "Это знак авторского права &copy; , а &copy - нет.\n";
        char[] buf = s.toCharArray();

        CharArrayReader in = new CharArrayReader(buf);
        int ch;
        boolean marked = false;

        try (BufferedReader f = new BufferedReader(in)) {
            while((ch = f.read()) != -1) {
                switch (ch) {
                    case '&':
                        if (!marked) {
                            f.mark(32);
                            marked = true;
                        }
                        else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.print("(c)");
                        }
                        else {
                            System.out.print((char) ch);
                        }
                        break;
                    case ' ':
                        if (marked) {
                            marked = false;
                            f.reset();
                            System.out.print("&");
                        }
                        else {
                            System.out.print((char) ch);
                        }
                        break;
                    default:
                        if (!marked) {
                            System.out.print((char) ch);
                        }
                        break;
                }
            }
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
