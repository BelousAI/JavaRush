package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread_1());
        threads.add(new Thread_2());
        threads.add(new Thread_3());
        threads.add(new Thread_4());
        threads.add(new Thread_5());
    }

    public static void main(String[] args) {
    }

    static class Thread_1 extends Thread {
        public void run() {
            while (true) {
            }
        }
    }

    static class Thread_2 extends Thread {
        public void run() {
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    static class Thread_3 extends Thread {
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Thread_4 extends Thread implements Message {
        public void showWarning() {
            if (Thread.currentThread().isAlive()) {
                Thread.yield();
            }
        }
        public void run() {
            showWarning();
        }
    }

    static class Thread_5 extends Thread {
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String word;
            int number;
            int count = 0;

            while (true) {
                try {
                    word = reader.readLine();
                    if (word.equals("N")) {
                        break;
                    }
                    number = Integer.parseInt(word);
                    count += number;

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(count);
        }
    }
}