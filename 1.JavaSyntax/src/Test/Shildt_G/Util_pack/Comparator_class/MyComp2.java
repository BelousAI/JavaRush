package Test.Shildt_G.Util_pack.Comparator_class;

/**
 * Created by Антон on 05.06.2017.
 */
import java.util.*;

//Способ №2
public class MyComp2 implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        //Сравнение в естественном порядке
        return aStr.compareTo(bStr);
    }
    //переопределять метод equals() не требуется

    public static void main(String[] args) {
        MyComp2 mc = new MyComp2(); // создать компаратор

        TreeSet<String> ts = new TreeSet<>(mc.reversed()); //меняет порядок на обратный естественному.
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
