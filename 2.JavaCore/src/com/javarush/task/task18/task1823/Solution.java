package com.javarush.task.task18.task1823;

import java.util.*;
import java.io.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String str = reader.readLine();
                if (str.equals("exit")) break;
                ReadThread thread = new ReadThread(str);
                thread.start();
            }
            System.out.println(resultMap);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class ReadThread extends Thread {
        private String file;

        public ReadThread(String fileName) {
            this.file = fileName;//implement constructor body
        }

        public void run() {
            try {
                FileInputStream fis = new FileInputStream(file);
                byte[] buffer = new  byte[fis.available()];
                fis.read(buffer);
                fis.close();

                byte result = 0;
                int maxCopy = 0;
                HashMap<Byte, Integer> map = new HashMap<>();

                for (byte b : buffer) {
                    map.put(b, map.containsKey(b) ? map.get(b) + 1 : 1);
                }

                for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
                    Integer value = pair.getValue();
                    if (value > maxCopy) maxCopy = value;
                }

                for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
                    if (pair.getValue() == maxCopy) result = pair.getKey();
                }

                resultMap.put(file, (int)result);
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
