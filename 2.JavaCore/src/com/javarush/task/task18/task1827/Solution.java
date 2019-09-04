package com.javarush.task.task18.task1827;

/* 
Прайсы
*/
import java.io.*;
import java.util.Formatter;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        StringBuilder sb = new StringBuilder();
        int maxId = 0;
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        while (br.ready()) {
            String line = br.readLine();
            sb.append(line).append(System.lineSeparator());
            String id = line.substring(0, 8);
            int numID = Integer.parseInt(id.trim());
            if (numID > maxId) maxId = numID + 1;
        }
        br.close();

        switch (args[0]) {
            case "-c":
                Formatter form = new Formatter();
                form.format("%-8d%-30.30s%-8.8s%-4.4s", maxId, args[1], args[2], args[3]);
                sb.append(form).append(System.lineSeparator());
                break;
        }

        //System.out.println(sb.toString());

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        bw.write(sb.toString());
        bw.close();
    }
}
