package Test.Shildt_G.Threads;

/**
 * Created by Антон on 16.03.2017.
 */
public class TestThreadSynch {
    static class Q {
        int n;

        synchronized int get() {
            System.out.println("Получено: " + n);
            return n;
        }

        synchronized void put(int n) {
            this.n = n;
            System.out.println("Отправлено: " + n);
        }
    }

    static class Producer implements Runnable {
        Q q;

        Producer(Q q) {
            this.q = q;
            new Thread(this, "Поставщик").start();
        }

        public void run() {
            int i = 0;

            while (true) {
                q.put(i++);
            }
        }
    }

    static class Consumer implements Runnable {
        Q q;

        Consumer(Q q) {
            this.q = q;
            new Thread(this, "Потребитель").start();
        }

        public void run() {
            while (true) {
                q.get();
            }
        }
    }

    static class PC {
        public static void main(String[] args) {
            Q q = new Q();
            new Producer(q);
            new Consumer(q);

            System.out.println("Для остановки нажми Ctrl - F2");
        }
    }
}
