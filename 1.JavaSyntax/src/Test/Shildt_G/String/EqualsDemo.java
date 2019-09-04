package Test.Shildt_G.String;

/**
 * Created by Антон on 26.04.2017.
 */

//Демонстрация применения методов equals() и equalsIgnoreCase()
public class EqualsDemo {
    public static void main(String[] args) {
        String s1 = "Привет";
        String s2 = "Привет";
        String s3 = "Прощай";
        String s4 = "ПРИВЕТ";

        System.out.println(s1 + " равно " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " равно " + s3 + " -> " + s1.equals(s3));
        System.out.println(s1 + " равно " + s4 + " -> " + s1.equals(s4));

        System.out.println(s1 + " равно без учета регистра " + s4 + " -> " + s1.equalsIgnoreCase(s4));

        /////////////////////////////////////////////////////////////////////////////////////
        //Сравнение двух подстрок одной строки или двух разных.

        System.out.println(s1.regionMatches(true, 2, s2, 2, 3 ));

        ////////////////////////////////////////////////////////////////////////////////////
        //Начинается/Заканчивается ли символьная строка с указанной подстроки

        boolean bn = s1.startsWith("");
        System.out.println(bn);

        bn = s1.endsWith("вет");
        System.out.println(bn);

        bn = s1.startsWith("вет", 3);
        System.out.println(bn);

    }
}
