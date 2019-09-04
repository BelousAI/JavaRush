package Test.Shildt_G.Annotation;
import java.lang.reflect.*;
/**
 * Created by Антон on 11.04.2017.
 */
public class Single {
    //аннотировать метод одночленной аннотацией
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();

        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());         // выводит значение 100
        }
        catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
