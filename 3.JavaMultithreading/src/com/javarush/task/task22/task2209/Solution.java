package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) {
        Path path;
        String content = "";
        String[] arrayStr;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            path = Paths.get(reader.readLine());
            Scanner scanner = new Scanner(path);

            while (scanner.hasNext()) {
                content = scanner.nextLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        arrayStr = content.split(" ");
        StringBuilder result = getLine(arrayStr);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder sb = new StringBuilder();
        if (words == null || words.length == 0) return sb;

        LinkedList<String> list = new LinkedList<>(Arrays.asList(words));

        for (int i = 0; i < list.size(); i++) {
            String first = list.get(i);
            int lastChar = first.length() - 1;
            //int arrayLength = list.size();
            boolean flag = false;

            for (int j = i + 1; j < list.size(); j++) {
                String second = list.get(j);
                if ((Character.toLowerCase(first.charAt(lastChar)) == Character.toLowerCase(second.charAt(0)))) {
                    sb.append(first).append(" ").append(second).append(" ");
                    list.remove(j);
                    //list.addLast(second);
                    flag = true;
                    break;
                }
            }

            if (!flag && i < list.size() - 1) {
                list.add(list.get(i + 1));
            }
        }
        System.out.println(list);
        return sb;
    }
}
