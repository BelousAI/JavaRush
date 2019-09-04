package Test.Shildt_G.Threads.Highlevel_Executor.Callable;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
    private int stop;

    Sum(int v) {
        stop = v;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}
