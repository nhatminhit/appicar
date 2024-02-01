package ve;

import ae.a;
import ae.b;
import ae.e;
import ae.f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@f(allowedTargets = {b.FUNCTION, b.PROPERTY_GETTER, b.PROPERTY_SETTER, b.CONSTRUCTOR})
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@e(a.SOURCE)
@Retention(RetentionPolicy.SOURCE)
public @interface u {
    Class<? extends Throwable>[] exceptionClasses();
}
