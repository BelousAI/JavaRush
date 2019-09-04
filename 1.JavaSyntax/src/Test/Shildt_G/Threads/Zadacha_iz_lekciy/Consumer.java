package Test.Shildt_G.Threads.Zadacha_iz_lekciy;

/**
 * Created by Антон on 23.06.2017.
 */
public class Consumer implements Runnable {
    private final ProducerConsumerManager manager;

    public Consumer(ProducerConsumerManager manager) {
        this.manager = manager;
    }

    public void run() {
        try {
            while (true) {
                String item = manager.getItem();
                Thread.sleep(1500);
                System.out.println(item);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Прерывание потока");
            return;
        }
    }
}
