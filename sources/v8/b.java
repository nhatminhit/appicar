package v8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import d.m0;
import e8.a;
import j8.e2;
import j8.s;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import w8.d0;
import w8.v;
import y8.e;

@a
public class b {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f14213b = new Object();
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public static volatile b f14214c;
    @d0
    @m0

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap f14215a = new ConcurrentHashMap();

    @a
    @m0
    public static b b() {
        if (f14214c == null) {
            synchronized (f14213b) {
                if (f14214c == null) {
                    f14214c = new b();
                }
            }
        }
        b bVar = f14214c;
        s.l(bVar);
        return bVar;
    }

    public static void f(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public static boolean h(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof e2);
    }

    public static final boolean i(Context context, Intent intent, ServiceConnection serviceConnection, int i10, @Nullable Executor executor) {
        return (!v.p() || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    @a
    public boolean a(@m0 Context context, @m0 Intent intent, @m0 ServiceConnection serviceConnection, int i10) {
        return g(context, context.getClass().getName(), intent, serviceConnection, i10, true, (Executor) null);
    }

    @a
    public void c(@m0 Context context, @m0 ServiceConnection serviceConnection) {
        if (!h(serviceConnection) || !this.f14215a.containsKey(serviceConnection)) {
            f(context, serviceConnection);
            return;
        }
        try {
            f(context, (ServiceConnection) this.f14215a.get(serviceConnection));
        } finally {
            this.f14215a.remove(serviceConnection);
        }
    }

    @a
    public void d(@m0 Context context, @m0 ServiceConnection serviceConnection) {
        try {
            c(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean e(@m0 Context context, @m0 String str, @m0 Intent intent, @m0 ServiceConnection serviceConnection, int i10, @Nullable Executor executor) {
        return g(context, str, intent, serviceConnection, i10, true, executor);
    }

    public final boolean g(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((e.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!h(serviceConnection)) {
            return i(context, intent, serviceConnection, i10, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f14215a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()});
        }
        try {
            boolean i11 = i(context, intent, serviceConnection, i10, executor);
            if (i11) {
                return i11;
            }
            return false;
        } finally {
            this.f14215a.remove(serviceConnection, serviceConnection);
        }
    }
}
