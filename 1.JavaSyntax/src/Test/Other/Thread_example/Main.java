package Test.Other.Thread_example;

/**
 * Created by Антон on 28.06.2017.
 */
public class Main {
    public static void main(String[] args) {
    Resource resource = new Resource();
    resource.setI(5);
    MThread thread1 = new MThread();
    MThread thread2 = new MThread();
    thread1.resource = resource;
    thread2.resource = resource;
    thread1.start();
    thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(resource.getI());
    }
}

class MThread extends Thread {
    Resource resource;

    @Override
    public void run() {
    resource.changeI();
    }
}

class Resource {
    private int i;

    public int getI() {
        return i;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }

    synchronized void changeI() {
        int i = this.i;
        i++;
        this.i = i;
    }
}
