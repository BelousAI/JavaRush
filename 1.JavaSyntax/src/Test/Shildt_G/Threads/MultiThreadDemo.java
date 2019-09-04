package Test.Shildt_G.Threads;

/**
 * Created by Антон on 16.03.2017.
 */
public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThreads_3 ob1 = new NewThreads_3("один");
        NewThreads_3 ob2 = new NewThreads_3("два");
        NewThreads_3 ob3 = new NewThreads_3("три");

        System.out.println("Дочерний поток [один] запущен: " + ob1.t.isAlive());
        System.out.println("Дочерний поток [два] запущен: " + ob2.t.isAlive());
        System.out.println("Дочерний поток [три] запущен: " + ob3.t.isAlive());

        try {
            //ожидать выполнения др потоков(нитей) исполнения
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }

        System.out.println("Дочерний поток [один] запущен: " + ob1.t.isAlive());
        System.out.println("Дочерний поток [два] запущен: " + ob2.t.isAlive());
        System.out.println("Дочерний поток [три] запущен: " + ob3.t.isAlive());

        System.out.println("Главный поток завершен.");
    }
}
