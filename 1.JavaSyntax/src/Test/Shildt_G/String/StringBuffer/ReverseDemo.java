package Test.Shildt_G.String.StringBuffer;

/**
 * Created by Антон on 05.05.2017.
 */

//Изменение порядка следования символов в объекте
public class ReverseDemo {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("abcdef");
        System.out.println(s);

        s.reverse();
        System.out.println(s);
    }
}
