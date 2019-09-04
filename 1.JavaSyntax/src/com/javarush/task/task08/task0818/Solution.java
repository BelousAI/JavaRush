package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 100);
        map.put("Two", 200);
        map.put("Three", 300);
        map.put("Four", 400);
        map.put("Five", 500);
        map.put("Six", 600);
        map.put("Seven", 700);
        map.put("Eight", 800);
        map.put("Nine", 900);
        map.put("Ten", 1000);

        return map;//напишите тут ваш код
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<String, Integer> pair = itr.next();
            if (pair.getValue() < 500) {
                itr.remove();//напишите тут ваш код
            }
        }
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}