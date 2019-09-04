package Test.Shildt_G.Threads;

/**
 * Created by Антон on 17.03.2017.
 */
public class TestThreadSynch_3_Wait_Flag {
    static class NewThread implements Runnable {
        String name;
        Thread t;
        boolean suspendFlag;

        NewThread(String nameThread) {
            name = nameThread;
            t = new Thread(this, name);
            System.out.println("Новый поток: " + t);
            t.start();
        }

        public void run() {
            try {
                for (int i = 15; i > 0; i--) {
                    System.out.println(name + " : " + i);
                    Thread.sleep(200);
                    synchronized (this) {
                        while (suspendFlag) {
                            wait();
                        }
                    }
                }
            }
            catch (InterruptedException e) {
                System.out.println(name + " прерван");
            }
            System.out.println(name + " завершен");
        }

        synchronized void mysuspend() {
            suspendFlag = true;
        }

        synchronized void myresume() {
            suspendFlag = false;
            notify();
        }
    }

    static class SuspendResume {
        public static void main(String[] args) {
            NewThread ob1 = new NewThread("Первый");
            NewThread ob2 = new NewThread("Второй");

            try {
                Thread.sleep(1000);
                ob1.mysuspend();
                System.out.println("Приостановка Первого потока");
                Thread.sleep(1000);
                ob1.myresume();
                System.out.println("Возобновление Первого потока");
                ob2.mysuspend();
                System.out.println("Приостановка Второго потока");
                Thread.sleep(1000);
                ob2.myresume();
                System.out.println("Возобновление Второго потока");
            }
            catch (InterruptedException e) {
                System.out.println("Главный поток прерван");
            }

            // Ожидать завершения потоков исполнения
            try {
                System.out.println("Ожидание завершения потоков.");
                ob1.t.join();
                ob2.t.join();
            }
            catch (InterruptedException e) {
                System.out.println("Главный поток прерван");
            }
            System.out.println("Главный поток завершен.");
        }
    }
}
