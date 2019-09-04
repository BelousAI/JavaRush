package Test.Shildt_G.Regular;

import java.util.regex.*;
/**
 * Created by Антон on 24.05.2017.
 */
//Пример простого сопоставления с шаблоном
public class RegExpr {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches(); //Проверяем на совпадение

        System.out.println("Проверка совпадения Java c Java:");
        if (found) System.out.println("Совпадает");
        else System.out.println("Не совпадает");

        System.out.println();

        System.out.println("Проверка совпадения Java c Java 8:");
        mat = pat.matcher("Java 8");// Создаем новый сопоставитель с шаблоном
        found = mat.matches(); //Проверяем на совпадение

        if (found) System.out.println("Совпадает");
        else System.out.println("Не совпадает");
    }
}
