package u2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.CLASS)
public @interface f1 {
    String entityColumn() default "";

    String parentColumn() default "";

    Class<?> value();
}
