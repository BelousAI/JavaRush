package Test.Shildt_G.Exception;

/**
 * Created by Антон on 10.04.2017.
 */
public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = {1, 2, 3};

        try {
            //int result = a / b; //Генерирует исключение типа ArithmeticException

            vals[10] = 19; //Генерирует исключение типа ArrayIndexOfBoundException
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение перехвачено: " + e);
        }
        System.out.println("После многократного перехвата.");
    }
}
