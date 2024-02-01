package j5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@v4.a
public @interface e {
    public static final String K = "build";
    public static final String L = "with";

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f9522a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9523b;

        public a(e eVar) {
            this(eVar.buildMethodName(), eVar.withPrefix());
        }

        public a(String str, String str2) {
            this.f9522a = str;
            this.f9523b = str2;
        }
    }

    String buildMethodName() default "build";

    String withPrefix() default "with";
}
