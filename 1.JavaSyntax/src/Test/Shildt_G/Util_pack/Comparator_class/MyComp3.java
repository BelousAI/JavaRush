package Test.Shildt_G.Util_pack.Comparator_class;

/**
 * Created by Антон on 05.06.2017.
 */
import java.util.*;

//Способ №3 (лямбда-выражение)
public class MyComp3 {
    public static void main(String[] args) {
        Comparator<String> mc = (aStr, bStr) -> aStr.compareTo(bStr);

        /**
         * Передать компаратор с обратным упорядочиванием
         * конструктору класса TreeSet ч/з лямбда выражение
         */
        TreeSet<String> ts = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));
        ts.add("C_Test");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String element : ts) {
            System.out.print(element + " ");
            System.out.println();
        }
    }
}
