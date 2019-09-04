package Test.Shildt_G.Obobshenie.Example_instanceof;

/**
 * Created by Антон on 18.04.2017.
 */
public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}
