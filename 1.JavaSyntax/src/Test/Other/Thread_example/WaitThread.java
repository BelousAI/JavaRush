package Test.Other.Thread_example;

/**
 * Created by Антон on 23.06.2017.
 */
public class WaitThread implements Runnable {
    private final Object o;

    public WaitThread(Object o) {
        this.o = o;
    }

    public void run() {
        synchronized (o) {
            try {
                o.wait();
            }
            catch (InterruptedException e) {}

            System.out.println("after wait");
        }
    }

    public static void main(String[] args) {
        Object o = new Object();
        new Thread(new WaitThread(o)).start();
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {}

        System.out.println("before notify");

        synchronized (o) {
            o.notifyAll();
        }
    }
}
