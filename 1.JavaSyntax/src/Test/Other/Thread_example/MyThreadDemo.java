package Test.Other.Thread_example;

/**
 * Created by Антон on 22.06.2017.
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());

        try {
            t.start();
            t.join();
        }
        catch (InterruptedException e) {
            System.out.println("Произошло прерывание потока: " + e);
        }
        System.out.println("Исполнение продолжено");
    }
}
