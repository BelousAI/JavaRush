package Test.Other;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Антон on 09.05.2017.
 */
public class Test_ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        String[] arr = new String[list.size()];
        list.toArray(arr);                                   // Из ArrayList в массив

        ArrayList<String> list2 = new ArrayList<String>();
        List<String> list3 = Arrays.asList(arr);            // Из массива в List<?>

        for (String s : list3) {
            System.out.println(s);
        }

    }
}
