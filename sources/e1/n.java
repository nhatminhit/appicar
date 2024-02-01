package e1;

import android.text.TextUtils;
import d.e0;
import d.m0;
import d.o0;
import d.x0;
import java.util.Locale;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public final class n {
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z10, @m0 Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int i10, int i11, int i12, @m0 String str) {
        if (i10 < i11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i12)}));
        } else if (i10 <= i12) {
            return i10;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i12)}));
        }
    }

    @e0(from = 0)
    public static int d(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    @e0(from = 0)
    public static int e(int i10, @o0 String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str);
    }

    public static int f(int i10, int i11) {
        if ((i10 & i11) == i10) {
            return i10;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(i11) + " are allowed");
    }

    @m0
    public static <T> T g(@o0 T t10) {
        t10.getClass();
        return t10;
    }

    @m0
    public static <T> T h(@o0 T t10, @m0 Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void i(boolean z10) {
        j(z10, (String) null);
    }

    public static void j(boolean z10, @o0 String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    @m0
    public static <T extends CharSequence> T k(@o0 T t10) {
        if (!TextUtils.isEmpty(t10)) {
            return t10;
        }
        throw new IllegalArgumentException();
    }

    @m0
    public static <T extends CharSequence> T l(@o0 T t10, @m0 Object obj) {
        if (!TextUtils.isEmpty(t10)) {
            return t10;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @m0
    public static <T extends CharSequence> T m(@o0 T t10, @m0 String str, @m0 Object... objArr) {
        if (!TextUtils.isEmpty(t10)) {
            return t10;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }
}
