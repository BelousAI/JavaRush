package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream bis = new FileInputStream(args[0]);) {
            int count = 0;
            byte[] arr = new byte[bis.available()];
            int data = bis.read(arr);
            for (byte ch : arr) {
                if (ch == ' ') {
                    count++;
                }
            }
            double number = (double)count / data * 100;
            number = Math.rint(100.0 * number) / 100.0;                  //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            System.out.println(number);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
