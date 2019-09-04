package Test.Shildt_G.Threads.Highlevel_Synchronize.Semaphore.Consumer_Producer;

public class ProdCon {
    public static void main(String[] args) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}
