package Test.Shildt_G.Annotation;
import java.lang.annotation.*;
/**
 * Created by Антон on 11.04.2017.
 */

//Одночленная аннотация
@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
    int value(); // Эта переменная должна иметь имя value
    int xyz() default 0;  //c одночленной аннотацией м.б. члены имеющие значения по умолчанию (default)
}
