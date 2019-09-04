package Test.Shildt_G.Threads.Highlevel_Synchronize.Phaser;

import java.util.concurrent.Phaser;

//Поток исполнения, использующий синхронизатор фаз типа Phaser
public class MyThread implements Runnable {
    Phaser phsr;
    String name;
    MyThread(Phaser p, String s) {
        phsr = p;
        name = s;
        phsr.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Поток " + name + " начинает первую фазу");
        phsr.arriveAndAwaitAdvance(); // Известить о достижении фазы

        /*
        * Небольшая пауза, чтобы не нарушить порядок вывода.
        * Только для иллюстрации, но необязательно для правильного
        * функционирования синхронизатора фаз*/
        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Поток " + name + " начинает вторую фазу");
        phsr.arriveAndAwaitAdvance();// известить о достижении фазы

        /*
        * Небольшая пауза, чтобы не нарушить порядок вывода.
        * Только для иллюстрации, но необязательно для правильного
        * функционирования синхронизатора фаз*/
        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Поток " + name + " начинает третью фазу");
        phsr.arriveAndDeregister(); //известить о достижении фазы и снять потоки с регистрации
    }
}
