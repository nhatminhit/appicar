package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import d.m0;
import d.x0;
import h.c;
import java.lang.reflect.Field;
import n7.b;
import o0.d;
import o0.q;

@x0({x0.a.Q})
@SuppressLint({"RestrictedAPI"})
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1226a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1227b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final String f1228c = "DrawableUtils";

    /* renamed from: d  reason: collision with root package name */
    public static final Rect f1229d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public static Class<?> f1230e = null;

    /* renamed from: f  reason: collision with root package name */
    public static final String f1231f = "android.graphics.drawable.VectorDrawable";

    static {
        try {
            f1230e = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static boolean a(@m0 Drawable drawable) {
        Drawable drawable2;
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a10 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!a(a10)) {
                    return false;
                }
            }
            return true;
        }
        if (drawable instanceof q) {
            drawable2 = ((q) drawable).b();
        } else if (drawable instanceof c) {
            drawable2 = ((c) drawable).a();
        } else if (!(drawable instanceof ScaleDrawable)) {
            return true;
        } else {
            drawable2 = ((ScaleDrawable) drawable).getDrawable();
        }
        return a(drawable2);
    }

    public static void b(@m0 Drawable drawable) {
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1226a);
        } else {
            drawable.setState(f1227b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets a10 = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = a10.left;
            rect.right = a10.right;
            rect.top = a10.top;
            rect.bottom = a10.bottom;
            return rect;
        }
        if (f1230e != null) {
            try {
                Drawable q10 = d.q(drawable);
                Object invoke = q10.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(q10, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f1230e.getFields()) {
                        String name = field.getName();
                        char c10 = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals(b.U)) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals(b.W)) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                        }
                        if (c10 == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c10 == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c10 == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c10 == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
            }
        }
        return f1229d;
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
