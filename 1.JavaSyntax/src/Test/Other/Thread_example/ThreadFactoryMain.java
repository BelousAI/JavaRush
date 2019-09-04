package Test.Other.Thread_example;

import java.util.concurrent.ThreadFactory;

/**
 * Created by Антон on 02.07.2017.
 */

/*
    ThreadFactory - дает возможность наделять потоки одинаковыми св-вами.
 */
public class ThreadFactoryMain {
    public static void main(String[] args) {
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setPriority(Thread.MAX_PRIORITY);
                return thread;
            }
        };
        threadFactory.newThread(new MyThread()).start();
    }

    static class MyThread implements Runnable {
        @Override
        public void run() {
            System.out.println("1");
        }
    }
}
