package Test.Shildt_G.Threads.Zadacha_iz_lekciy;

/**
 * Created by Антон on 23.06.2017.
 */
import java.util.ArrayList;

public class ProducerConsumerManager {
    private final ArrayList<String> list = new ArrayList<>();
    private final Object lock = new Object();
    private final static int CAPACITY = 5;
    private final static int PRODUCERS_COUNT = 2;
    private final static int CONSUMERS_COUNT = 2;

    public void start() {
        //Создаем производителей
        for (int i = 0; i < PRODUCERS_COUNT; i++) {
            Thread producer = new Thread(new Producer(this));
            producer.start();
        }

        //Создаем потребителей
        for (int i = 0; i < CONSUMERS_COUNT; i++) {
            Thread consumer = new Thread(new Consumer(this));
            consumer.start();
        }

    }

    public String getItem() throws InterruptedException {
        synchronized (lock) {
            while (list.size() <= 0) {
                lock.wait();
            }
            String result = list.remove(list.size() - 1);
            lock.notifyAll();
            return result;
        }
    }

    public void addItem(String item) throws InterruptedException {
        synchronized (lock) {
            while (list.size() >= CAPACITY) {
                lock.wait();
            }
            list.add(item);
            lock.notifyAll();
        }
    }

    public static void main(String[] args) {
        ProducerConsumerManager manager = new ProducerConsumerManager();
        manager.start();
    }
}
