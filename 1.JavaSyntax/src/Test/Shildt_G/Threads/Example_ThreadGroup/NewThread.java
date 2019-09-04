package Test.Shildt_G.Threads.Example_ThreadGroup;

/**
 * Created by Антон on 02.06.2017.
 */

//Применение групп потоков исполнения
class NewThread extends Thread {
    boolean suspendFlag;

    NewThread(String threadName, ThreadGroup tgOb) {
        super(tgOb, threadName);
        System.out.println("Новый поток: " + this);
        suspendFlag = false;
        start();
    }

    //Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println("Исключение в " + getName());
        }
        System.out.println(getName() + " завершается.");
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }

    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Группа А");
        ThreadGroup groupB = new ThreadGroup("Группа B");

        NewThread ob1 = new NewThread("Один", groupA);
        NewThread ob2 = new NewThread("Два", groupA);
        NewThread ob3 = new NewThread("Три", groupB);
        NewThread ob4 = new NewThread("Четыре", groupB);

        System.out.println("\nВывод из метода list():");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Прерывается группа А");
        Thread tga[] = new Thread[groupA.activeCount()];
        groupA.enumerate(tga); //Копируем ссылки на объекты "потоки исполнения" из группы в массив tga

        for (int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).mySuspend(); //приостановить каждый поток исполнения
        }

        try {
            Thread.sleep(4000);
        }
        catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван.");
        }

        System.out.println("Возобновление группы А");
        for (int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).myResume(); //возобновить все потоки исполнения в группе
        }
        //Ожидать завершения потоков исполнениия
        try {
            System.out.println("Ожидание завершения потоков исполнениия.");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        }
        catch (Exception e) {
            System.out.println("Исключение в главном потоке исполнения.");
        }
        System.out.println("Главный поток исполнения завершен.");
    }
}
