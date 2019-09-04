package Test.Shildt_G.IO;
import java.io.*;
/**
 * Created by Антон on 12.04.2017.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        //Попытка открыть файл
        try {
            fin = new FileInputStream("d:/example.txt");
            //Теперь файл открыт и готов к чтению.
            //Далее из него читаются символы до тех пор,
            //пока не встретится признак конца файла
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            }
            while (i != -1);
        }
        catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл.");
        }
        catch (IOException e) {
            System.out.println("Ошибка чтения из файла.");
        }
        finally {
            //Закрыть файл при выходе из блока оператора try (даже если будет исключение не относящ-ся к IOException)
            try {
                if (fin != null)fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла.");
            }
        }
    }
}
