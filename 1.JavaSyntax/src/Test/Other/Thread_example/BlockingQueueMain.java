package Test.Other.Thread_example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by Антон on 02.07.2017.
 */
public class BlockingQueueMain {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new PriorityBlockingQueue();

        new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println(blockingQueue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                blockingQueue.add("New String");
            }
        }.start();
    }
}
