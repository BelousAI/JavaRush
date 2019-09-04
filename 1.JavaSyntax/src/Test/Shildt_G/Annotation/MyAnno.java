package Test.Shildt_G.Annotation;

import java.lang.annotation.*;


/**
 * Created by Антон on 11.04.2017.
 */

//Объявление типа аннотации, включая значения ее членов по умолчанию
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str() default "Тестирование";
    int val() default 9000;
}
