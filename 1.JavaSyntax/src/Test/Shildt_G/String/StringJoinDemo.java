package Test.Shildt_G.String;

/**
 * Created by Антон on 28.04.2017.
 */

//Соединение строк методом join() c помощью разделителя
public class StringJoinDemo {
    public static void main(String[] args) {
        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(result);

        result = String.join(", ", "John", "ID#: 569", "E-mail: John@HerbSchildt.com");
        System.out.println(result);
    }
}
