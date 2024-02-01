package u2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.CLASS)
public @interface w0 {

    /* renamed from: d0  reason: collision with root package name */
    public static final int f13630d0 = 1;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f13631e0 = 2;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f13632f0 = 3;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f13633g0 = 4;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f13634h0 = 5;

    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @a
    int onDelete() default 1;

    @a
    int onUpdate() default 1;

    String[] parentColumns();
}
