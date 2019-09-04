package Test.Shildt_G.IO.Podrobno;

/**
 * Created by Антон on 15.06.2017.
 */

import java.io.*;

public class PushbackReaderDemo {
    public static void main(String[] args) {
        String s = "If (a == 4) a = 0;\n";
        char[] buf = s.toCharArray();
        CharArrayReader in = new CharArrayReader(buf);
        int ch;

        try (PushbackReader f = new PushbackReader(in)) {
            while ((ch = f.read()) != -1) {
                switch (ch) {
                    case '=':
                        if ((ch = f.read()) == '=') {
                            System.out.print(".eq.");
                        }
                        else {
                            System.out.print("<-");
                            f.unread(ch);
                        }
                        break;
                    default:
                        System.out.print((char) ch);
                        break;
                }
            }
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
