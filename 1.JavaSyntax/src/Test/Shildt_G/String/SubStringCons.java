package Test.Shildt_G.String;

/**
 * Created by Антон on 24.04.2017.
 */

//Создать символьную строку из подмножества массива символов
public class SubStringCons {
    public static void main(String[] args) {
        byte[] ascii = {65, 66, 67, 68, 69, 70}; //ABCDEF
        String s1 = new String(ascii);
        System.out.println(s1);
        System.out.println(s1.length());

        String s2 = new String(ascii, 2, 3);
        System.out.println(s2 + "\n");

        System.out.println("Hello!!".length() + "\n");
    }
}
