package Test.Shildt_G.Lambda.Example_Ref_NotStatic_Meth;

/**
 * Created by Антон on 20.04.2017.
 */
public class MethodRefDemo2 {
    //В этом методе функц-ый интерфейс указ-ся в кач-ве типа первого
    //параметра. Следовательно, ему м.б. передан любой экземпляр этого
    //интерфейса, включая и ссылку на метод
    static String stringOp(StringFunc sf, String str) {
        return sf.func(str);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-варажения повышают эффективность Java";
        String outStr;

        //Создать объект типа MyStringOps
        MyStringOps strOps = new MyStringOps();

        //Здесь ссылка на метод strReverse() передается методу stringOps()
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
