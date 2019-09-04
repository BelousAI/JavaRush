package Test.Shildt_G.IO;

import java.io.*;

/**
 * Created by Антон on 12.04.2017.
 */
public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы, 'q' - для выхода.");

        //Читать символы
        do {
            c = (char) br.read();
            System.out.println(c);
        }
        while (c != 'q');
    }
}
