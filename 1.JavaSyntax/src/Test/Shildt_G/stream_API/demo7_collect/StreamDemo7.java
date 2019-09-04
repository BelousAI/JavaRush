package Test.Shildt_G.stream_API.demo7_collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {

        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Larry", "11-22-11", "l@gmail.com"));
        myList.add(new NamePhoneEmail("Jay", "11-22-33", "j@gmail.com"));
        myList.add(new NamePhoneEmail("Mary", "55-22-22", "m@gmail.com"));

        //Отобразить только имена и номера телефонов на новый поток данных
        Stream<NamePhone> nameAndPhone = myList.stream()
                                                .map((a) -> new NamePhone(a.name, a.phonenum));

        //Составляем список типа List
        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Имена и номера телефонов в списке типа List:");
        for (NamePhone e : npList) {
            System.out.println(e.name + ": " + e.phonenum);
        }

        //Получить другое отображение имен и номеров телефонов
        nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));

        //создаем множество типа Set
        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("\nИмена и номера телефонов во множестве типа Set:");
        for (NamePhone e : npSet) {
            System.out.println(e.name + ": " + e.phonenum);
        }
    }
}
