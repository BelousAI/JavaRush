package Test.Shildt_G.Regular;

import java.util.regex.*;
/**
 * Created by Антон on 25.05.2017.
 */

public class RegExpr4 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("W+");
        Matcher mat = pat.matcher("W WW WWW");

        while (mat.find()) {
            System.out.println("Совпадает: " + mat.group());
        }
    }
}
