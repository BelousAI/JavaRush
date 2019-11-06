package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread target;

    public LoggingStateThread(Thread target) {
        this.target = target;
    }

    @Override
    public void run() {
        boolean change = true;
        State state = target.getState();

        while (target.getState() != State.TERMINATED) {
            if (change) {
                System.out.println(state);
                change = false;
            }
            if (target.getState() != state) {
                state = target.getState();
                change = true;
            }
        }
        System.out.println(target.getState());
    }
}
