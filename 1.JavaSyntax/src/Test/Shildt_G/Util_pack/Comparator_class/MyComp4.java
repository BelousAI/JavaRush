package Test.Shildt_G.Util_pack.Comparator_class;

/**
 * Created by Антон on 05.06.2017.
 */
import java.util.*;

public class MyComp4 implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;

        //Найти индекс символа с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));

        if (k == 0) {  //Фамилии совпадают, проверить имя и фамилию полностью
            return aStr.compareTo(bStr);
        }
        else return k;
    }
    //переопределять  метод equals() не требуется

    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new MyComp4());
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
