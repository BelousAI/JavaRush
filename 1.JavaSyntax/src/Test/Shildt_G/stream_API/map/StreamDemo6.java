package Test.Shildt_G.stream_API.map;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(1.1);
        myList.add(3.6);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);

        System.out.print("Исходные значения из списка: ");
        myList.stream().forEach((a) -> System.out.print(a + " "));
        System.out.println();

        //Отобразить максимально допустимый предел каждого
        //значения из списка myList на поток данных типа IntStream
        IntStream cStrm = myList.stream().mapToInt((a) -> (int) Math.ceil(a));
        System.out.print("Макс допустимые пределы из списка: ");

        cStrm.forEach((a) -> System.out.print(a + " "));
    }
}
