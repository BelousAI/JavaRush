package Test.Shildt_G.IO.Podrobno.Input_Output_Stream;

/**
 * Created by Антон on 13.06.2017.
 */
import java.io.*;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String s = "This token is avtorskoe pravo &copy; , &copy - it is not.\n";
        byte[] buf = s.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int ch;
        boolean marked = false;

        try (BufferedInputStream f = new BufferedInputStream(in)) {
            while ((ch = f.read()) != -1) {
                switch(ch) {
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
                        else System.out.print((char) ch);
                        break;
                    case ' ':
                        if (marked) {
                            marked = false;
                            f.reset();
                            System.out.print("&");
                        }
                        else System.out.print((char) ch);
                        break;
                    default:
                        if (!marked) {
                            System.out.print((char) ch);
                        }
                        break;
                }
            }
        }
        catch(IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
