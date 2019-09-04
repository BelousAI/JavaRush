package com.javarush.task.task19.task1907;

import java.io.*;
/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName = reader.readLine();
            reader.close();

            BufferedReader r2 = new BufferedReader(new FileReader(fileName));
            int countWorld = 0;

            while (r2.ready()) {
                String s = r2.readLine();
                String[] arr = s.split("\\W");
                for (String str : arr) {
                    if (str.equals("world")) countWorld++;
                }
            }
            r2.close();
            System.out.println(countWorld);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
