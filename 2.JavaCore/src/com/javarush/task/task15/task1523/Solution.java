package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    private Solution() {
        System.out.println("Private");
    }
    Solution(int i) {
        System.out.println(i);
    }
    protected Solution(String str) {
        System.out.println("Protected");
    }
    public Solution(int i, String str) {
        System.out.println("public");
    }
    public static void main(String[] args) {

    }
}

