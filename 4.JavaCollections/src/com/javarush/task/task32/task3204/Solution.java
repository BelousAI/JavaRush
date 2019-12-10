package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        String charLower = "abcdefghijklmnopqrstuvwxyz";
        String charUpper = charLower.toUpperCase();
        String number = "0123456789";
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(charLower.charAt((byte) (Math.random() * charLower.length())));
            list.add(charUpper.charAt((byte) (Math.random() * charUpper.length())));
            list.add(number.charAt((byte) (Math.random() * number.length())));
        }

        list.remove(list.size() - 1);
        Collections.shuffle(list);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for (Character ch : list) {
            baos.write(ch);
        }
        return baos;
    }
}