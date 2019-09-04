package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();//add your code here - добавьте код тут
    }

    public static Flyable result;

    public static void reset() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String text = reader.readLine();

            if (text.equals("helicopter")) {
                result = new Helicopter();//add your code here - добавьте код тут
            }
            if (text.equals("plane")) {
                result = new Plane(50);
            }
            reader.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
