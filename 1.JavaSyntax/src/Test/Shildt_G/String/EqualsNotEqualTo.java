package Test.Shildt_G.String;

/**
 * Created by Антон on 26.04.2017.
 */

//Метод equals() в сравнении с операцией ==
public class EqualsNotEqualTo {
    public static void main(String[] args) {
        String s1 = "Привет!";
        String s2 = new String(s1);

        System.out.println(s1 + " равно " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
    }
}
