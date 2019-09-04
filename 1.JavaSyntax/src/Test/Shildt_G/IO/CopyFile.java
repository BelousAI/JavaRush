package Test.Shildt_G.IO;
import java.io.*;
/**
 * Created by Антон on 12.04.2017.
 */
public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        //Копируем файл
        try {
            //Попытаться открыть файл
            fin = new FileInputStream("d:/example.txt");
            fout = new FileOutputStream("d:/example2.txt");

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            }
            while (i != -1);
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        finally {
            try {
                if (fin != null) fin.close();
            }
            catch (IOException e2) {
                System.out.println("Ошибка закрытия файла ввода");
            }
            try {
                if (fout != null) fout.close();
            }
            catch (IOException e2) {
                System.out.println("Ошибка закрытия файла вывода");
            }
        }
    }
}
