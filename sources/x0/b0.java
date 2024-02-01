package x0;

import android.os.Build;
import android.os.Trace;
import d.m0;
import java.lang.reflect.Method;

@Deprecated
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14993a = "TraceCompat";

    /* renamed from: b  reason: collision with root package name */
    public static long f14994b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f14995c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f14996d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f14997e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f14998f;

    static {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f14994b = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                f14995c = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                f14996d = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                f14997e = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                f14998f = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception unused) {
            }
        }
    }

    public static void a(@m0 String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.beginAsyncSection(str, i10);
            return;
        }
        try {
            f14996d.invoke((Object) null, new Object[]{Long.valueOf(f14994b), str, Integer.valueOf(i10)});
        } catch (Exception unused) {
        }
    }

    public static void b(@m0 String str) {
        Trace.beginSection(str);
    }

    public static void c(@m0 String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.endAsyncSection(str, i10);
            return;
        }
        try {
            f14997e.invoke((Object) null, new Object[]{Long.valueOf(f14994b), str, Integer.valueOf(i10)});
        } catch (Exception unused) {
        }
    }

    public static void d() {
        Trace.endSection();
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Trace.isEnabled();
        }
        try {
            return ((Boolean) f14995c.invoke((Object) null, new Object[]{Long.valueOf(f14994b)})).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void f(@m0 String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, (long) i10);
            return;
        }
        try {
            f14998f.invoke((Object) null, new Object[]{Long.valueOf(f14994b), str, Integer.valueOf(i10)});
        } catch (Exception unused) {
        }
    }
}
