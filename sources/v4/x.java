package v4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@a
public @interface x {

    /* renamed from: p0  reason: collision with root package name */
    public static final String f14175p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    public static final int f14176q0 = -1;

    public enum a {
        AUTO,
        READ_ONLY,
        WRITE_ONLY,
        READ_WRITE
    }

    a access() default a.AUTO;

    String defaultValue() default "";

    int index() default -1;

    boolean required() default false;

    String value() default "";
}
