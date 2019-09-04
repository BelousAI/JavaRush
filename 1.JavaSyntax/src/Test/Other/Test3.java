package Test.Other;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Антон on 07.05.2017.
 */
public class Test3 {
    public static void main(String[] args) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream console = new PrintStream(stream);
        console.println("Hello!");
        console.print(3434);

        System.out.println(stream);
    }
}
