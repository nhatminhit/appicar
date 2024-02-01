package u2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.CLASS)
public @interface b1 {
    String name() default "";

    boolean unique() default false;

    String[] value();
}
