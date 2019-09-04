package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.*;
/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(args[0]);
            TreeMap<Character, Integer> map = new TreeMap<>();

            while (reader.ready()) {
                char ch = (char)reader.read();
                if (!map.containsKey(ch)) map.put(ch, 1);
                else map.put(ch, map.get(ch) + 1);
            }

            for (Map.Entry<Character, Integer> pair : map.entrySet()) {
                Character key = pair.getKey();
                Integer value = pair.getValue();
                System.out.println(key + " " + value);
            }
            reader.close();

//////////////////////////////////////////////////////////////////////////////////////////////////
            /*FileInputStream fis = new FileInputStream(args[0]);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();

            TreeMap<Byte, Integer> map = new TreeMap<>();

            for (byte ch : buffer) {
                map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
            }

            for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
                char c = (char)(byte)pair.getKey();
                Integer value = pair.getValue();
                System.out.println(c + " " + value);
            }*/

//////////////////////////////////////////////////////////////////////////////////////////////////
            /*String str = new String(buffer);
            char[] array = str.toCharArray();
            TreeMap<Character, Integer> map = new TreeMap<>();

            for (char ch : array) {
                map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
            }

            for (Map.Entry<Character, Integer> pair : map.entrySet()) {
                Character key = pair.getKey();
                Integer value = pair.getValue();
                System.out.println(key + " " + value);
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
