package com.javarush.task.task18.task1822;

import java.io.*;
/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file = reader.readLine();
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

            while (reader2.ready()) {
                String line = reader2.readLine();
                if (line.contains(args[0])) {
                    System.out.println(line);
                }
                /*String[] arr = line.split(" ");
                if (Integer.parseInt(args[0]) == Integer.parseInt(arr[0])) {
                    System.out.println(line);
                }*/
            }
            reader.close();
            reader2.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
