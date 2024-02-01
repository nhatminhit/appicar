package zd;

import ae.b;
import ae.e;
import ae.f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import ve.h;

@f(allowedTargets = {b.CLASS})
@e(ae.a.RUNTIME)
@h1(version = "1.3")
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface i0 {

    public static final class a {
        @k(level = m.O, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        public static /* synthetic */ void a() {
        }

        @h1(version = "1.2")
        public static /* synthetic */ void b() {
        }

        @h1(version = "1.1")
        public static /* synthetic */ void c() {
        }
    }

    @h(name = "bv")
    int[] bv() default {1, 0, 3};

    @h(name = "d1")
    String[] d1() default {};

    @h(name = "d2")
    String[] d2() default {};

    @h(name = "k")
    int k() default 1;

    @h(name = "mv")
    int[] mv() default {};

    @h(name = "pn")
    String pn() default "";

    @h(name = "xi")
    int xi() default 0;

    @h(name = "xs")
    String xs() default "";
}
