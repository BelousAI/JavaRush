package Test.Shildt_G.Threads.Highlevel_Synchronize.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск потоков");

        new MyThread(cb, "A");
        new MyThread(cb, "B");
        new MyThread(cb, "C");
        new MyThread(cb, "D");
        new MyThread(cb, "E");
        new MyThread(cb, "F");
    }
}
