package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        File in = new File(args[0]);
        File out = new File(args[1]);
        Charset windows1251 = Charset.forName("Windows-1251");
        Charset utf8 = StandardCharsets.UTF_8;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(in), windows1251));
             BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(out))) {

            byte[] buffer;
            String content;

            while (reader.ready()) {
                content = reader.readLine();
                buffer = content.getBytes(utf8);
                writer.write(buffer);
            }
        }
    }
}
