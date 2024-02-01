package x0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import d.t0;
import java.lang.reflect.Method;

public final class v {

    @t0(16)
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Object f15020a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public static Method f15021b;

        /* renamed from: c  reason: collision with root package name */
        public static boolean f15022c;

        @SuppressLint({"PrivateApi"})
        public static boolean a(int i10) {
            try {
                synchronized (f15020a) {
                    if (!f15022c) {
                        f15022c = true;
                        f15021b = Class.forName("android.os.UserId").getDeclaredMethod("isApp", new Class[]{Integer.TYPE});
                    }
                }
                Method method = f15021b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke((Object) null, new Object[]{Integer.valueOf(i10)});
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return true;
        }
    }

    @t0(17)
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final Object f15023a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public static Method f15024b;

        /* renamed from: c  reason: collision with root package name */
        public static boolean f15025c;

        @SuppressLint({"DiscouragedPrivateApi"})
        public static boolean a(int i10) {
            try {
                synchronized (f15023a) {
                    if (!f15025c) {
                        f15025c = true;
                        f15024b = UserHandle.class.getDeclaredMethod("isApp", new Class[]{Integer.TYPE});
                    }
                }
                Method method = f15024b;
                if (method != null) {
                    if (((Boolean) method.invoke((Object) null, new Object[]{Integer.valueOf(i10)})) == null) {
                        throw new NullPointerException();
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return true;
        }
    }

    @t0(24)
    public static class c {
        public static boolean a(int i10) {
            return Process.isApplicationUid(i10);
        }
    }

    public static boolean a(int i10) {
        return Build.VERSION.SDK_INT >= 24 ? c.a(i10) : b.a(i10);
    }
}
