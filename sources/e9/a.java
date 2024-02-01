package e9;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import d.m0;
import d.o0;
import d.z;
import d8.f;
import d8.g;
import d8.h;
import d8.j;
import j8.s;
import java.lang.reflect.Method;

public class a {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public static final String f6983a = "GmsCore_OpenSSL";

    /* renamed from: b  reason: collision with root package name */
    public static final f f6984b = f.i();

    /* renamed from: c  reason: collision with root package name */
    public static final Object f6985c = new Object();
    @z("ProviderInstaller.lock")

    /* renamed from: d  reason: collision with root package name */
    public static Method f6986d = null;
    @z("ProviderInstaller.lock")

    /* renamed from: e  reason: collision with root package name */
    public static Method f6987e = null;

    /* renamed from: e9.a$a  reason: collision with other inner class name */
    public interface C0114a {
        void a();

        void b(int i10, @o0 Intent intent);
    }

    public static void a(@m0 Context context) throws h, g {
        Context context2;
        s.m(context, "Context must not be null");
        f6984b.p(context, 11925000);
        synchronized (f6985c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.e(context, DynamiteModule.f5815j, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.a e10) {
                "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage()));
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context i10 = j.i(context);
                if (i10 != null) {
                    try {
                        if (f6987e == null) {
                            Class cls = Long.TYPE;
                            f6987e = d(i10, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                        }
                        f6987e.invoke((Object) null, new Object[]{context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2)});
                    } catch (Exception e11) {
                        "Failed to report request stats: ".concat(String.valueOf(e11.getMessage()));
                    }
                }
                if (i10 != null) {
                    e(i10, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                }
                throw new g(8);
            }
            e(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
        }
    }

    public static void b(@m0 Context context, @m0 C0114a aVar) {
        s.m(context, "Context must not be null");
        s.m(aVar, "Listener must not be null");
        s.g("Must be called on the UI thread");
        new b(context, aVar).execute(new Void[0]);
    }

    public static Method d(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    @z("ProviderInstaller.lock")
    public static void e(Context context, Context context2, String str) throws g {
        try {
            if (f6986d == null) {
                f6986d = d(context, str, "insertProvider", new Class[]{Context.class});
            }
            f6986d.invoke((Object) null, new Object[]{context});
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.getMessage() : cause.getMessage()));
            }
            throw new g(8);
        }
    }
}
