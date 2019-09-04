package Test.Shildt_G.Lambda.Example_Ref_NotStatic_Meth;

/**
 * Created by Антон on 20.04.2017.
 */

//В этом классе определяется метод экземпляра
public class MyStringOps {
    String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
