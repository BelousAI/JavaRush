package Test.Shildt_G.Threads;

/**
 * Created by Антон on 15.03.2017.
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Текущий поток : " + t);

        t.setName("Главная нить");
        System.out.println("Текущий поток : " + t);


        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
