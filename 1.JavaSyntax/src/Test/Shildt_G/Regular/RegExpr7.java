package Test.Shildt_G.Regular;

import java.util.regex.*;
/**
 * Created by Антон on 25.05.2017.
 */

//Применить класс символов
public class RegExpr7 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("[a-z]+");
        Matcher mat = pat.matcher("this is a test.");

        while(mat.find()) {
            System.out.println("Совпадение: " + mat.group());
        }
    }
}
