package Test.Shildt_G.Util_pack.Iterator_class;

import java.util.*;

/**
 * Created by Антон on 05.06.2017.
 */
public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.print("Содержимое списочного массива vals: \n");
        Spliterator<Double> spliter = vals.spliterator();
        while (spliter.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        //Создать новый списочный массив, содержащий квардарные корни числовых значений vals
        spliter = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spliter.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        System.out.print("Содержимое списочного массива sqrs: \n");
        spliter = sqrs.spliterator();
        spliter.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
