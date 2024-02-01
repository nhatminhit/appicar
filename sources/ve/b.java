package ve;

import ae.f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import zd.h1;
import zd.k;

@h1(version = "1.2")
@f(allowedTargets = {ae.b.FUNCTION, ae.b.PROPERTY})
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@k(message = "Switch to new -Xjvm-default modes: `all` or `all-compatibility`")
public @interface b {
}
