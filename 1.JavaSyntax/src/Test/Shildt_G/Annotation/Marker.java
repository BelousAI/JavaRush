package Test.Shildt_G.Annotation;
import java.lang.reflect.*;
/**
 * Created by Антон on 11.04.2017.
 */
public class Marker {
    //аннотировать метод с помощью маркера
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");

            //определить наличие аннотации
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("Аннотация-маркер MyMarker присутствует.");
            }
        }
        catch(NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
