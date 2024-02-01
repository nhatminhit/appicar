package oe;

import ae.a;
import ae.b;
import ae.e;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ae.f(allowedTargets = {b.FUNCTION, b.PROPERTY, b.PROPERTY_GETTER, b.PROPERTY_SETTER})
@Target({ElementType.METHOD})
@e(a.BINARY)
@Retention(RetentionPolicy.CLASS)
public @interface f {
}
