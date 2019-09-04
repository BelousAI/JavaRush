package Test.Shildt_G.Util_pack.Collection_OLD;

/**
 * Created by Антон on 06.06.2017.
 */
import java.util.*;
import java.io.*;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        //Попытка открыть файл phonebook.dat
        try {
            fin = new FileInputStream("d://phonebook.dat");
        }
        catch (FileNotFoundException e) {
            //игнорировать отсутствующий файл
        }

        //Если телефонная книга уже существует, загрузить
        //существующие телефонные номера
        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        }
        catch(IOException e) {
            System.out.println("Ошибка чтения файла.");
        }

        //Разрешить пользователю вводить новые имена и номера телефонов абонентов
        do {
            System.out.println("Введите имя ('выход' для завершения): ");
            name = br.readLine();
            if (name.equals("выход")) continue;
            System.out.println("Введите номер: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        }
        while (!name.equals("выход"));

        //Сохранить телефонную книгу если она изменилась
        if (changed) {
            try {
                FileOutputStream fout = new FileOutputStream("d://phonebook.dat");
                ht.store(fout, "Телефонная книга");
                fout.close();
            }
            catch (NullPointerException e) {
                e.printStackTrace();
            }
        }

        //Искать номер по имени абонента
        do {
            System.out.println("Введите имя для поиска ('выход' для завершения): ");
            name = br.readLine();
            if (name.equals("выход")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        }while (!name.equals("выход"));
    }
}
