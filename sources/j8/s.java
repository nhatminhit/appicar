package j8;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import d.m0;
import d.o0;
import e8.a;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import w8.g0;

@a
public final class s {
    public s() {
        throw new AssertionError("Uninstantiable");
    }

    @a
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @a
    public static void b(boolean z10, @m0 Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @a
    public static void c(boolean z10, @m0 String str, @m0 Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @a
    public static void d(@m0 Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name2 + " thread, but got " + name + ".");
        }
    }

    @a
    public static void e(@m0 Handler handler, @m0 String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @a
    public static void f() {
        g("Must be called on the main application thread");
    }

    @a
    public static void g(@m0 String str) {
        if (!g0.a()) {
            throw new IllegalStateException(str);
        }
    }

    @a
    @EnsuresNonNull({"#1"})
    @m0
    public static String h(@o0 String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @a
    @EnsuresNonNull({"#1"})
    @m0
    public static String i(@o0 String str, @m0 Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @a
    public static void j() {
        k("Must not be called on the main application thread");
    }

    @a
    public static void k(@m0 String str) {
        if (g0.a()) {
            throw new IllegalStateException(str);
        }
    }

    @a
    @EnsuresNonNull({"#1"})
    @m0
    public static <T> T l(@o0 T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("null reference");
    }

    @a
    @EnsuresNonNull({"#1"})
    @m0
    public static <T> T m(@m0 T t10, @m0 Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @a
    public static int n(int i10) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @a
    public static int o(int i10, @m0 Object obj) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @a
    public static long p(long j10) {
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @a
    public static long q(long j10, @m0 Object obj) {
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @a
    public static void r(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @a
    public static void s(boolean z10, @m0 Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @a
    public static void t(boolean z10, @m0 String str, @m0 Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
