package Test.Shildt_G.stream_API.map.demo5;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {

        //Список имен, номеров и адресов
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Larry", "11-22-11", "l@gmail.com"));
        myList.add(new NamePhoneEmail("Jay", "11-22-33", "j@gmail.com"));
        myList.add(new NamePhoneEmail("Mary", "55-22-22", "m@gmail.com"));

        System.out.println("Исходные эл-ты из списка myList: ");
        myList.stream().forEach((a) ->
                                System.out.println(a.name + " " + a.phonenum + " " + a.email));
        System.out.println();

        //Отобразить на новый поток данных
        //только имена и номера телефонов
        Stream<NamePhone> nameAndPhone = myList.stream()
                                .map((a) -> new NamePhone(a.name, a.phonenum));
        System.out.println("Список имен и номеров телефонов: ");

        nameAndPhone.forEach(a -> System.out.println(a.name + " " + a.phonenum));

        ///////////////////////////////////////////////////////////////////////////////
        System.out.println();
        System.out.println("Отфильтровать Jay:");
        nameAndPhone = myList.stream().filter((a) -> a.name.equals("Jay"))
                                      .map((a) -> new NamePhone(a.name, a.phonenum));

        nameAndPhone.forEach((a) -> System.out.println(a.name + " " + a.phonenum));
    }
}
