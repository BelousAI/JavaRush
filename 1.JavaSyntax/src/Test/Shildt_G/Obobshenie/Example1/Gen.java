package Test.Shildt_G.Obobshenie.Example1;

/**
 * Created by Антон on 18.04.2017.
 */
public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        System.out.print("Метод getOb() из класса Gen: ");
        return ob;
    }
}
