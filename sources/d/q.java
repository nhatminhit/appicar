package d;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface q {

    /* renamed from: r  reason: collision with root package name */
    public static final int f5985r = 0;

    /* renamed from: s  reason: collision with root package name */
    public static final int f5986s = 1;

    /* renamed from: t  reason: collision with root package name */
    public static final int f5987t = 2;

    int unit() default 1;
}
