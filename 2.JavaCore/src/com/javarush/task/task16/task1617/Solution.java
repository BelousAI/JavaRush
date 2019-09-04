package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();//add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            while (!isInterrupted()) {
                try {
                    if (countSeconds > 0) {
                    System.out.print(countSeconds + " ");
                    Thread.sleep(1000);
                    countSeconds--;}

                    if (countSeconds < 1) {
                        System.out.print("Марш!");
                        return;//add your code here - добавь код тут
                    }
                }
                catch (InterruptedException e) {
                    System.out.print("Прервано!");
                    return;
                }
            }
        }
    }
}
