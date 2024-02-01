package zd;

import ae.a;
import ae.b;
import ae.e;
import ae.f;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@h1(version = "1.8")
@f(allowedTargets = {b.CLASS})
@Target({ElementType.TYPE})
@e(a.BINARY)
@Retention(RetentionPolicy.CLASS)
@s
public @interface l1 {
    Class<? extends Annotation> markerClass();
}
