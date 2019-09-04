package Test.Shildt_G.Lambda.Example3;

/**
 * Created by Антон on 19.04.2017.
 */
class LambdaDemo3 {
    public static void main(String[] args) {
        //Является ли одно число множителем другого
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2)) System.out.println("Число 2 является множителем числа 10");
        if (!isFactor.test(10, 3)) System.out.println("Число 3 не явл-ся множителем 10");
    }
}
