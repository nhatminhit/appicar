package ae;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@f(allowedTargets = {b.P})
@Documented
@Target({ElementType.ANNOTATION_TYPE})
@c
@Retention(RetentionPolicy.RUNTIME)
public @interface f {
    b[] allowedTargets();
}
