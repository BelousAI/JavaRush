package Test.Shildt_G.Obobshenie.Example2;

/**
 * Created by Антон on 18.04.2017.
 */

//В подкласс м.б. введены свои параметры типа
public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}
