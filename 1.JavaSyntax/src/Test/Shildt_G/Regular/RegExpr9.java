package Test.Shildt_G.Regular;

import java.util.regex.Pattern;

/**
 * Created by Антон on 25.05.2017.
 */
public class RegExpr9 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("[ .,!]");
        String[] str = pat.split("one two,alpha9 12!done.");

        for (String s : str) {
            System.out.println("Следующая лексема: " + s);
        }
    }
}
