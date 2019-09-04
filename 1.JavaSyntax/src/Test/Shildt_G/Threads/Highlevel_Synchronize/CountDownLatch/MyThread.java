package Test.Shildt_G.Threads.Highlevel_Synchronize.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {
    private CountDownLatch latch;

    public MyThread(CountDownLatch latch) {
        this.latch = latch;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            latch.countDown(); //обратный отсчет
        }
    }
}
