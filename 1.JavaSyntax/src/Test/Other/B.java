package Test.Other;

import java.util.LinkedList;

/**
 * Created by Антон on 18.06.2017.
 */
public class B {
    private static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(list.get(i));
        }
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("\n" + result);
    }
}
