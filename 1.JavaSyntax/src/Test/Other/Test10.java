package Test.Other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Антон on 30.03.2017.
 */
public class Test10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,2,2,3,2,3,2,2,3,3,3,5,5);

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        Integer am;
        for (Integer i : list) {

            am = hm.get(i);
            hm.put(i, am == null ? 1 : am + 1);
        }

        System.out.println(hm);
    }
}
