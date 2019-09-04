package Test.Shildt_G.Annotation;

import java.lang.reflect.*;
/**
 * Created by Антон on 11.04.2017.
 */
public class Meta {
    //Аннотировать метод (У метода myMeth() теперь два параметра)
    @MyAnno(str = "Пример аннотации(Два параметра)", val = 100)
    public static void myMeth(String str, int i) {
       Meta ob = new Meta();

        //получить аннотацию из метода
        //и вывести значения ее членов
        try {
            //Сначала получить объект типа Class,
            //представляющий данный класс
            Class<?> c = ob.getClass();

            //Затем получить объект типа Method,
            //представяющий данный метод
            Method m = c.getMethod("myMeth", String.class, int.class);

            //Далее получить аннтоацию для данного класса
            MyAnno anno = m.getAnnotation(MyAnno.class);

            //И наконец, вывести значения членов аннотации
            System.out.println(anno.str() + " " + anno.val());
        }
        catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("Test", 10);
    }
}
