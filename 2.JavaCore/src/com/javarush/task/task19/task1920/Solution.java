package com.javarush.task.task19.task1920;

import java.io.*;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));

            while (reader.ready()) {
                String str = reader.readLine();
                String[] arr = str.split(" ");
                Double d = Double.parseDouble(arr[1]);
                if (!map.containsKey(arr[0])) {
                    map.put(arr[0], d);
                } else map.put(arr[0], map.get(arr[0]) + d);
            }
            reader.close();

            double maxD = 0;

            //maxD = Collections.max(map.values());

            for (Map.Entry<String, Double> pair : map.entrySet()) {
                Double value = pair.getValue();
                if (value > maxD) {
                    maxD = value;
                }
            }

            for (Map.Entry<String, Double> pair : map.entrySet()) {
                if (pair.getValue() == maxD) System.out.println(pair.getKey());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
