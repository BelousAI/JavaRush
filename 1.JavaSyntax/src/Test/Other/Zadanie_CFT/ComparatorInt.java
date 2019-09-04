package Test.Other.Zadanie_CFT;

import java.util.Comparator;

public class ComparatorInt implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
