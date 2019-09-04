package Test.Shildt_G.Threads.HeadFirst.Example1;

public class RunThreads implements Runnable {
    public static void main(String[] args) {
        Runnable runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("alpha");
        beta.setName("beta");
        alpha.start();
        beta.start();
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println("Сейчас работает: " + threadName + i);
        }
    }
}
