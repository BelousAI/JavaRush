package Test.Shildt_G.Threads.Example2;

/**
 * Created by Антон on 16.03.2017.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread2();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершеню");
    }
}
