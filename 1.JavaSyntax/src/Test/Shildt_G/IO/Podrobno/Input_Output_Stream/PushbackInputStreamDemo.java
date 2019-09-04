package Test.Shildt_G.IO.Podrobno.Input_Output_Stream;

/**
 * Created by Антон on 13.06.2017.
 */
import java.io.*;

public class PushbackInputStreamDemo {
    public static void main(String[] args) {
        String s = "if (a == 4) a = 0;\n";
        byte[] buf = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int ch;

        try (PushbackInputStream f = new PushbackInputStream(in)) {
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
        catch(IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
