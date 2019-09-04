package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        try {
            String fileName = reader.readLine();
            while (!fileName.equals("end")) {
                list.add(fileName);
                fileName = reader.readLine();
            }
            reader.close();
            Collections.sort(list);

            String x = list.get(0).substring(0, list.get(0).indexOf(".part"));
            FileOutputStream fos = new FileOutputStream(x);

            for (String str : list) {
                FileInputStream fis = new FileInputStream(str);
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                fis.close();
                fos.write(buffer);
            }
            fos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
