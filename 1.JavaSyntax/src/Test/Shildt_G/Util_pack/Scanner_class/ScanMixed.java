package Test.Shildt_G.Util_pack.Scanner_class;

/**
 * Created by Антон on 07.06.2017.
 */
import java.util.*;
import java.io.*;

public class ScanMixed {
    public static void main(String[] args) {
        int i;
        double d;
        boolean b;
        String str;

        //Вывести данные в файл
        try {
            FileWriter four = new FileWriter("d://Test/test3.txt");
            four.write("Тестирование Scanner 10 12,2 один true два false");
            four.close();

            FileReader fin = new FileReader("d://Test/test3.txt");

            Scanner src = new Scanner(fin);

            //читать данные до конца файла
            while (src.hasNext()) {
                if (src.hasNextInt()) {
                    i = src.nextInt();
                    System.out.println("int: " + i);
                }
                else if (src.hasNextDouble()) {
                    d = src.nextDouble();
                    System.out.println("double: " + d);
                }
                else if (src.hasNextBoolean()) {
                    b = src.nextBoolean();
                    System.out.println("boolean: " + b);
                }
                else {
                    str = src.next();
                    System.out.println("String: " + str);
                }
            }
            src.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (IOException e) {
            System.out.println("Не удается записать файл");
        }
    }
}
