package u2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface a3 {
    Class<?> entity() default Object.class;

    @g1
    int onConflict() default 3;
}
