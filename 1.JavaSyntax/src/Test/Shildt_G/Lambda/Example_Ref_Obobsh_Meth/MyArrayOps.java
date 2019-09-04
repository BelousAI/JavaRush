package Test.Shildt_G.Lambda.Example_Ref_Obobsh_Meth;

/**
 * Created by Антон on 21.04.2017.
 */

//В этом классе определяется метод, возвращающий кол-во
// элементов в массиве, равных указанному значению.
    //Метод - обобщенный, класс - нет.
public class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) count++;
        }
        return count;
    }
}
