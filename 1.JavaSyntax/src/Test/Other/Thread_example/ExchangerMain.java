package Test.Other.Thread_example;

import java.util.concurrent.Exchanger;

/**
 * Created by Антон on 02.07.2017.
 */

//Обмен данными между потоками

public class ExchangerMain {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Mark(exchanger);
        new Anket(exchanger);
    }

    static class Mark extends Thread {
        Exchanger<String> exchanger;

        public Mark(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                exchanger.exchange("My name is Mark");
                Thread.sleep(1000);
                exchanger.exchange("I`m 28 year old");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Anket extends Thread {
        Exchanger<String> exchanger;

        public Anket(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                System.out.println(exchanger.exchange(null));
                System.out.println(exchanger.exchange(null));
                //System.out.println(exchanger.exchange(null));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
