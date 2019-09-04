package Test.Shildt_G.Exception;

import java.util.Random;

/**
 * Created by Антон on 07.04.2017.
 */
public class HandleError {
    public static void main(String[] args) {
        int a, b, c;
        a = b = c = 0;
        Random r = new Random();

        for (int i = 0; i < 32_000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            }
            catch (ArithmeticException e) {
                System.out.println("Исключение: " + e);
                a = 0;                                 //Присвоить нуль и продолжить работу
            }
            System.out.println("a: " + a);
        }
    }
}
