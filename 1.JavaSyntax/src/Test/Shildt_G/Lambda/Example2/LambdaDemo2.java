package Test.Shildt_G.Lambda.Example2;

/**
 * Created by Антон on 19.04.2017.
 */

class LambdaDemo2 {
    public static void main(String[] args) {
        //Лямбда-выраж, проверяющее, является ли число четным
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10)) System.out.printf("Число %d четное\n", 10);
        if (!isEven.test(9)) System.out.println("Число 9 нечетное");

        //Является ли число неотрицательным
        NumericTest isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1)) System.out.println("Число 1 неотрицательное");
        if (!isNonNeg.test(-1)) System.out.println("Число -1 отрицательное");
    }
}
