package Test.Shildt_G.String;

/**
 * Created by Антон on 27.04.2017.
 */
public class ChangeCase {
    public static void main(String[] args) {
        String s = "Это тест.";
        System.out.println("Исходная строка: " + s);
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println("Верхний регистр: " + upper);
        System.out.println("Нижний регистр: " + lower);
    }
}
