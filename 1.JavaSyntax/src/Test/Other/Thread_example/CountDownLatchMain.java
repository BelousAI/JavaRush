package Test.Other.Thread_example;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Антон on 02.07.2017.
 */

/*
Тикает счетчик в сторону нуля.
После каждого выполнения потока.
 */
public class CountDownLatchMain {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Work(countDownLatch);
        new Work(countDownLatch);
        new Work(countDownLatch);

        new Work(countDownLatch);// возможно, будет выполняться уже после главного потока

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("all job done");
    }

    static class Work extends Thread {
        CountDownLatch countDownLatch;

        public Work(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
            this.start();
        }

        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("done work");
            countDownLatch.countDown();
        }
    }
}
