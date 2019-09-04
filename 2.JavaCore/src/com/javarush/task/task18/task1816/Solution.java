package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        byte[] byteStr = alfabet.getBytes();
        int count = 0;

        try (FileInputStream fis = new FileInputStream(args[0]);){
            while (fis.available() > 0) {
                int data = fis.read();
                for (byte ch : byteStr) {
                    if ((byte)data == ch) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        /*try (FileInputStream fis = new FileInputStream(args[0]);){
            int count = 0;
            while (fis.available() > 0) {
                int data = fis.read();
                if ((data >= 'A') && (data <= 'Z')) count++;
                else if ((data >= 'a') && (data <= 'z')) count++;
            }
            System.out.println(count);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }*/
    }
}
