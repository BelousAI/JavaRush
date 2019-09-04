package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        FileOutputStream bos = new FileOutputStream(s);
        FileInputStream bis2 = new FileInputStream(s2);
        FileInputStream bis3 = new FileInputStream(s3);

        byte[] buffer1 = new byte[bis2.available()];
        byte[] buffer2 = new byte[bis3.available()];
        bis2.read(buffer1);
        bos.write(buffer1);

        bis3.read(buffer2);
        bos.write(buffer2);

        reader.close();
        bos.close();
        bis2.close();
        bis3.close();
    }
}
