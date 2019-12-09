package com.javarush.task.task32.task3201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        String number = args[1];
        String text = args[2];

        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");

        long fileLength = raf.length();
        long textLength = text.length();
        long positionNumber = Long.parseLong(number);
        long delta = fileLength - positionNumber;

        if (textLength > delta) {
            raf.seek(fileLength);
        } else {
            raf.seek(positionNumber);
        }
        raf.write(text.getBytes());
    }
}
