package com.javarush.task.task18.task1820;

import java.io.*;
/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            String s2 = reader.readLine();

            FileInputStream fis = new FileInputStream(s);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();

            String[] strResult = new String(buffer).split(" ");
            String line = "";

            for (String str : strResult) {
                line += Math.round(Double.parseDouble(str)) + " ";
            }

            FileOutputStream fos = new FileOutputStream(s2);
            fos.write(line.getBytes());
            fos.close();

/*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Длинное решение!!!
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(s)));
            String file = reader.readLine();
            String[] num = file.split(" ");
            double[] result = new double[num.length];
            int[] resultInt = new int[result.length];

            for (int i = 0; i < num.length; i++) {
                result[i] = Double.parseDouble(num[i]);
                result[i] = Math.round(result[i]);
                resultInt[i] = (int) result[i];
            }

            StringBuilder sb = new StringBuilder();

            for (int i : resultInt) {
                sb.append(i).append(' ');
            }

            String str  = sb.toString();
            BufferedWriter writer = new BufferedWriter(new FileWriter(s2));
            writer.write(str);

            reader.close();
            writer.close();*/
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
