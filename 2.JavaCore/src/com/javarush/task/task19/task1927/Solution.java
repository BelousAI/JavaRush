package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        String text = "JavaRush - курсы Java онлайн\r";

        testString.printSomething();
        String str = outputStream.toString();
        System.setOut(consoleStream);
        String[] arr = str.split("\n");

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && i > 0) {
                System.out.println(text);
            }
            System.out.println(arr[i]);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
