package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() {
        //implement this method - реализуйте этот метод
        FileInputStream readFile = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //Properties defProp = new Properties();

            String fileName = reader.readLine();
            readFile = new FileInputStream(fileName);
            load(readFile);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                readFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties saveProp = new Properties();
        for (Map.Entry<String, String> pair : properties.entrySet()) {
            saveProp.put(pair.getKey(), pair.getValue());
        }
        saveProp.store(outputStream, "");
//        PrintWriter printWriter = new PrintWriter(outputStream);
//        if (!properties.isEmpty()) {
//            for (Map.Entry<String, String> pair : properties.entrySet()) {
//                printWriter.println(pair.getKey() + ":" + pair.getValue());
//            }
//        }
//        printWriter.close();
    }

    public void load(InputStream inputStream) throws Exception {
        Properties properties = new Properties();
        properties.load(inputStream);
        if (!properties.isEmpty()) {
            Enumeration en = properties.propertyNames();
            while (en.hasMoreElements()) {
                String tmp = (String) en.nextElement();
                Solution.properties.put(tmp, properties.getProperty(tmp));
            }
//        //implement this method - реализуйте этот метод
//        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//        String[] param;
//        while (reader.ready()) {
//            param = reader.readLine().split(":");
//            properties.put(param[0], param[1]);
//        }
//        reader.close();
        }
    }

    public static void main(String[] args) {
//        Solution s = new Solution();
//        s.fillInPropertiesMap();
//        s.save(new FileOutputStream("d://Test/MyProp2.properties"));
    }
}
