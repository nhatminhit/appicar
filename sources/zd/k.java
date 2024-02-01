package zd;

import ae.b;
import ae.c;
import ae.f;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@f(allowedTargets = {b.CLASS, b.FUNCTION, b.PROPERTY, b.ANNOTATION_CLASS, b.CONSTRUCTOR, b.PROPERTY_SETTER, b.PROPERTY_GETTER, b.TYPEALIAS})
@Documented
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@c
@Retention(RetentionPolicy.RUNTIME)
public @interface k {
    m level() default m.O;

    String message();

    b1 replaceWith() default @b1(expression = "", imports = {});
}
