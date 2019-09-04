package Test.Shildt_G.Lambda.Example_Ref_Constr_Obobsh2;

/**
 * Created by Антон on 24.04.2017.
 */

//Простой не обобщенный класс
public class MyClass2 {
    private String str;

    MyClass2(String s) {
        str = s;
    }

    MyClass2() {
        str = null;
    }

    String getStr() {
        return str;
    }
}
