package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

            while (reader.ready()) {
                String str = reader.readLine();
                String[] arr = str.split(" ");

                for (String s : arr) {
                    if (s.matches(".*\\d.*")) writer.write(s + " ");
                }
            }
            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
