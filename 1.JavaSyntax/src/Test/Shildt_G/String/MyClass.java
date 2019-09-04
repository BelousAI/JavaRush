package Test.Shildt_G.String;

/**
 * Created by Антон on 24.04.2017.
 */

//Конструкторы класса String
public class MyClass {
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        String str = new String(ch);
        System.out.println(str);

        str = new String(ch, 2, 3);
        System.out.println(str);

        String s2 = new String(str);
        System.out.println(s2);
    }
}
