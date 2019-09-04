package Test.Shildt_G.Anonymous;

/**
 * Created by Антон on 20.06.2017.
 */
public class Test {
    public static void main(String[] args) {
        /**
         * Анонимный класс реализует
         * интерфейс Runnable и его метод run()
         * Затем создаем объект этого класса и
         * присваиваем ссылку на него переменной х
         */
        Runnable x = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        };

        Thread thread = new Thread(x);
        thread.start();
    }
}
