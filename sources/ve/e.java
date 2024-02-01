package ve;

import ae.a;
import ae.b;
import ae.c;
import ae.f;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@f(allowedTargets = {b.FIELD})
@Documented
@Target({ElementType.FIELD})
@c
@ae.e(a.BINARY)
@Retention(RetentionPolicy.CLASS)
public @interface e {
}
