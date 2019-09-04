package com.javarush.task.task19.task1906;

import java.io.*;
/* 
Четные байты
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            reader.close();

            FileReader fr = new FileReader(file1);
            FileWriter fw = new FileWriter(file2);
            int i = 0;

            while (fr.ready()) {
                int data = fr.read();
                i++;
                if (i % 2 == 0) fw.write(data);
            }
            fr.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
