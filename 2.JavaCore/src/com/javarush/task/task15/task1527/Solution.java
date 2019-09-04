package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] str;
        String result;

        str = url.split("\\?");
        str = str[1].split("&");
        for (String text : str) {
            if (text.contains("=")) {
                System.out.print(text.substring(0, text.indexOf('=')) + " ");
            }
            else System.out.print(text + " ");
        }

        System.out.println();

        for (String text : str) {
            if (text.contains("obj")) {
                result = text.substring(text.indexOf('=') + 1);
                try {
                    alert(Double.parseDouble(result));
                }
                catch (Exception e) {
                    alert(result);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
