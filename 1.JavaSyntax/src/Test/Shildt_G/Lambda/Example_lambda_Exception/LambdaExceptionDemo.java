package Test.Shildt_G.Lambda.Example_lambda_Exception;

/**
 * Created by Антон on 20.04.2017.
 */
public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1.0, 2.0, 3.0, 4.0};

        //В лямбда-выраж вычисляется средн числовых знвчений массива
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;
            if (n.length == 0) throw new EmptyArrayException();
            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;
        };
        System.out.println("Среднее равно " + average.func(values));

        //Генерирует исключение
        System.out.println("Среднее равно " + average.func(new double[0]));
    }
}
