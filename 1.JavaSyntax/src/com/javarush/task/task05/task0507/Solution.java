package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1) {break;//напишите тут ваш код
            }
            list.add(number);
        }

        double count2 = 0;
        for (int count : list) {
            count2 += count;
        }
        System.out.println(count2 / list.size());



    }
}

