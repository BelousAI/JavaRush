package com.javarush.task.task18.task1826;

import java.io.*;
/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) {
        try {
            switch (args[0]) {
                case "-e":
                    FileInputStream fis = new FileInputStream(args[1]);
                    FileOutputStream fos = new FileOutputStream(args[2]);
                    byte[] buffer = new byte[fis.available()];
                    fis.read(buffer);
                    fis.close();

                    for (int i = 0; i < buffer.length; i++) {
                        byte b = buffer[i];
                        b++;
                        buffer[i] = b;
                    }

                    fos.write(buffer);
                    fos.close();
                    break;

                case "-d":
                    FileInputStream fis2 = new FileInputStream(args[1]);
                    FileOutputStream fos2 = new FileOutputStream(args[2]);
                    buffer = new byte[fis2.available()];
                    fis2.read(buffer);
                    fis2.close();

                    for (int i = 0; i < buffer.length; i++) {
                        byte b = buffer[i];
                        b--;
                        buffer[i] = b;
                    }

                    fos2.write(buffer);
                    fos2.close();
                    break;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
