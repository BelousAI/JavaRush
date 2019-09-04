package Test.Shildt_G.Threads.Highlevel_Synchronize.Semaphore.Consumer_Producer;

public class Consumer implements Runnable{
    private Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            q.get();
        }
    }
}
