package com.javarush.task.task26.task2601;

import java.util.*;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
//        Integer[] array = sort(new Integer[]{13, 8, 15, 5, 17});
//        System.out.println(Arrays.toString(array));
    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        Arrays.sort(array);

        int arrLength = array.length;
        int median;

        if (arrLength % 2 == 0) {
            median = (array[arrLength/2] + array[arrLength/2 - 1]) / 2;
        } else {
            median = array[array.length / 2];
        }

        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1 - median) - Math.abs(o2 - median);
            }
        });

        return array;
    }
}
