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

@f(allowedTargets = {b.FUNCTION, b.PROPERTY, b.PROPERTY_GETTER, b.PROPERTY_SETTER})
@Documented
@Target({ElementType.METHOD})
@c
@e(a.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
public @interface m {
}
