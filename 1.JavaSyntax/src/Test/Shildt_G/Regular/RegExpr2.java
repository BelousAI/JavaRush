package Test.Shildt_G.Regular;

import java.util.regex.*;
/**
 * Created by Антон on 24.05.2017.
 */


public class RegExpr2 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java 8");

        System.out.println("Поиск java в Java 8:");
        if (mat.find()) System.out.println("Последовательность найдена");
        else System.out.println("Совпадения отсутствуют");
    }
}
