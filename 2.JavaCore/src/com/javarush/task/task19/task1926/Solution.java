package com.javarush.task.task19.task1926;

import java.io.*;
/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = reader.readLine();
            reader.close();

            BufferedReader br = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder();

            while (br.ready()) {
                sb.append(br.readLine());
                System.out.println(sb.reverse());
                sb.setLength(0);
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
