package u2;

import d.x0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface m0 {
    @x0({x0.a.LIBRARY_GROUP})
    Class<?>[] autoMigrations() default {};

    Class<?>[] entities();

    boolean exportSchema() default true;

    int version();

    Class<?>[] views() default {};
}
