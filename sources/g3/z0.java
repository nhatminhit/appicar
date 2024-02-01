package g3;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import d.m0;
import d.t0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class z0 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f7896a = true;

    /* renamed from: b  reason: collision with root package name */
    public static Method f7897b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f7898c;

    public static int a(@m0 ViewGroup viewGroup, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i10);
        }
        if (!f7898c) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("getChildDrawingOrder", new Class[]{cls2, cls2});
                f7897b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f7898c = true;
        }
        Method method = f7897b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, new Object[]{Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i10)})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i10;
    }

    public static w0 b(@m0 ViewGroup viewGroup) {
        return new v0(viewGroup);
    }

    @t0(18)
    @SuppressLint({"NewApi"})
    public static void c(@m0 ViewGroup viewGroup, boolean z10) {
        if (f7896a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f7896a = false;
            }
        }
    }

    public static void d(@m0 ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else {
            c(viewGroup, z10);
        }
    }
}
