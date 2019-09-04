package Test.Shildt_G.Lambda.Example_obobsheniy;

/**
 * Created by Антон on 20.04.2017.
 */
public class GeneticFunctionalInterfaceDemo {
    public static void main(String[] args) {

        //Использовать строковый вариант интерфейса SomeFunc
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Лямбда обращается на " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на " + reverse.func("Выражение"));

        //Использоавать целочисленный вариант интерфейса
        SomeFunc<Integer> factorial = (num) -> {
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("Факториал числа 3 рапен " + factorial.func(3));
        System.out.println("Факториал числа 5 равен " + factorial.func(5));
    }
}
