package Test.Shildt_G.Threads.Highlevel_Synchronize.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);

        System.out.println("Запуск главного потока исполнения");

        new MyThread(cdl);

        try {
            cdl.await();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Завершение главного потока исполнения");
    }
}
