package Test.Shildt_G.Util_pack.Observable_class;

/**
 * Created by Антон on 07.06.2017.
 */

import java.util.*;

public class ObserverDemo {
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Watcher observing = new Watcher();

        /**
         * Ввести наблюдаемый объект в список наблюдателей
         * за наблюдаемым объектом
         */
        observed.addObserver(observing);
        observed.counter(10);
    }
}
