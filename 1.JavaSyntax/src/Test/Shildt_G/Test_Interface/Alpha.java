package Test.Shildt_G.Test_Interface;

/**
 * Created by Антон on 07.04.2017.
 */
public interface Alpha {
    int x = 10;             //Не явно являются final static
    default void reset() {
        System.out.println("Метод из интерфейса Alpha");
    }

    static void fuck() {
        System.out.println("Вызов статик метода");
    }
}
