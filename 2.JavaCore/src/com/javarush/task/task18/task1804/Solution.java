package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        Map<Integer, Integer> map = new HashMap<>();

        FileInputStream inputStream = new FileInputStream(file);

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            map.put(data, map.containsKey(data) ? map.get(data) + 1 : 1);
        }
        try {
            int min = Collections.min(map.values());
            for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                int key = pair.getKey();
                int value = pair.getValue();
                if (value == min) {
                    System.out.print(key + " ");
            }
        }
    }
        catch (NoSuchElementException e) {
    }
        inputStream.close();
        reader.close();
    }
}
