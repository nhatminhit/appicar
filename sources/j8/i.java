package j8;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import d.m0;
import d.o0;
import e8.a;
import java.util.concurrent.Executor;
import w8.d0;

@a
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static int f9768a = 4225;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f9769b = new Object();
    @o0

    /* renamed from: c  reason: collision with root package name */
    public static d2 f9770c = null;
    @o0
    @d0

    /* renamed from: d  reason: collision with root package name */
    public static HandlerThread f9771d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f9772e = false;

    @a
    public static int c() {
        return f9768a;
    }

    @a
    @m0
    public static i d(@m0 Context context) {
        synchronized (f9769b) {
            if (f9770c == null) {
                f9770c = new d2(context.getApplicationContext(), f9772e ? e().getLooper() : context.getMainLooper());
            }
        }
        return f9770c;
    }

    @a
    @m0
    public static HandlerThread e() {
        synchronized (f9769b) {
            HandlerThread handlerThread = f9771d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f9771d = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f9771d;
            return handlerThread3;
        }
    }

    @a
    public static void f() {
        synchronized (f9769b) {
            d2 d2Var = f9770c;
            if (d2Var != null && !f9772e) {
                d2Var.q(e().getLooper());
            }
            f9772e = true;
        }
    }

    @a
    public boolean a(@m0 ComponentName componentName, @m0 ServiceConnection serviceConnection, @m0 String str) {
        return k(new y1(componentName, c()), serviceConnection, str, (Executor) null);
    }

    @a
    public boolean b(@m0 String str, @m0 ServiceConnection serviceConnection, @m0 String str2) {
        return k(new y1(str, c(), false), serviceConnection, str2, (Executor) null);
    }

    @a
    public void g(@m0 ComponentName componentName, @m0 ServiceConnection serviceConnection, @m0 String str) {
        i(new y1(componentName, c()), serviceConnection, str);
    }

    @a
    public void h(@m0 String str, @m0 ServiceConnection serviceConnection, @m0 String str2) {
        i(new y1(str, c(), false), serviceConnection, str2);
    }

    public abstract void i(y1 y1Var, ServiceConnection serviceConnection, String str);

    public final void j(@m0 String str, @m0 String str2, int i10, @m0 ServiceConnection serviceConnection, @m0 String str3, boolean z10) {
        i(new y1(str, str2, i10, z10), serviceConnection, str3);
    }

    public abstract boolean k(y1 y1Var, ServiceConnection serviceConnection, String str, @o0 Executor executor);
}
