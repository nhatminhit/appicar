package w7;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f14689a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f14690b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f14691c = 2;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static int a(int i10, int i11) {
        for (int i12 = 1; i12 <= 2; i12++) {
            int i13 = (i10 + i12) % 3;
            if (b(i13, i11)) {
                return i13;
            }
        }
        return i10;
    }

    public static boolean b(int i10, int i11) {
        if (i10 == 0) {
            return true;
        }
        if (i10 == 1) {
            return (i11 & 1) != 0;
        }
        if (i10 != 2) {
            return false;
        }
        return (i11 & 2) != 0;
    }
}
