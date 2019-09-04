package Test.Shildt_G.Util_pack.Observable_class;

/**
 * Created by Антон on 07.06.2017.
 */

import java.util.*;

//Наблюдающий класс
public class Watcher implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println("Метод update() вызван, отсчет count равен " + ((Integer)arg).intValue());
    }
}
