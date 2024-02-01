package zd;

import ae.a;
import ae.c;
import ae.e;
import ae.f;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@f(allowedTargets = {})
@Documented
@Target({})
@c
@e(a.BINARY)
@Retention(RetentionPolicy.CLASS)
public @interface b1 {
    String expression();

    String[] imports();
}
