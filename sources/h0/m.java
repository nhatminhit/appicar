package h0;

import android.os.Bundle;
import android.os.IBinder;
import d.m0;
import d.o0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class m {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final String f8462a = "BundleCompatBaseImpl";

        /* renamed from: b  reason: collision with root package name */
        public static Method f8463b;

        /* renamed from: c  reason: collision with root package name */
        public static boolean f8464c;

        /* renamed from: d  reason: collision with root package name */
        public static Method f8465d;

        /* renamed from: e  reason: collision with root package name */
        public static boolean f8466e;

        public static IBinder a(Bundle bundle, String str) {
            if (!f8464c) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f8463b = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f8464c = true;
            }
            Method method2 = f8463b;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f8463b = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            if (!f8466e) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f8465d = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f8466e = true;
            }
            Method method2 = f8465d;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f8465d = null;
                }
            }
        }
    }

    @o0
    public static IBinder a(@m0 Bundle bundle, @o0 String str) {
        return bundle.getBinder(str);
    }

    public static void b(@m0 Bundle bundle, @o0 String str, @o0 IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
