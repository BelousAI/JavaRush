package Test.Shildt_G.IO;
import java.io.*;
/**
 * Created by Антон on 12.04.2017.
 */

//Автоматическое управление ресурсами (избавляет от явного закрытия потоков io)
public class CopyFile2 {
    public static void main(String[] args) {
        //Версия использующая опретор try с ресурсами.
        int i;

        //Открыть два файла и управлять ими в операторе try
        try (FileInputStream fin = new FileInputStream("d:/example4.txt");
             FileOutputStream fout = new FileOutputStream("d:/example2.txt")) {

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            }
            while (i != -1);
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
