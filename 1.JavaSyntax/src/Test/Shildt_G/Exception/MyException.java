package Test.Shildt_G.Exception;

/**
 * Created by Антон on 10.04.2017.
 */
public class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}
