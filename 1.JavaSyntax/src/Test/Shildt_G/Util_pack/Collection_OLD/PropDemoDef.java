package Test.Shildt_G.Util_pack.Collection_OLD;

/**
 * Created by Антон on 06.06.2017.
 */

import java.util.*;

//Использовать список свойств по умолчанию

public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties(); //будет использован по умолчанию
        defList.put("Флорида", "Тэлесси");
        defList.put("Висконсин", "Мэдисон");
        Properties capitals = new Properties(defList); //указан список св-в по умолчанию
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джеферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");

        //Получить множество ключей
        Set<?> states = capitals.keySet();

        //выводим все штаты и их стоицы
        for (Object name : states) {
            System.out.println("Столица штата " + name + " - " + capitals.getProperty((String)name) + ".");
        }
        System.out.println();

        //теперь штат Флорида будет найден в списке по умолчанию
        String str = capitals.getProperty("Флорида");
        System.out.println("Столица Флориды - " + str + ".");
    }
}
