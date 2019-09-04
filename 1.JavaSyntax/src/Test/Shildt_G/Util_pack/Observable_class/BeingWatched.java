package Test.Shildt_G.Util_pack.Observable_class;

/**
 * Created by Антон on 07.06.2017.
 */
import java.util.*;

//Наблюдаемый класс
public class BeingWatched extends Observable {
    void counter(int period) {
        for (; period >= 0; period--) {
            setChanged();
            notifyObservers(new Integer(period));
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println("Ожидание прервано");
            }
        }
    }
}
