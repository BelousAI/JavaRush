package Test.Shildt_G.Regular;

import java.util.regex.*;
/**
 * Created by Антон on 24.05.2017.
 */

//Нахождение нескольких последовательностей символов
public class RegExpr3 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("test");
        Matcher mat = pat.matcher("test 1 2 3 test");

        while (mat.find()) {
            System.out.println("Последовательность test найдена по индексу " + mat.start());
        }
    }
}
