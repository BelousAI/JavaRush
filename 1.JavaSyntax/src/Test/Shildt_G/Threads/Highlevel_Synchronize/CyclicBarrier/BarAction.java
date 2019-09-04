package Test.Shildt_G.Threads.Highlevel_Synchronize.CyclicBarrier;

public class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}
