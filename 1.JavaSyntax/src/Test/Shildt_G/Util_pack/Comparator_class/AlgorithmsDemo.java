package Test.Shildt_G.Util_pack.Comparator_class;

/**
 * Created by Антон on 05.06.2017.
 */
import java.util.*;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        //List<Integer> list = Collections.singletonList(26);
        //list.add(25);
        Collections.rotate(ll, 2);



        //Создаем компаратор с обратным упорядочением
        Comparator<Integer> r = Collections.reverseOrder();

        //сортировка списка с помощью этого компаратора
        Collections.sort(ll, r);

        System.out.print("Список отсортирован в обратном порядке: ");
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Перетасовать список
        Collections.shuffle(ll);
        System.out.print("Список перетасован: ");
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Минимум: " + Collections.min(ll));
        System.out.println("Максимум: " + Collections.max(ll));

    }
}
