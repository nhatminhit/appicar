package oe;

import ae.b;
import ae.d;
import ae.e;
import ae.f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import xe.n1;
import zd.h1;
import zd.m;

@f(allowedTargets = {b.CLASS, b.FUNCTION, b.PROPERTY, b.CONSTRUCTOR, b.TYPEALIAS})
@Repeatable(a.class)
@e(ae.a.SOURCE)
@d
@h1(version = "1.2")
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
public @interface p {

    @f(allowedTargets = {b.CLASS, b.FUNCTION, b.PROPERTY, b.CONSTRUCTOR, b.TYPEALIAS})
    @e(ae.a.SOURCE)
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @n1
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        p[] value();
    }

    int errorCode() default -1;

    m level() default m.P;

    String message() default "";

    String version();

    q versionKind() default q.O;
}
