package pl.droidsonroids.gif;

import android.annotation.SuppressLint;
import android.content.Context;
import d.m0;
import ph.e;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public static final String f22155a = "pl_droidsonroids_gif";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    public static Context f22156b;

    public static Context a() {
        if (f22156b == null) {
            try {
                f22156b = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception e10) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e10);
            }
        }
        return f22156b;
    }

    public static void b(@m0 Context context) {
        f22156b = context.getApplicationContext();
    }

    public static void c() {
        try {
            System.loadLibrary(f22155a);
        } catch (UnsatisfiedLinkError unused) {
            e.b(a(), f22155a);
        }
    }
}
