package Test.Other.Thread_example;

import java.util.concurrent.Semaphore;

/**
 * Created by Антон on 29.06.2017.
 */

//Получение доступа к ограниченному колличеству ресурсов
public class SemaphoresMain {
    public static void main(String[] args) {
        Semaphore table = new Semaphore(2); //ресурс

        Person person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person.table = table;
        person2.table = table;
        person3.table = table;
        person4.table = table;
        person5.table = table;

        person.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();
    }

    static class Person extends Thread {
        Semaphore table;

        @Override
        public void run() {
            System.out.println(getName() + " waiting for table");
            try {
                table.acquire();
                System.out.println(getName() + " eat at the table");
                Thread.sleep(1000);
                System.out.println(getName() + " release the table");
                table.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
