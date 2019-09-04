package Test.Shildt_G.Exception;

/**
 * Created by Антон on 07.04.2017.
 */
public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = 0;
            System.out.println("a = " + a);
            //int b = 42 / a;
            try { int[] c = {1};
                  c[42] = 99;
            }
            catch (ArithmeticException e) {
                System.out.println("Деление на нуль: " + e);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Деление на нуль2: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Ошибка индексации за пределами массива: " + e);
        }

        System.out.println("После блока операторов try/catch.");
    }
}
