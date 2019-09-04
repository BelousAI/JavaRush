package Test.Shildt_G.String;

import java.io.*;
/**
 * Created by Антон on 27.04.2017.
 */

//Убираем отступы в строке
public class UseTrim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите 'стоп' для завершения.");
        System.out.println("Введите название штата: ");

        do {
            str = br.readLine();
            str = str.trim(); //удалить пробелы
            if (str.equals("Иллинойс")) {
                System.out.println("Столица - Спрингфилд.");
            }
            else if (str.equals("Миссури")) {
                System.out.println("Столица - Джефферсон-сити.");
            }
            else if (str.equals("Калифорния")) {
                System.out.println("Столица - Сакраменто.");
            }
            else if (str.equals("Вашингтон")) {
                System.out.println("Столица - Олимпия.");
            }
        }
        while (!str.equals("стоп"));
    }
}
