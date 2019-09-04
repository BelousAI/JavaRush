package Test.Shildt_G.Util_pack.Observable_class;

/**
 * Created by Антон on 07.06.2017.
 */

import java.util.*;

//Класс второго наблюдателя
public class Watcher2 implements Observer{
    public void update(Observable obj, Object arg) {
        //по окончании выдать звуковой сигнал
        if (((Integer)arg).intValue() == 0) System.out.println("Готово" + '\7');
    }
}
