package com.javarush.task.task32.task3213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        if (reader != null) {
            BufferedReader bf = new BufferedReader(reader);
            StringBuilder secret = new StringBuilder();
            String line;

            while ((line = bf.readLine()) != null) {
                secret.append(line);
            }

            byte[] code = secret.toString().getBytes();
            byte[] result = new byte[code.length];

            for (int i = 0; i < code.length; i++) {
                result[i] = (byte) (code[i] + key);
            }
            return new String(result);
        } else {
            return new Object().toString();
        }
    }
}
