package Test.Shildt_G.Threads;

/**
 * Created by Антон on 16.03.2017.
 */
public class NewThreads_3 implements Runnable {
    String name;
    Thread t;

    public NewThreads_3(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }
}
