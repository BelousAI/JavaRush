package com.javarush.task.task10.task1012;

//import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int[] arrcount = new int[abcArray.length];

        for (int k = 0; k < list.size(); k++) {
            char[] ch = list.get(k).toCharArray();
            for (int i = 0; i < ch.length; i++) {
                for (int j = 0; j < abcArray.length; j++) {
                    if (ch[i] == abcArray[j]) {
                        arrcount[j]++;
                    }
                }
            }
        }

        for (int i = 0; i < abcArray.length; i++) {
            System.out.println(abcArray[i] + " " + arrcount[i]);
        }

        /*Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            map.put(alphabet.get(i), arrcount[i]);// напишите тут ваш код
        }

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            char ch = pair.getKey();
            int count = pair.getValue();
            System.out.println(ch + " " + count);
        }*/
    }

}
