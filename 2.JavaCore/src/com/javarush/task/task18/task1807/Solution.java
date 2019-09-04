package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file);
        byte[] buffer;
        int sum = 0;

        while (inputStream.available() > 0) {
            buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            for (int i : buffer) {
                if (i == 44) {
                   sum++;
                }
            }
        }
        System.out.println(sum);
        inputStream.close();
    }
}
