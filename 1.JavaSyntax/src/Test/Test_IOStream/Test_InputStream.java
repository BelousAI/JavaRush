package Test.Test_IOStream;

import java.io.*;

/**
 * Created by Антон on 01.03.2017.
 */
public class Test_InputStream {
    public static void main(String[] args) throws IOException {
        /*InputStream input = new FileInputStream("D://example.txt");
        OutputStream out = new FileOutputStream("D://example2.txt");

        while (input.available() > 0) {
            int data = input.read();
            out.write(data);
        }

        input.close();
        out.close();*/

        //22222222222222222222222222222222222222222222222222222222222222222222222222222222222222

        MyClass mc = new MyClass();
        mc.write(1);
        mc.write(2);
        mc.write(3);
        mc.write(4);

        OutputStream out = new FileOutputStream("d://example.txt");

        while (mc.available() > 0) {
            int data = mc.read();
            out.write(data);
        }

        out.close();

    }
}
