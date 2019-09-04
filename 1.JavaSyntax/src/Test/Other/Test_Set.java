package Test.Other;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Антон on 27.02.2017.
 */
public class Test_Set {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set);
    }
}
