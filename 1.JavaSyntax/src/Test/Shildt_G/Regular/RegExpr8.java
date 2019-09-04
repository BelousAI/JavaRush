package Test.Shildt_G.Regular;

import java.util.regex.*;
/**
 * Created by Антон on 25.05.2017.
 */

//Замена
public class RegExpr8 {
    public static void main(String[] args) {
        String str = "Fill Jon Jonathan Frank Kenn Todd";

        Pattern pat = Pattern.compile("Jon.*? ");
        Matcher mat = pat.matcher(str);

        System.out.println("Исходная последоваельность: " + str);
        str = mat.replaceAll("Eric ");

        System.out.println("Измененная последовательность: " + str);
    }
}
