package Test.Shildt_G.Util_pack;

/**
 * Created by Антон on 06.06.2017.
 */

import java.util.*;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");

        if (noVal.isPresent()) System.out.println("Не подлежит выводу");
        else System.out.println("Объект noVal не содержит значение");

        if (hasVal.isPresent()) System.out.println(
                "Объект hasVal содержит следующую строку: " + hasVal.get());

        String defStr = noVal.orElse("Строка по умолчанию");
        System.out.println(defStr);
    }
}
