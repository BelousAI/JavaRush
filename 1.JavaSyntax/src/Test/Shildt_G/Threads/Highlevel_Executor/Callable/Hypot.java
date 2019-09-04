package Test.Shildt_G.Threads.Highlevel_Executor.Callable;

import java.util.concurrent.Callable;

public class Hypot implements Callable<Double> {
    private double side1, side2;

    Hypot(double s1, double s2) {
        side1 = s1;
        side2 = s2;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }
}
