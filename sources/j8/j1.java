package j8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import d.o0;
import javax.annotation.concurrent.GuardedBy;
import y8.e;

public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f9775a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b  reason: collision with root package name */
    public static boolean f9776b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public static String f9777c;

    /* renamed from: d  reason: collision with root package name */
    public static int f9778d;

    public static int a(Context context) {
        c(context);
        return f9778d;
    }

    @o0
    public static String b(Context context) {
        c(context);
        return f9777c;
    }

    public static void c(Context context) {
        synchronized (f9775a) {
            if (!f9776b) {
                f9776b = true;
                try {
                    Bundle bundle = e.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f9777c = bundle.getString("com.google.app.id");
                        f9778d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
            }
        }
    }
}
