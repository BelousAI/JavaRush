package Test.Shildt_G.IO.Podrobno.Input_Output_Stream;

/**
 * Created by Антон on 12.06.2017.
 */
import java.io.*;

public class ByteArrayInputStreamReset {
    public static void main(String[] args) {
        String tmp = "abc";
        byte[] b = tmp.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(b);

        for (int i = 0; i < 2; i++) {
            int ch;
            while ((ch = in.read()) != -1) {
                if (i == 0) System.out.print((char) ch);
                else System.out.print(Character.toUpperCase((char) ch));
            }
            System.out.println();
            in.reset();
        }
    }
}
