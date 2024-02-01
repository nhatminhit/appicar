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
@c
@h1(version = "1.4")
@Documented
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface l {
    String errorSince() default "";

    String hiddenSince() default "";

    String warningSince() default "";
}
