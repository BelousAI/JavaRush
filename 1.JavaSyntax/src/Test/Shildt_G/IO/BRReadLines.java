package Test.Shildt_G.IO;
import java.io.*;
/**
 * Created by Антон on 12.04.2017.
 */
public class BRReadLines {
    public static void main(String[] args) throws IOException {
        //Создаем поток ввода типа BufferedReader
        //используя стандартный поток ввода System.in
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите строки текста.");
        System.out.println("Введите'стоп' для завершения.");

        do {
            str = reader.readLine();
            System.out.println(str);
        }
        while (!str.equals("стоп"));
    }
}
