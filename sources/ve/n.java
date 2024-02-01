package ve;

import ae.a;
import ae.b;
import ae.c;
import ae.e;
import ae.f;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@f(allowedTargets = {b.CLASS, b.FUNCTION, b.PROPERTY, b.TYPE})
@c
@e(a.BINARY)
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface n {
    boolean suppress() default true;
}
