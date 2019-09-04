package Test.Shildt_G.stream_API.map;

import java.util.ArrayList;
import java.util.stream.Stream;

//Отобразить один поток данных на другой
public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        //Отобразить квадр корни эл-тов из списка на новый поток данных
        Stream<Double> sqrtRootStrm = myList.stream().map((a) -> Math.sqrt(a));

        //Получить произведение квадратных корней
        double productOfSqrRoots = sqrtRootStrm.reduce(1.0, (a, b) -> a * b);

        System.out.println("Произв-е квадр корней: " + productOfSqrRoots);

    }
}
