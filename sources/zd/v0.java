package zd;

import ae.b;
import ae.c;
import ae.f;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@h1(version = "1.1")
@f(allowedTargets = {b.TYPE})
@Documented
@Target({})
@c
@Retention(RetentionPolicy.RUNTIME)
public @interface v0 {
    String name();
}
