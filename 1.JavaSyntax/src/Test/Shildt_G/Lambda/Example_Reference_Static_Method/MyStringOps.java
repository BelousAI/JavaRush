package Test.Shildt_G.Lambda.Example_Reference_Static_Method;

/**
 * Created by Антон on 20.04.2017.
 */

//Определяется статический метод
public class MyStringOps {
    //Статический метод, изменяющий порядок
    //следования символов в строке
    static String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
