package Test.Shildt_G.Threads.Highlevel_Synchronize.Semaphore.Consumer_Producer;

import java.util.concurrent.Semaphore;

public class Q {
    private int n;

    //начать с недоступного семафора потребителя (поэтому "0")!!!!!
    private static Semaphore semCon = new Semaphore(0);
    private static Semaphore semProd = new Semaphore(1);

    void get() {
        try {
            semCon.acquire();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Получено: " + n);
        semProd.release();
    }

    void put(int n) {
        try {
            semProd.acquire();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.n = n;
        System.out.println("Отпроавлено: " + n);
        semCon.release();
    }
}
