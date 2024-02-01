package g3;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.t0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@t0(21)
public class s implements q {
    public static final String P = "GhostViewApi21";
    public static Class<?> Q;
    public static boolean R;
    public static Method S;
    public static boolean T;
    public static Method U;
    public static boolean V;
    public final View O;

    public s(@m0 View view) {
        this.O = view;
    }

    public static q b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = S;
        if (method != null) {
            try {
                return new s((View) method.invoke((Object) null, new Object[]{view, viewGroup, matrix}));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
        return null;
    }

    public static void c() {
        if (!T) {
            try {
                d();
                Method declaredMethod = Q.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                S = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            T = true;
        }
    }

    public static void d() {
        if (!R) {
            try {
                Q = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException unused) {
            }
            R = true;
        }
    }

    public static void e() {
        if (!V) {
            try {
                d();
                Method declaredMethod = Q.getDeclaredMethod("removeGhost", new Class[]{View.class});
                U = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            V = true;
        }
    }

    public static void f(View view) {
        e();
        Method method = U;
        if (method != null) {
            try {
                method.invoke((Object) null, new Object[]{view});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    public void a(ViewGroup viewGroup, View view) {
    }

    public void setVisibility(int i10) {
        this.O.setVisibility(i10);
    }
}
