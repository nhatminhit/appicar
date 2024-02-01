package oe;

import ae.a;
import ae.b;
import ae.e;
import ae.f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@f(allowedTargets = {b.FUNCTION, b.PROPERTY, b.CONSTRUCTOR})
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@e(a.BINARY)
@Retention(RetentionPolicy.CLASS)
public @interface h {
}
