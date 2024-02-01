package androidx.databinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
public @interface p {
    String attribute();

    String event() default "";

    String method() default "";

    Class type();
}
