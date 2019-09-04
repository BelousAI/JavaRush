package com.javarush.task.task19.task1908;

import java.io.*;
/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            reader.close();

            BufferedReader br = new BufferedReader(new FileReader(file1));
            BufferedWriter bw = new BufferedWriter(new FileWriter(file2));

            while (br.ready()) {
                String str = br.readLine();
                String[] arr = str.split(" ");

                for (String s : arr) {
                    try {
                        bw.write(Integer.parseInt(s) + " ");
                    }
                    catch (NumberFormatException e) {
                        continue;
                    }
                }
            }

            br.close();
            bw.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
