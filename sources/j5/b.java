package j5;

import com.fasterxml.jackson.databind.ser.t;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import v4.u;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@v4.a
public @interface b {

    public @interface a {
        u.a include() default u.a.NON_NULL;

        String propName() default "";

        String propNamespace() default "";

        boolean required() default false;

        String value();
    }

    /* renamed from: j5.b$b  reason: collision with other inner class name */
    public @interface C0161b {
        u.a include() default u.a.NON_NULL;

        String name() default "";

        String namespace() default "";

        boolean required() default false;

        Class<?> type() default Object.class;

        Class<? extends t> value();
    }

    a[] attrs() default {};

    boolean prepend() default false;

    C0161b[] props() default {};
}
