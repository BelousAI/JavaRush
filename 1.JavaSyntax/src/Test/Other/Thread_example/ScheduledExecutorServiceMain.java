package Test.Other.Thread_example;

/**
 * Created by Антон on 29.06.2017.
 */

//Аналог таймера
import java.util.concurrent.*;

public class ScheduledExecutorServiceMain {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(new MyThread(), 3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }

    static class MyThread implements Runnable {
        @Override
        public void run() {
            System.out.println(1);
        }

    }
}
