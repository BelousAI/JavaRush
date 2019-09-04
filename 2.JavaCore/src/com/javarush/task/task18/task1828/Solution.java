package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String fileName = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        Map<Integer, String[]> map = new LinkedHashMap<>();
        String[] array = new String[3];

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.ready()) {
                String line = br.readLine();
                array[0] = line.substring(8, 38);
                array[1] = line.substring(38, 46);
                array[2] = line.substring(46, 50);
                map.put(Integer.parseInt(line.substring(0, 8).trim()), array);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Ошибка при чтении файла");
            return;
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
            return;
        }

        switch (args[0]) {
            case "-u":
                String[] arrStr = new String[3];
                arrStr[0] = String.format("%-30.30s", args[2]);
                arrStr[1] = String.format("%-8.8s", args[3]);
                arrStr[2] = String.format("%-4.4s", args[4]);
                map.put(Integer.parseInt(args[1]), arrStr);
                break;
            case "-d":
                map.remove(Integer.parseInt(args[1]));
                break;
            default:
                return;
        }

        try (PrintWriter pw = new PrintWriter(fileName)) {
            for (Map.Entry<Integer, String[]> pair : map.entrySet()) {
                Integer key = pair.getKey();
                String[] values = pair.getValue();
                pw.write(String.format("%-8d", key) + values[0] + values[1] + values[2] + System.lineSeparator());
            }
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
