package Test.Shildt_G.Threads.Highlevel_Synchronize.Semaphore;

import java.util.concurrent.Semaphore;

public class SemDemo {

    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }

    //Общий ресурс
    static class Shared {
        static int count = 0;
    }

    //Поток исполнения, увеличивающий значение счетчика на единицу
    static class IncThread implements Runnable {
        String name;
        Semaphore sem;
        IncThread(Semaphore s, String n) {
            name = n;
            sem = s;
            new Thread(this).start();
        }

        public void run() {
            System.out.println("Запуск потока " + name);
            try {

                //Сначала получить разрешение
                System.out.println("Поток " + name + " ожидает разрешения");
                sem.acquire();
                System.out.println("Поток " + name + " получает разрешение");

                //А теперь получить доступ к общему ресурсу
                for (int i = 0; i < 5; i++) {
                    Shared.count++;
                    System.out.println(name + ": " + Shared.count);

                    //разрешить, если возможно, переключение контекста
                    Thread.sleep(10);
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            //освободить разрешение
            System.out.println("Поток " + name + " освобождает разрешение");
            sem.release();
        }
    }

    //Поток исполнения, увеличивающий значение счетчика на единицу
    static class DecThread implements Runnable {
        String name;
        Semaphore sem;
        DecThread(Semaphore s, String n) {
            sem = s;
            name = n;
            new Thread(this).start();
        }

        public void run() {
            System.out.println("Запуск потока " + name);

            try {
                //сначала получить разрешение
                System.out.println("Поток " + name + " ожидает разрешения");
                sem.acquire();
                System.out.println("Поток " + name + " получил разрешение");

                //Получить доступ к общему ресурсу
                for (int i = 0; i < 5; i++) {
                    Shared.count--;
                    System.out.println(name + ": " + Shared.count);

                    //разрешить, если возможно, переключение контекста
                    Thread.sleep(10);
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            //освободить разрешение
            System.out.println("Поток " + name + " освобождает разрешение");
            sem.release();
        }
    }

}
