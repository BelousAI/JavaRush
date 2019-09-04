package Test.Other;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test_Test {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("D:/example.txt")) {
            int i;
            ByteArrayOutputStream sb = new ByteArrayOutputStream();
            while ((i = is.read()) != -1) {
                sb.write(i);
            }

            String s = sb.toString("windows-1251");
            System.out.println(s);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
