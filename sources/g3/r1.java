package g3;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import d.m0;
import d.o0;
import g3.d0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class r1 {

    /* renamed from: b  reason: collision with root package name */
    public static final String f7850b = "ViewUtilsBase";

    /* renamed from: c  reason: collision with root package name */
    public static Method f7851c = null;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f7852d = false;

    /* renamed from: e  reason: collision with root package name */
    public static Field f7853e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f7854f = false;

    /* renamed from: g  reason: collision with root package name */
    public static final int f7855g = 12;

    /* renamed from: a  reason: collision with root package name */
    public float[] f7856a;

    public void a(@m0 View view) {
        if (view.getVisibility() == 0) {
            view.setTag(d0.e.save_non_transition_alpha, (Object) null);
        }
    }

    @SuppressLint({"PrivateApi"})
    public final void b() {
        if (!f7852d) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f7851c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f7852d = true;
        }
    }

    public float c(@m0 View view) {
        Float f10 = (Float) view.getTag(d0.e.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f10 != null ? alpha / f10.floatValue() : alpha;
    }

    public void d(@m0 View view) {
        int i10 = d0.e.save_non_transition_alpha;
        if (view.getTag(i10) == null) {
            view.setTag(i10, Float.valueOf(view.getAlpha()));
        }
    }

    public void e(@m0 View view, @o0 Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX((float) (view.getWidth() / 2));
            view.setPivotY((float) (view.getHeight() / 2));
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f7856a;
        if (fArr == null) {
            fArr = new float[9];
            this.f7856a = fArr;
        }
        matrix.getValues(fArr);
        float f10 = fArr[3];
        float sqrt = ((float) Math.sqrt((double) (1.0f - (f10 * f10)))) * ((float) (fArr[0] < 0.0f ? -1 : 1));
        float degrees = (float) Math.toDegrees(Math.atan2((double) f10, (double) sqrt));
        float f11 = fArr[0] / sqrt;
        float f12 = fArr[4] / sqrt;
        float f13 = fArr[2];
        float f14 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f13);
        view.setTranslationY(f14);
        view.setRotation(degrees);
        view.setScaleX(f11);
        view.setScaleY(f12);
    }

    public void f(@m0 View view, int i10, int i11, int i12, int i13) {
        b();
        Method method = f7851c;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    public void g(@m0 View view, float f10) {
        Float f11 = (Float) view.getTag(d0.e.save_non_transition_alpha);
        if (f11 != null) {
            view.setAlpha(f11.floatValue() * f10);
        } else {
            view.setAlpha(f10);
        }
    }

    public void h(@m0 View view, int i10) {
        if (!f7854f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f7853e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f7854f = true;
        }
        Field field = f7853e;
        if (field != null) {
            try {
                f7853e.setInt(view, i10 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void i(@m0 View view, @m0 Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            i(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void j(@m0 View view, @m0 Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            j(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
