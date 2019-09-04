package com.javarush.task.task17.task1711;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        Person pers = null;
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        if (args[i].equals("м")) {
                            allPeople.add(Person.createMale(args[i - 1], new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 1])));
                            System.out.println(allPeople.size() - 1);
                        } else if (args[i].equals("ж")) {
                            allPeople.add(Person.createFemale(args[i - 1], new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 1])));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        if (args[i].equals("м")) {
                            pers = allPeople.get(Integer.parseInt(args[i - 2]));
                            pers.setName(args[i - 1]);
                            pers.setSex(Sex.MALE);
                            pers.setBirthDay(new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 1]));
                        }
                        else if (args[i].equals("ж")) {
                            pers = allPeople.get(Integer.parseInt(args[i - 2]));
                            pers.setName(args[i - 1]);
                            pers.setSex(Sex.FEMALE);
                            pers.setBirthDay(new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 1]));
                        }
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        pers = allPeople.get(Integer.parseInt(args[i]));
                        pers.setName(null);
                        pers.setSex(null);
                        pers.setBirthDay(null);
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        pers = allPeople.get(Integer.parseInt(args[i]));
                        StringBuilder sb = new StringBuilder();
                        sb.append(pers.getName() + " ").append(pers.getSex() == Sex.MALE ? "м " : "ж ");
                        sb.append(new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(pers.getBirthDay()) +
                         " ");
                        String str = sb.toString();
                        System.out.println(str);
                    }
                    break;
                }
        }
    }
}
