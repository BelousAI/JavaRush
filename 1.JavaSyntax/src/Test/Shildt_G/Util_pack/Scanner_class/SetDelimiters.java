package Test.Shildt_G.Util_pack.Scanner_class;

/**
 * Created by Антон on 08.06.2017.
 */

import java.util.*;
import java.io.*;

public class SetDelimiters {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;

        //Вывести данные в файл
        FileWriter four = new FileWriter("d://Test/test3.txt");

        //сохранить данные в списке, разделив их запятыми
        four.write("2, 3.4, 5,6, 7.4, 9.1, 10.5, exit");
        four.close();
        FileReader fin = new FileReader("d://Test/test3.txt");
        Scanner src = new Scanner(fin);
        src.useLocale(Locale.US);

        //установить в кач-ве разделителей запятые и пробелы
        src.useDelimiter(", *");

        //читать и суммировать числовые значения
        while(src.hasNext()) {
            if (src.hasNextDouble()) {
                sum += src.nextDouble();
                count++;
            }
            else {
                String str = src.next();
                if (str.equals("exit")) break;
                else {
                    System.out.println("Ошибка формата данных.");
                    return;
                }
            }
        }
        src.close();
        System.out.println("Среднее равно " + sum / count);
    }
}
