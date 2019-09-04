package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String word = reader.readLine();
            list.add(word);
        }

        String maxString = list.get(0);
        String minString = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > maxString.length()) {
                maxString = list.get(i);//напишите тут ваш код
            }
            if (list.get(i).length() < minString.length()) {
                minString = list.get(i);
            }
        }
        if (list.indexOf(maxString) > list.indexOf(minString)) {
            System.out.println(minString);
        }
        else System.out.println(maxString);
    }
}
