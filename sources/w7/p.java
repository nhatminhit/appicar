package w7;

import android.text.TextUtils;
import d.o0;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final int f14776a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f14777b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f14778c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f14779d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f14780e = Integer.MAX_VALUE;

    /* renamed from: f  reason: collision with root package name */
    public static int f14781f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f14782g = true;

    public static String a(String str, @o0 Throwable th2) {
        if (th2 == null) {
            return str;
        }
        String message = th2.getMessage();
        if (TextUtils.isEmpty(message)) {
            return str;
        }
        return str + " - " + message;
    }

    public static void b(String str, String str2) {
    }

    public static void c(String str, String str2, @o0 Throwable th2) {
        if (!f14782g) {
            b(str, a(str2, th2));
        }
    }

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2, @o0 Throwable th2) {
        if (!f14782g) {
            d(str, a(str2, th2));
        }
    }

    public static int f() {
        return f14781f;
    }

    public static void h(String str, String str2) {
    }

    public static void i(String str, String str2, @o0 Throwable th2) {
        if (!f14782g) {
            h(str, a(str2, th2));
        }
    }

    public static void j(int i10) {
        f14781f = i10;
    }

    public static void k(boolean z10) {
        f14782g = z10;
    }

    public static void l(String str, String str2) {
    }

    public static void m(String str, String str2, @o0 Throwable th2) {
        if (!f14782g) {
            l(str, a(str2, th2));
        }
    }

    public boolean g() {
        return f14782g;
    }
}
