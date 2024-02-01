package g3;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import d.m0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static Method f7666a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f7667b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f7668c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(@m0 Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            if (z10) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        } else if (i10 != 28) {
            if (!f7668c) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f7666a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    f7667b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f7668c = true;
            }
            if (z10) {
                try {
                    Method method2 = f7666a;
                    if (method2 != null) {
                        method2.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException(e10.getCause());
                }
            }
            if (!z10 && (method = f7667b) != null) {
                method.invoke(canvas, new Object[0]);
            }
        } else {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
    }
}
