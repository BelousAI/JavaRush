package Test.Shildt_G.Threads;

/**
 * Created by Антон on 16.03.2017.
 */
public class DeadLock_Example {
    static class A {
        synchronized void foo(B b) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " вошел в метод A.Foo()");

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Класс А прерван");
            }
            System.out.println(name + " пытается вызвать метод В.last()");
            b.last();
        }

        synchronized void last() {
            System.out.println("В методе A.last()");
        }
    }

    static class B {
        synchronized void bar(A a) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " вошел в метод B.bar()");

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Класс B прерван");
            }
            System.out.println(name + " пытается вызвать метод A.last()");
            a.last();
        }

        synchronized void last() {
            System.out.println("В методе A.last()");
        }
    }

    static class DeadLock implements Runnable {
        A a = new A();
        B b = new B();

        DeadLock() {
            Thread.currentThread().setName("Главный поток");
            Thread t = new Thread(this, "Соперничающий поток");
            t.start();

            a.foo(b); // Получить блокировку для объекта "а" в этом потоке исполнения
            System.out.println("Назад в главный поток!");
        }

        public void run() {
            b.bar(a); // Получить блокировку для объекта "b" в другом потоке исполнения
            System.out.println("Назад в другой поток исполнения!");
        }

        public static void main(String[] args) {
            new DeadLock();
        }
    }
}
