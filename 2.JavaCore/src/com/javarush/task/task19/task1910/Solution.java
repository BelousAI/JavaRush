package com.javarush.task.task19.task1910;

import java.io.*;
/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();

            try (BufferedReader bReader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(fileName2))) {
                while (bReader.ready()) {
                    String str = bReader.readLine();
                    bWriter.write(str.replaceAll("\\W", ""));
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
