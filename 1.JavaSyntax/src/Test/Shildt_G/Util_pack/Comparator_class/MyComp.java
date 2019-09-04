package Test.Shildt_G.Util_pack.Comparator_class;

/**
 * Created by Антон on 05.06.2017.
 */


import java.util.*;

//Способ №1
public class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        //Сравнение в обратном порядке
        return bStr.compareTo(aStr);
    }
    //переопределять метод equals() не требуется

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        ts.add("C_Test");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String str : ts) {
            System.out.print(str + " ");
            System.out.println();
        }
    }
}
