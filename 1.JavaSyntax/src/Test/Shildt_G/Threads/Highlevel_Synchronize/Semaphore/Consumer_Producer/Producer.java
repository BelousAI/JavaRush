package Test.Shildt_G.Threads.Highlevel_Synchronize.Semaphore.Consumer_Producer;

public class Producer implements Runnable {
    private Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            q.put(i);
        }
    }
}
