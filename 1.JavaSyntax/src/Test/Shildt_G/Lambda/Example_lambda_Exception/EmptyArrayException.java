package Test.Shildt_G.Lambda.Example_lambda_Exception;

/**
 * Created by Антон on 20.04.2017.
 */
public class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Массив пуст");
    }
}
