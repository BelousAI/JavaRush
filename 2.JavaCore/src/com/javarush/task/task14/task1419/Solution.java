package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.IllegalFormatWidthException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int num = Integer.parseInt("ABC");//напишите тут ваш код
        }
        catch (Exception exc1) {
            exceptions.add(exc1);
        }

        try {
            FileInputStream file = new FileInputStream("c:\\dfdfdd");
        }
        catch (Exception exc2) {
            exceptions.add(exc2);
        }

        try {
            String name = null;
            name.length();
        }
        catch (Exception exc3) {
            exceptions.add(exc3);
        }

        try {
            int[] num = {1, 2 , 3};
            for (int i = 0; i < num.length + 1; i++) {
                System.out.println(num[num.length + 1]);
            }
        }
        catch (Exception exc4) {
            exceptions.add(exc4);
        }

        try {
            Object[] str = new String[1];
            str[0] = new Integer(3);
        }
        catch (Exception exc5) {
            exceptions.add(exc5);
        }

        try {
            Object x = new Integer(0);
            System.out.println((String)x);
        }
        catch (Exception exc6) {
            exceptions.add(exc6);
        }

        try {
            int[] arr = new int[-5];
        }
        catch (Exception exc7) {
            exceptions.add(exc7);
        }

        try {
            ArrayList<String> list = new ArrayList<>();
            list.get(0);
        }
        catch (Exception exc8) {
            exceptions.add(exc8);
        }

        try {
            ArrayList<String> list = new ArrayList<>();
            list.get(10);
        }
        catch (Exception exc9) {
            exceptions.add(exc9);
        }
    }
}
