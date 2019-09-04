package Test.Shildt_G.Util_pack.Observable_class;

/**
 * Created by Антон on 07.06.2017.
 */
public class TwoObservers {
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Watcher observing1 = new Watcher();
        Watcher2 observing2 = new Watcher2();

        //ввести в список оба наблюдателя
        observed.addObserver(observing1);
        observed.addObserver(observing2);
        observed.counter(10);
    }
}
