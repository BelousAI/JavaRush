package com.javarush.task.task20.task2025;

import java.util.ArrayList;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {

        ArrayList<Long> list = new ArrayList<>();
        long a = 0;

        for (long i = 0; i <= N; i++) {
            String num = Long.toString(i);
            String[] array = num.split("");
            int M = array.length;

            for (int j = 0; j < M; j++) {
                int el = Integer.parseInt(array[j]);
                a += (long) Math.pow(el, M);
            }

            if (a == i) {
                list.add(a);
            }
            a = 0;
        }

        long[] result = new long[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        getNumbers(370);
    }
}
