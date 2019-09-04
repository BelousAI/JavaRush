package Test.Shildt_G.Util_pack.TimerTask_class;

/**
 * Created by Антон on 07.06.2017.
 */
import java.util.*;

public class TTest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();

        /**
         * Установить первоначальную паузу в течении одной
         * секунды, а затем повторять задание каждые полсекунды
         */
        myTimer.scheduleAtFixedRate(myTask, 1000, 500);
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e) {
            System.out.println("Прервано");
        }
        myTimer.cancel();
    }
}
