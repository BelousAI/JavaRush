package Test.Shildt_G.String;

/**
 * Created by Антон on 26.04.2017.
 */
public class GetCharsDemo {
    public static void main(String[] args) {
        String s = "Это демонстрация метода getChars().";
        int start = 4;
        int end = 8;
        char[] buf = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);

////////////////////////////////////////////////////////

        char[] chars = s.toCharArray();
        System.out.println(chars[5]);

////////////////////////////////////////////////////////
        byte[] bytes = s.getBytes();
        System.out.println(bytes);

        System.out.println(new String(bytes));
    }
}
