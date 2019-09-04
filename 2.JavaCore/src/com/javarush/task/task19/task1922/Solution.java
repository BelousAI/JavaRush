package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName = reader.readLine();
            reader.close();

            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while (br.ready()) {
                String str = br.readLine();
                String[] arr = str.split(" ");
                int count = 0;

                for (String s : arr) {
                    if (words.contains(s)) count++;
                }

                if (count == 2) System.out.println(str);
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
