package u2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface i2 {
    f1 associateBy() default @f1(Object.class);

    Class<?> entity() default Object.class;

    String entityColumn();

    String parentColumn();

    String[] projection() default {};
}
