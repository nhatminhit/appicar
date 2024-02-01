package j5;

import a6.j;
import i5.k;
import i5.p;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import v4.a;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@a
public @interface c {
    Class<?> as() default Void.class;

    Class<?> builder() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends j> contentConverter() default j.a.class;

    Class<? extends k> contentUsing() default k.a.class;

    Class<? extends j> converter() default j.a.class;

    Class<?> keyAs() default Void.class;

    Class<? extends p> keyUsing() default p.a.class;

    Class<? extends k> using() default k.a.class;
}
