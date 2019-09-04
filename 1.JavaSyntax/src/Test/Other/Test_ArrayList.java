package Test.Other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Антон on 10.03.2017.
 */
public class Test_ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        list.add("one");
        list.add("two");
        list.add("three");
        list.add(null);

        String st = list.remove(0);
        String st2 = list.remove(0);

        System.out.println(st);
        System.out.println(st2);
        System.out.println(list);
        System.out.println(list.size());
    }
}
