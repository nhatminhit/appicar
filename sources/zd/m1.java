package zd;

import ae.a;
import ae.b;
import ae.e;
import ae.f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@f(allowedTargets = {b.CLASS, b.ANNOTATION_CLASS, b.TYPE_PARAMETER, b.PROPERTY, b.FIELD, b.LOCAL_VARIABLE, b.VALUE_PARAMETER, b.CONSTRUCTOR, b.FUNCTION, b.PROPERTY_GETTER, b.PROPERTY_SETTER, b.TYPE, b.EXPRESSION, b.FILE, b.TYPEALIAS})
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@e(a.SOURCE)
@Retention(RetentionPolicy.SOURCE)
public @interface m1 {
    String[] names();
}
