package Test.Other;

/**
 * Created by Антон on 18.06.2017.
 */

import java.util.LinkedList;
public class A {
    private String name = "Fill";
    private static LinkedList<Integer> list = new LinkedList<>();

    public void print() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (Integer x : list) {
            System.out.println(x);
        }
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("\n" + result);
    }
}
