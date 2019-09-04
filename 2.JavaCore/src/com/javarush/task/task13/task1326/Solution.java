package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fin = new FileInputStream(file.readLine());
        BufferedReader readLine = new BufferedReader(new InputStreamReader(fin));
        int num;
        ArrayList<Integer> list = new ArrayList<>();

        while (readLine.ready()) {
            num = Integer.parseInt(readLine.readLine());
            if (num % 2 == 0) list.add(num);
        }

        Collections.sort(list);
        for (int a : list) System.out.println(a);

        readLine.close();
    }
}
