package Test.Shildt_G.stream_API.iterator;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Alfa");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Ksi");
        myList.add("Omega");

        //Получить поток данных для списочного массива
        Stream<String> myStream = myList.stream();

        //Получить итератор разделитель
        Spliterator<String> splitItr = myStream.spliterator();

        //Перебрать элемменты в потоке данных
        while (splitItr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        splitItr.forEachRemaining((n) -> System.out.println(n));
        splitItr.forEachRemaining(System.out::println);
    }
}
