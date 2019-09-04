package com.javarush.task.task19.task1914;

import java.io.*;
/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        String[] arr = result.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        int answer = 0;
        if (arr[1].equals("+")) answer = (a + b);
        else if (arr[1].equals("-")) answer = (a - b);
        else if (arr[1].equals("*")) answer = (a * b);
        result = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + answer;

        System.setOut(consoleStream);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

