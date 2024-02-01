package xe;

import ae.a;
import ae.b;
import ae.e;
import ae.f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import ve.h;
import zd.h1;

@h1(version = "1.6")
@f(allowedTargets = {b.CLASS})
@Target({ElementType.TYPE})
@e(a.BINARY)
@Retention(RetentionPolicy.CLASS)
public @interface o1 {
    @h(name = "b")
    String[] b() default {};
}
