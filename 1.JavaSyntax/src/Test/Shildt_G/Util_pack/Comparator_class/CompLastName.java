package Test.Shildt_G.Util_pack.Comparator_class;

/**
 * Created by Антон on 05.06.2017.
 */

/**
 * Используем метод  thenComparing() для сортировки счетов
 * вкладчиков сначала по фамилии, а затем по имени
 */

import java.util.*;

public class CompLastName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        //Найти индекс символа с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }

    //отсортировать счета вкладчиков по ФИО, если фамилии одинаковы
    static class ComThenByFirstName implements Comparator<String> {
        public int compare(String aStr, String bStr) {
            int i, j;
            return aStr.compareToIgnoreCase(bStr);
        }
    }

    public static void main(String[] args) {
        //CompLastName compLN = new CompLastName();
        //Comparator<String> compLastThenFirst = compLN.thenComparing(new ComThenByFirstName());

        Comparator<String> compLN = (aStr, bStr) ->
                aStr.substring(aStr.lastIndexOf(' ')).
                        compareToIgnoreCase(bStr.substring(bStr.lastIndexOf(' ')));

        Comparator<String> compLastThenFirst = compLN.thenComparing((aStr, bStr) -> aStr.compareToIgnoreCase(bStr));

        TreeMap<String, Double> tm = new TreeMap<>(compLastThenFirst);
        tm.put("Джон Доу", 3434.34);
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Халл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        //Получить множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        //внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + tm.get("Джон Доу"));
    }
}
