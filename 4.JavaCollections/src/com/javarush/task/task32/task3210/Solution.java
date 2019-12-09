package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        String number = args[1];
        String text = args[2];

        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
        long fileLength = raf.length();
        long positionNumber = Long.parseLong(number);

        raf.seek(positionNumber);
        byte[] buffer = new byte[text.length()];
        raf.read(buffer, 0, buffer.length);
        raf.seek(fileLength);

        if (new String(buffer).equals(text)) {
            raf.write("true".getBytes());
        } else {
            raf.write("false".getBytes());
        }
    }
}
