package Test.Other.Zadanie_CFT.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test_sort {
    private static int[] arr;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Integer temp = list.get(1);
        list.set(1, list.get(0));
        list.set(0, temp);

        list.remove(9);
        list.remove(8);
        //Collections.swap(list, 0, 1);

        System.out.println(list);
        System.out.println(list.size());
    }
}
