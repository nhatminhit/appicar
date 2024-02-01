package j5;

import a6.j;
import i5.o;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@v4.a
public @interface f {

    @Deprecated
    public enum a {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY,
        DEFAULT_INCLUSION
    }

    public enum b {
        DYNAMIC,
        STATIC,
        DEFAULT_TYPING
    }

    Class<?> as() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends j> contentConverter() default j.a.class;

    Class<? extends o> contentUsing() default o.a.class;

    Class<? extends j> converter() default j.a.class;

    @Deprecated
    a include() default a.DEFAULT_INCLUSION;

    Class<?> keyAs() default Void.class;

    Class<? extends o> keyUsing() default o.a.class;

    Class<? extends o> nullsUsing() default o.a.class;

    b typing() default b.DEFAULT_TYPING;

    Class<? extends o> using() default o.a.class;
}
