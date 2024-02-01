package u2;

import d.t0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface k0 {
    public static final String Q = "[field-name]";
    public static final int R = 1;
    public static final int S = 2;
    public static final int T = 3;
    public static final int U = 4;
    public static final int V = 5;
    public static final int W = 1;
    public static final int X = 2;
    public static final int Y = 3;
    public static final int Z = 4;
    @t0(21)

    /* renamed from: a0  reason: collision with root package name */
    public static final int f13509a0 = 5;
    @t0(21)

    /* renamed from: b0  reason: collision with root package name */
    public static final int f13510b0 = 6;

    /* renamed from: c0  reason: collision with root package name */
    public static final String f13511c0 = "[value-unspecified]";

    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface b {
    }

    @a
    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    @b
    int typeAffinity() default 1;
}
