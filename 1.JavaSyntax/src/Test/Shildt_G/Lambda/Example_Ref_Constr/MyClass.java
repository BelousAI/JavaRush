package Test.Shildt_G.Lambda.Example_Ref_Constr;

/**
 * Created by Антон on 21.04.2017.
 */
public class MyClass {
    private int val;

    MyClass(int v) {
        val = v;
    }

    MyClass() {val = 0;}

    int getVal() {
        return val;
    }
}
