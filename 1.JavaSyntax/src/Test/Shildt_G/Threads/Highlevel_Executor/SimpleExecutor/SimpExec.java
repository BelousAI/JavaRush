package Test.Shildt_G.Threads.Highlevel_Executor.SimpleExecutor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExec {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        CountDownLatch cdl2 = new CountDownLatch(5);
        CountDownLatch cdl3 = new CountDownLatch(5);
        CountDownLatch cdl4 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);

        System.out.println("Запуск потоков");

        //запустить потоки исполнения
        es.execute(new MyThread("A", cdl));
        es.execute(new MyThread("B", cdl2));
        es.execute(new MyThread("C", cdl3));
        es.execute(new MyThread("D", cdl4));

        try {
            cdl.await();
            cdl2.await();
            cdl3.await();
            cdl4.await();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        es.shutdown();
        System.out.println("Завершение потоков");
    }
}
