package Test.Shildt_G.Lambda.Example_Ref_Obobsh_Meth;

/**
 * Created by Антон on 21.04.2017.
 */
public class GenericMethodRefDemo {
    static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"Один", "Два", "Три", "Два"};
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("Массив vals содержит " + count + " числа 4");

        count = myOp(MyArrayOps::countMatching, strs, "Два");
        System.out.println("Массив strs содержит " + count + " числа Два");
    }
}
