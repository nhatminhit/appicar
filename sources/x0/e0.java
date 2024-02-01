package x0;

import android.os.Build;
import android.os.UserHandle;
import d.m0;
import d.o0;
import d.t0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@t0(17)
public class e0 {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public static Method f15005a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public static Constructor<UserHandle> f15006b;

    @t0(24)
    public static class a {
        private a() {
        }

        @m0
        public static UserHandle a(int i10) {
            return UserHandle.getUserHandleForUid(i10);
        }
    }

    public static Method a() throws NoSuchMethodException {
        if (f15005a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", new Class[]{Integer.TYPE});
            f15005a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f15005a;
    }

    public static Constructor<UserHandle> b() throws NoSuchMethodException {
        if (f15006b == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(new Class[]{Integer.TYPE});
            f15006b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f15006b;
    }

    @m0
    public static UserHandle c(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(i10);
        }
        try {
            Method a10 = a();
            Object[] objArr = {Integer.valueOf(i10)};
            return b().newInstance(new Object[]{(Integer) a10.invoke((Object) null, objArr)});
        } catch (NoSuchMethodException e10) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e10);
            throw noSuchMethodError;
        } catch (IllegalAccessException e11) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e11);
            throw illegalAccessError;
        } catch (InstantiationException e12) {
            InstantiationError instantiationError = new InstantiationError();
            instantiationError.initCause(e12);
            throw instantiationError;
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }
}
