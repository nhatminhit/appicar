package le;

import ae.b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import ve.h;
import zd.h1;

@h1(version = "1.3")
@ae.f(allowedTargets = {b.CLASS})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface f {
    @h(name = "c")
    String c() default "";

    @h(name = "f")
    String f() default "";

    @h(name = "i")
    int[] i() default {};

    @h(name = "l")
    int[] l() default {};

    @h(name = "m")
    String m() default "";

    @h(name = "n")
    String[] n() default {};

    @h(name = "s")
    String[] s() default {};

    @h(name = "v")
    int v() default 1;
}
