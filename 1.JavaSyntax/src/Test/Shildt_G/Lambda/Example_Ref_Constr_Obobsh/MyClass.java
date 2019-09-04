package Test.Shildt_G.Lambda.Example_Ref_Constr_Obobsh;

/**
 * Created by Антон on 24.04.2017.
 */

//Ссылка на конструктор обобщенного класса
public class MyClass<T> {
    private T val;

    MyClass(T n) {
        val = n;
    }

    MyClass() {
        val = null;
    }

    T getVal() {
        return val;
    }
}
