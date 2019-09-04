package Test.Thinking_Java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Антон on 14.03.2017.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
}
