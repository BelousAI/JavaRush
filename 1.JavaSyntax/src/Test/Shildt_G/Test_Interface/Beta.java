package Test.Shildt_G.Test_Interface;

/**
 * Created by Антон on 07.04.2017.
 */
public interface Beta extends Alpha{
    default void reset() {
        System.out.println("Метод из интерфейса Beta");
    }

    static void fuck() {
        System.out.println("Static2");
    }
}
