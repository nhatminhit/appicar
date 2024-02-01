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

@h1(version = "1.3")
@f(allowedTargets = {b.CLASS, b.PROPERTY, b.LOCAL_VARIABLE, b.VALUE_PARAMETER, b.CONSTRUCTOR, b.FUNCTION, b.PROPERTY_GETTER, b.PROPERTY_SETTER, b.EXPRESSION, b.FILE, b.TYPEALIAS})
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@e(a.SOURCE)
@Retention(RetentionPolicy.SOURCE)
public @interface r0 {
    Class<? extends Annotation>[] markerClass();
}
