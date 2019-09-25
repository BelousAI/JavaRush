package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Horse> list = new ArrayList<>();
        list.add(new Horse("Alfy", 3, 0));
        list.add(new Horse("Beta", 3, 0));
        list.add(new Horse("Gamma", 3, 0));

        game = new Hippodrome(list);
        game.run();
        game.printWinner();
    }

    public void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    
    public void move() {
        for (Horse item : getHorses()) {
            item.move();
        }
    }

    public void print() {
        for (Horse item : getHorses()) {
            item.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        double max = 0;
        Horse winner = null;

        for (Horse item : getHorses()) {
            if (item.getDistance() > max) {
                max = item.getDistance();
                winner = item;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
