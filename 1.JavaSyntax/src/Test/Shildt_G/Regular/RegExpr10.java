package Test.Shildt_G.Regular;

import java.util.regex.*;
/**
 * Created by Антон on 25.05.2017.
 */
public class RegExpr10 {
    public static final String TEXT = "Мне очень нравится Тайланд. Таиланд это то место " +
            "куда бы я поехал. тайланд - мечты сбываются!";

    public static void main(String[] args) {
        System.out.println(TEXT.replaceAll("[Тт]а[ий]ланд", "Украина"));

        System.out.println(test("pizza"));   //true
        System.out.println(test("@pizza"));  //false
        System.out.println(test("pizza3"));  //false

    }

    public static boolean test(String testString){
        Pattern p = Pattern.compile("^[a-z]+");
        Matcher m = p.matcher(testString);
        return m.matches();
    }
}
