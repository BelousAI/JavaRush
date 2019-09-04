package Test.Other.Thread_example;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Антон on 02.07.2017.
 */

/*
Выполнение потока Run после 3-ого вызова метода await()
 */
public class CyclicBarrierMain {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Run());
        new Work(cyclicBarrier);
        new Work(cyclicBarrier);
        new Work(cyclicBarrier);
    }

    static class Run extends Thread {
        @Override
        public void run() {
            System.out.println("Run begin");
        }
    }

    static class Work extends Thread {
        CyclicBarrier cyclicBarrier;

        public Work(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
            start();
        }

        @Override
        public void run() {
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
