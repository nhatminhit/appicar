package v4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@a
public @interface p {
    Class<? extends l0<?>> generator();

    String property() default "@id";

    Class<? extends n0> resolver() default q0.class;

    Class<?> scope() default Object.class;
}
