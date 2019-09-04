package Test.Shildt_G.Util_pack.Scanner_class;

/**
 * Created by Антон on 08.06.2017.
 */
import java.util.*;

public class FindInLineDemo {
    public static void main(String[] args) {
        String instr = "Имя: Том Возраст: 28 ID: 77";
        Scanner src = new Scanner(instr);

        //найти поле возраста и вывести его содержимое
        src.findInLine("Возраст:");
        if (src.hasNext()) {
            System.out.println(src.next());
        }
        else System.out.println("Ошибка");
        src.close();
    }
}
