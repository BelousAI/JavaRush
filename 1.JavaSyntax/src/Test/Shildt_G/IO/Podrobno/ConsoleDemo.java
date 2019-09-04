package Test.Shildt_G.IO.Podrobno;

/**
 * Created by Антон on 15.06.2017.
 */
import java.io.*;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        //получить ссылку на консоль
        con = System.console();

        //выйти из программы, если консоль не доступна
        if (con == null) {
            System.out.println("Консоль не доступна");
            return;
        }

        //Прочитать строку и вывести ее
        str = con.readLine("Введите строку: ");
        con.printf("Введеная вами строка: %s\n", str);
    }
}
