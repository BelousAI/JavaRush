package Test.Shildt_G.IO;
import java.io.*;
/**
 * Created by Антон on 12.04.2017.
 */
public class WriteDemo {
    public static void main(String[] args) throws IOException {
        int b;

        b = 'A';
        System.out.write(b);        //выводит на экран один байт
        System.out.println('\n');
    }
}
