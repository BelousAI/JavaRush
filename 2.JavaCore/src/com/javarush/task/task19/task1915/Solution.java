package com.javarush.task.task19.task1915;

import java.io.*;
/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = reader.readLine();
            reader.close();

            PrintStream consoleStream = System.out;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream stream = new PrintStream(outputStream);
            System.setOut(stream);

            testString.printSomething();
            System.setOut(consoleStream);
            byte[] array = outputStream.toByteArray();
            String text = outputStream.toString();
            System.out.println(text);
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.write(array);
            fos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

