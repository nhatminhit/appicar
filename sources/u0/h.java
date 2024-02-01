package u0;

import android.location.Location;
import d.m0;
import d.o0;
import d.t;
import d.t0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13388a = "mockLocation";
    @o0

    /* renamed from: b  reason: collision with root package name */
    public static Method f13389b;

    @t0(17)
    public static class a {
        @t
        public static long a(Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    @t0(18)
    public static class b {
        @t
        public static boolean a(Location location) {
            return location.isFromMockProvider();
        }
    }

    public static long a(@m0 Location location) {
        return TimeUnit.NANOSECONDS.toMillis(a.a(location));
    }

    public static long b(@m0 Location location) {
        return a.a(location);
    }

    public static Method c() throws NoSuchMethodException {
        if (f13389b == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", new Class[]{Boolean.TYPE});
            f13389b = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f13389b;
    }

    public static boolean d(@m0 Location location) {
        return b.a(location);
    }

    public static void e(@m0 Location location, boolean z10) {
        try {
            c().invoke(location, new Object[]{Boolean.valueOf(z10)});
        } catch (NoSuchMethodException e10) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e10);
            throw noSuchMethodError;
        } catch (IllegalAccessException e11) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e11);
            throw illegalAccessError;
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }
}
