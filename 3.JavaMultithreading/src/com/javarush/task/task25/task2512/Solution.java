package com.javarush.task.task25.task2512;

/* 
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
//        System.out.println(e.getCause().getCause().toString());
//        System.out.println(e.getCause().toString());
//        System.out.println(e.toString());
        printMessage(e);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.uncaughtException(Thread.currentThread(), new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
    }

    public void printMessage(Throwable e) {
        if (e.getCause() == null) {
            System.out.println(e.toString());
        } else {
            printMessage(e.getCause());
            System.out.println(e.toString());
        }
    }
}
