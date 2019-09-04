package Test.Shildt_G.Regular;

import java.util.regex.*;
/**
 * Created by Антон on 25.05.2017.
 */
//не строгое совпадение
public class RegExpr6 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("e.+?d"); // Не строгое совпадение
        Matcher mat = pat.matcher("extend cup end table");

        while (mat.find()) {
            System.out.println("Совпадение: " + mat.group());
        }
    }
}
