package session23Annotations.simplest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//A bare-bones annotation
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.METHOD,
        ElementType.CONSTRUCTOR,
        ElementType.ANNOTATION_TYPE,
        ElementType.PACKAGE,
        ElementType.FIELD,
        ElementType.LOCAL_VARIABLE
})
public @interface Simple {
    String value() default "-default-";
}
