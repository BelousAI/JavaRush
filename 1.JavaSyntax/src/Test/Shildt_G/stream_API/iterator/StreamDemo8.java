package Test.Shildt_G.stream_API.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Alfa");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Ksi");
        myList.add("Omega");

        //Получить поток данных для списочного масива
        Stream<String> myStream = myList.stream();

        //Получить итератор для потока данных
        Iterator<String> itr = myStream.iterator();

        //Перебрать элесменты в потоке данных
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
