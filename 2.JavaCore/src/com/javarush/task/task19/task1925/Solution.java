package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder sb = new StringBuilder();

        while (reader.ready()) {
            String str = reader.readLine();
            Pattern p = Pattern.compile("([\\S]+){7,}");
            Matcher m = p.matcher(str);

            while (m.find()) {
                sb.append(m.group()).append(",");
            }
        }
        sb.setLength(sb.length() - 1);
        writer.write(sb.toString());

        reader.close();
        writer.close();
    }
}
