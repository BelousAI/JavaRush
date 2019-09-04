package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName = reader.readLine();
            reader.close();

            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while (br.ready()) {
                String str = br.readLine();
                //String[] arr = str.split(" ");
                Pattern pat = Pattern.compile("\\d+");
                Matcher mat = pat.matcher(str);
                StringBuffer sb = new StringBuffer();

                while (mat.find()) {
                    int num = Integer.parseInt(mat.group());
                    if (map.containsKey(num)) {
                        mat.appendReplacement(sb, map.get(num));
                    }
                }
                mat.appendTail(sb);

                System.out.println(sb.toString());


                /*for (int i = 0; i < arr.length; i++) {
                    try {
                        int num = Integer.parseInt(arr[i]);
                        if (num >= 0 && num < 13) {
                            arr[i] = map.get(num);
                        }
                    }
                    catch (NumberFormatException e) {
                        continue;
                    }
                }

                for (String s : arr) {
                    System.out.print(s + " ");
                }
                System.out.println();*/
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
