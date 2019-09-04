package Test.Shildt_G.Lambda;

import java.util.function.Function;
/**
 * Created by Антон on 24.04.2017.
 */
public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        //Вычисляем факториал целочисленного значения
        //используя фунцион-й интерфейс Function
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Факториал числа 3 равен " + factorial.apply(3));
        System.out.println("Факториал числа 5 равен " + factorial.apply(5));
    }
}
