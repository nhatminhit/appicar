package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.View;
import d.x0;
import f1.w1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@x0({x0.a.Q})
public class d1 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1288a = "ViewUtils";

    /* renamed from: b  reason: collision with root package name */
    public static Method f1289b;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
            f1289b = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f1289b.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f1289b;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception unused) {
            }
        }
    }

    public static boolean b(View view) {
        return w1.X(view) == 1;
    }

    public static void c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
