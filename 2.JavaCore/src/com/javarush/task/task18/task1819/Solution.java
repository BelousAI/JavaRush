package com.javarush.task.task18.task1819;

import java.io.*;
/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            String s2 = reader.readLine();

            FileInputStream fis = new FileInputStream(s);
            byte[] buffer1 = new byte[fis.available()];
            fis.read(buffer1);
            fis.close();

            FileOutputStream fos = new FileOutputStream(s);
            FileInputStream fis2 = new FileInputStream(s2);

            byte[] buffer2 = new byte[fis2.available()];

            fis2.read(buffer2);
            fos.write(buffer2);
            fos.write(buffer1);

            reader.close();
            //fis.close();
            fos.close();
            fis2.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
