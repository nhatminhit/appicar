package zd;

import ae.b;
import ae.c;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ae.f(allowedTargets = {b.TYPE})
@Documented
@Target({})
@c
@Retention(RetentionPolicy.RUNTIME)
public @interface f {
    int count();
}
