package Test.Shildt_G.Lambda.Example_Ref_Constr_Obobsh2;

/**
 * Created by Антон on 24.04.2017.
 */

//Простой обобщенный класс
public class MyClass<T> {
    private T val;

    MyClass(T v) {val = v;}

    MyClass() {val = null;}

    T getVal() {
        return val;
    }
}
