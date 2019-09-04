package Test.Other.Thread_example;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Антон on 28.06.2017.
 */
public class AtomicMain {
    static AtomicInteger aInt = new AtomicInteger(0);
    //static int f;

    public static void main(String[] args) {
        for (int i = 0; i < 10_000; i++) {
            new MyThread().start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(aInt.get());
        //System.out.println(f);
    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            aInt.incrementAndGet();
            //f++;
        }
    }
}
