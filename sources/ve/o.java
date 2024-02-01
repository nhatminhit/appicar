package ve;

import ae.a;
import ae.b;
import ae.e;
import ae.f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@f(allowedTargets = {b.FILE, b.FUNCTION, b.PROPERTY_GETTER, b.PROPERTY_SETTER, b.FIELD})
@Target({ElementType.FIELD, ElementType.METHOD})
@e(a.SOURCE)
@Retention(RetentionPolicy.SOURCE)
public @interface o {
}
