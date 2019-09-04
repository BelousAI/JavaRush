package Test.Shildt_G.stream_API.iterator;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
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

        //а теперь разделить первый итератор
        Spliterator<String> splitItr2 = splitItr.trySplit();

        //использовать сначала итератор splitItr2, если
        //нельзя разделить итератор splitItr
        if (splitItr2 != null) {
            System.out.println("Результат выводимый splitItr2: ");
            splitItr2.forEachRemaining(System.out::println);
        }

        //а теперь воспользоваться итератором splitItr
        System.out.println("\nрезультат выводимый итератоором splitItr: ");
        splitItr.forEachRemaining(System.out::println);
    }
}
