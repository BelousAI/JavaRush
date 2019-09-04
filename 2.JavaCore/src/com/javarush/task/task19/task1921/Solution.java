package com.javarush.task.task19.task1921;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.*;


/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));

            while (reader.ready()) {
                String str = reader.readLine();
                String name = str.split("\\d")[0];
                name = name.trim();
                String date = str.split(name + "")[1];
                date = date.trim();

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
                Date pDate = dateFormat.parse(date);
                PEOPLE.add(new Person(name, pDate));
            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Сгенерировано исключение: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Сгенерировано  исключение: " + e);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
