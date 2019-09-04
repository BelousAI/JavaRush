package Test.Shildt_G.Annotation;

import java.lang.reflect.*;
/**
 * Created by Антон on 11.04.2017.
 */

public class Meta3 {
    @MyAnno()
    public static void myMeth() {
        Meta3 ob = new Meta3();

        //Получить аннотацию для метода
        //и вывести значения ее членов
        try {
            Method m = ob.getClass().getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        }
        catch(NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
