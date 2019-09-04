package Test.Shildt_G.IO;
import java.io.*;
/**
 * Created by Антон on 12.04.2017.
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(System.out, true); //PrintWriter - относится к категории символьных классов

        pw.println("Это строка");  //Упрощает интернационализацию реальных программ
        int i = -7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
    }
}
