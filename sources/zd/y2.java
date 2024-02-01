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

@f(allowedTargets = {b.CLASS, b.PROPERTY, b.CONSTRUCTOR, b.FUNCTION, b.TYPEALIAS})
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@e(a.BINARY)
@Retention(RetentionPolicy.CLASS)
public @interface y2 {
    Class<? extends Annotation>[] markerClass();
}
