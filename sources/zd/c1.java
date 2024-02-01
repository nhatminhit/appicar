package zd;

import ae.b;
import ae.e;
import ae.f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@f(allowedTargets = {b.ANNOTATION_CLASS})
@e(ae.a.BINARY)
@h1(version = "1.3")
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface c1 {

    public enum a {
        WARNING,
        ERROR
    }

    a level() default a.ERROR;

    String message() default "";
}
