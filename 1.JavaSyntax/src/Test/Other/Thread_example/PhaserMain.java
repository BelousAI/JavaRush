package Test.Other.Thread_example;

import java.util.concurrent.Phaser;

/**
 * Created by Антон on 02.07.2017.
 */

/*
    Контроль за выполнением обязательной фазы каждым потоком,
    и лишь после продолжение работы потоками.
 */
public class PhaserMain {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(2);
        new Washer(phaser);
        new Washer(phaser);
    }

    static class Washer extends Thread {
        Phaser phaser;

        public Washer(Phaser phaser) {
            this.phaser = phaser;
            start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(getName() + " washing the car №" + i);
                phaser.arriveAndAwaitAdvance();
            }
        }
    }
}
