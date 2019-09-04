package Test.Other;

/**
 * Created by Антон on 02.06.2017.
 */
import java.util.*;

public class Test15 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(10);
        list.add(88);

        list.sort(Comparator.reverseOrder());

        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);

        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
        /////////////////////////////////////////

        TreeSet<Integer> set = new TreeSet<>();
        set.add(15);
        set.add(10);
        set.add(88);
        set.add(1);

        NavigableSet<Integer> ns = set.descendingSet();

        System.out.println(set.ceiling(10));

        for (int i : set) {
            System.out.println(i);
        }
        /////////////////////////////////////////

        Set<String> hs = new LinkedHashSet<>();
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");

        System.out.println(hs);
        ////////////////////////////////////////

        Queue<Integer> q = new PriorityQueue<>();
        q.add(5);
        q.add(7);
        q.add(1);
        q.add(8);
        q.add(6);

        for (int i : q) {
            System.out.println(i);
        }
    }
}
