package Test.Shildt_G.Util_pack.Scanner_class;

/**
 * Created by Антон on 07.06.2017.
 */
import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class AvgFile {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;

        //вывести данные в файл
        FileWriter fout = new FileWriter("d://Test/test2.txt");
        fout.write("2 3.4 5 6 7.4 9.1 10.5 exit");
        fout.close();
        FileReader fin = new FileReader("d://Test/test2.txt");
        Scanner src = new Scanner(fin);
        src.useLocale(Locale.US);

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
