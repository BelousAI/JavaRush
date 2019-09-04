package Test.Shildt_G.IO.Podrobno;

/**
 * Created by Антон on 13.06.2017.
 */
import java.io.*;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "Эти данные должны быть выведены в массив";
        char[] buf = s.toCharArray();

        try {
            f.write(buf);
        }
        catch (IOException e) {
            System.out.println("Ошибка записи в буфер");
            return;
        }

        System.out.println("Буфер в виде символьной строки: ");
        System.out.println(f.toString());
        System.out.println("В массив");

        char[] ch = f.toCharArray();
        for (char c : ch) System.out.print(c);

        System.out.println("\nВ поток вывода типа FileWriter()");

        try (FileWriter f2 = new FileWriter("Test/test.txt")) {
            f.writeTo(f2);
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        System.out.println("Установка в исходное состояние");
        f.reset();

        for (int i = 0; i < 3; i++) f.write('X');
        System.out.println(f.toString());
    }
}
