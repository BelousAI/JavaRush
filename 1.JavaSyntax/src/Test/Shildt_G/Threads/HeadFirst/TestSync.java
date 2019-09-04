package Test.Shildt_G.Threads.HeadFirst;

public class TestSync implements Runnable {
    private int balance;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            increment();
            System.out.println("Баланс равен: " + balance + " " + Thread.currentThread().getName());
        }
    }

    private void increment() {
        int i = balance;
        System.out.println("-");
        System.out.println("-");
        balance = i + 1;
    }

    public static void main(String[] args) {
        TestSync job = new TestSync();
        Thread one = new Thread(job);
        Thread two = new Thread(job);
        one.start();
        two.start();
    }
}
