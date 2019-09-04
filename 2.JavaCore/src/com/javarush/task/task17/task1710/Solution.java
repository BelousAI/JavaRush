package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c":
                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3])));
                    System.out.println(allPeople.size() - 1);
                }

                else if (args[2].equals("ж")) {
                    allPeople.add(Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3])));
                    System.out.println(allPeople.size() - 1);//start here - начни тут
                }
                break;

            case "-u":
                Person pers = allPeople.get(Integer.parseInt(args[1]));
                pers.setName(args[2]);
                pers.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
                pers.setBirthDay(new SimpleDateFormat("dd/MM/yyyy").parse(args[4]));
                break;

            case "-d":
                pers = allPeople.get(Integer.parseInt(args[1]));
                pers.setName(null);
                pers.setSex(null);
                pers.setBirthDay(null);
                break;

            case "-i":
                pers =  allPeople.get(Integer.parseInt(args[1]));
                SimpleDateFormat formDateOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                StringBuilder sb = new StringBuilder();
                sb.append(pers.getName() + " ").append(pers.getSex() == Sex.MALE ? "м " : "ж ");
                sb.append(formDateOut.format(pers.getBirthDay()));
                String text = sb.toString();
                System.out.println(text);
                break;
        }
    }
}
