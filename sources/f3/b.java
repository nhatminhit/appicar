package f3;

import android.annotation.SuppressLint;
import android.os.Trace;
import d.m0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7322a = "Trace";

    /* renamed from: b  reason: collision with root package name */
    public static long f7323b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f7324c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f7325d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f7326e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f7327f;

    @SuppressLint({"NewApi"})
    public static void a(@m0 String str, int i10) {
        try {
            if (f7325d == null) {
                d.a(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i10);
    }

    public static void b(@m0 String str, int i10) {
        try {
            if (f7325d == null) {
                f7325d = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f7325d.invoke((Object) null, new Object[]{Long.valueOf(f7323b), str, Integer.valueOf(i10)});
        } catch (Exception e10) {
            g("asyncTraceBegin", e10);
        }
    }

    public static void c(@m0 String str) {
        c.a(str);
    }

    @SuppressLint({"NewApi"})
    public static void d(@m0 String str, int i10) {
        try {
            if (f7326e == null) {
                d.b(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i10);
    }

    public static void e(@m0 String str, int i10) {
        try {
            if (f7326e == null) {
                f7326e = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f7326e.invoke((Object) null, new Object[]{Long.valueOf(f7323b), str, Integer.valueOf(i10)});
        } catch (Exception e10) {
            g("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        c.b();
    }

    public static void g(@m0 String str, @m0 Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to call ");
        sb2.append(str);
        sb2.append(" via reflection");
    }

    @SuppressLint({"NewApi"})
    public static boolean h() {
        try {
            if (f7324c == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    public static boolean i() {
        try {
            if (f7324c == null) {
                f7323b = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f7324c = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f7324c.invoke((Object) null, new Object[]{Long.valueOf(f7323b)})).booleanValue();
        } catch (Exception e10) {
            g("isTagEnabled", e10);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static void j(@m0 String str, int i10) {
        try {
            if (f7327f == null) {
                d.c(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        k(str, i10);
    }

    public static void k(@m0 String str, int i10) {
        try {
            if (f7327f == null) {
                f7327f = Trace.class.getMethod("traceCounter", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f7327f.invoke((Object) null, new Object[]{Long.valueOf(f7323b), str, Integer.valueOf(i10)});
        } catch (Exception e10) {
            g("traceCounter", e10);
        }
    }
}
