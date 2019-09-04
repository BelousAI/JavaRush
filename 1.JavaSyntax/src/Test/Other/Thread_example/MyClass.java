package Test.Other.Thread_example;

/**
 * Created by Антон on 22.06.2017.
 */

import java.util.ArrayList;

public class MyClass {
    private static final ArrayList<Integer> list = new ArrayList<>();

    static class MyThread implements Runnable {
        public void run() {
            for (int i = 1; i <= 100; i++) {
                synchronized (list) {
                    list.add(list.size(), i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            e.getStackTrace();
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
