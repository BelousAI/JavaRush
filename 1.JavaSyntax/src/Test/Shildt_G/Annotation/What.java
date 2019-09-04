package Test.Shildt_G.Annotation;

import java.lang.annotation.*;

/**
 * Created by Антон on 11.04.2017.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface What {
    String description();
}
