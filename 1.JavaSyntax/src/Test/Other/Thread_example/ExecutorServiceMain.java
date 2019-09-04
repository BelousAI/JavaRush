package Test.Other.Thread_example;

import java.util.concurrent.*;

/**
 * Created by Антон on 29.06.2017.
 */
public class ExecutorServiceMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        int i = 0;

        while (i < 3) {
            executorService.submit(new MyRunnable());
            System.out.println(executorService.submit(new MyCallable()).get());
            i++;
        }
        executorService.shutdown();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(1);
        }
    }

    static class MyCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            return "2";
        }
    }
}
