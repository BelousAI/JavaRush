package Test.Shildt_G.Threads.Example2;

/**
 * Created by Антон on 16.03.2017.
 */
public class NewThread2 extends Thread {
    public NewThread2() {
        //создать новый , второй поток исполнения
        super("Демонстрационный поток");
        System.out.println("Дочерний поток создан: " + this);
        start();
    }

    //Точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершеню");
    }
}
