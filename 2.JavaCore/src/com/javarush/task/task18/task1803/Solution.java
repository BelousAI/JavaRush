package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        FileInputStream inputStream = new FileInputStream(name);
        Map<Integer, Integer> map = new HashMap<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            map.put(data, map.containsKey(data) ? map.get(data) + 1 : 1);
        }
        inputStream.close();

        int num = 0;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            int key = pair.getKey();
            int value = pair.getValue();
            if (value > num) {
                num = value;
            }
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            int key = pair.getKey();
            int value = pair.getValue();
            if (num == value) {
                System.out.print(key + " ");
            }
        }
    }
}
