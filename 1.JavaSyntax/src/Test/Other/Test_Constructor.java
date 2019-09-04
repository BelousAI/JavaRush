package Test.Other;

/**
 * Created by Антон on 02.03.2017.
 */
public class Test_Constructor {
    public static void main(String[] args) {
        Example ex = new Example("Сначала");
        ex.one();
    }

    public static class Example {
        Example(String text) {
            System.out.println(text + "!!!" + x + y);
        }
        int x = 1;
        int y = 2;

        void one() {
            System.out.println(x + y);
        }
    }
}
