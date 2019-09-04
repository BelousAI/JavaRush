package Test.Shildt_G.Threads.Zadacha_iz_lekciy;

/**
 * Created by Антон on 23.06.2017.
 */
public class Producer implements Runnable {
    private final ProducerConsumerManager manager;

    public Producer(ProducerConsumerManager manager) {
        this.manager = manager;
    }

    public void run() {
        try {
            int currentNumber = 1;
            while (true) {
                Thread.sleep(2000); //имитация долгой работы
                manager.addItem("item " + currentNumber);
                ++currentNumber;
            }
        }
        catch (InterruptedException e) {
            System.out.println("Поток прерван!");
            return;
        }
    }
}
