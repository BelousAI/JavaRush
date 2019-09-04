package Test.Other.Thread_example;

/**
 * Created by Антон on 22.06.2017.
 */
public class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i < 11; i++ ) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}
