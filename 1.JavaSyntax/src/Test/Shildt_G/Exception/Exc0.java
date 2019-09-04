package Test.Shildt_G.Exception;

/**
 * Created by Антон on 07.04.2017.
 */
public class Exc0 {
    static void subroutine() {
        int d = 0;
        //int a = 42 / d;
        try {
            System.out.println("вызов из try");
            //throw new RuntimeException();
            //return;
        }
        finally {
            System.out.println("вызов из finally");
        }
    }

    public static void main(String[] args) {
        try {
            subroutine();
        } catch (RuntimeException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
        System.out.println("Hello!");
    }
}
