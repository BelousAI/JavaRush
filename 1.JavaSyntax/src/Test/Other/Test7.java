package Test.Other;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Антон on 12.05.2017.
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println("Cool check:");

        System.out.println(checkWithRegExp("_@BEST"));
        System.out.println(checkWithRegExp("vovan"));
        System.out.println(checkWithRegExp("vo"));
        System.out.println(checkWithRegExp("Z@OZA"));
    }

    public static boolean checkWithRegExp(String str) {
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(str);
        return m.matches();
    }

}
