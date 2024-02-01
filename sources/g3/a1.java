package g3;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.view.ViewGroup;
import d.m0;
import g3.d0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class a1 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7640a = "ViewGroupUtilsApi14";

    /* renamed from: b  reason: collision with root package name */
    public static final int f7641b = 4;

    /* renamed from: c  reason: collision with root package name */
    public static LayoutTransition f7642c;

    /* renamed from: d  reason: collision with root package name */
    public static Field f7643d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f7644e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f7645f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f7646g;

    public static class a extends LayoutTransition {
        public boolean isChangingLayout() {
            return true;
        }
    }

    public static void a(LayoutTransition layoutTransition) {
        if (!f7646g) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f7645f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f7646g = true;
        }
        Method method = f7645f;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    public static void b(@m0 ViewGroup viewGroup, boolean z10) {
        boolean z11 = false;
        if (f7642c == null) {
            a aVar = new a();
            f7642c = aVar;
            aVar.setAnimator(2, (Animator) null);
            f7642c.setAnimator(0, (Animator) null);
            f7642c.setAnimator(1, (Animator) null);
            f7642c.setAnimator(3, (Animator) null);
            f7642c.setAnimator(4, (Animator) null);
        }
        if (z10) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    a(layoutTransition);
                }
                if (layoutTransition != f7642c) {
                    viewGroup.setTag(d0.e.transition_layout_save, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f7642c);
            return;
        }
        viewGroup.setLayoutTransition((LayoutTransition) null);
        if (!f7644e) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f7643d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f7644e = true;
        }
        Field field = f7643d;
        if (field != null) {
            try {
                boolean z12 = field.getBoolean(viewGroup);
                if (z12) {
                    try {
                        f7643d.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                    }
                }
                z11 = z12;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z11) {
            viewGroup.requestLayout();
        }
        int i10 = d0.e.transition_layout_save;
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(i10);
        if (layoutTransition2 != null) {
            viewGroup.setTag(i10, (Object) null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
