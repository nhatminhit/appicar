package g3;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import d.m0;
import d.o0;
import f1.w1;

public class e1 {

    /* renamed from: a  reason: collision with root package name */
    public static final r1 f7662a = (Build.VERSION.SDK_INT >= 29 ? new q1() : new p1());

    /* renamed from: b  reason: collision with root package name */
    public static final String f7663b = "ViewUtils";

    /* renamed from: c  reason: collision with root package name */
    public static final Property<View, Float> f7664c = new a(Float.class, "translationAlpha");

    /* renamed from: d  reason: collision with root package name */
    public static final Property<View, Rect> f7665d = new b(Rect.class, "clipBounds");

    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(e1.c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            e1.h(view, f10.floatValue());
        }
    }

    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return w1.N(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            w1.K1(view, rect);
        }
    }

    public static void a(@m0 View view) {
        f7662a.a(view);
    }

    public static d1 b(@m0 View view) {
        return new c1(view);
    }

    public static float c(@m0 View view) {
        return f7662a.c(view);
    }

    public static w1 d(@m0 View view) {
        return new v1(view);
    }

    public static void e(@m0 View view) {
        f7662a.d(view);
    }

    public static void f(@m0 View view, @o0 Matrix matrix) {
        f7662a.e(view, matrix);
    }

    public static void g(@m0 View view, int i10, int i11, int i12, int i13) {
        f7662a.f(view, i10, i11, i12, i13);
    }

    public static void h(@m0 View view, float f10) {
        f7662a.g(view, f10);
    }

    public static void i(@m0 View view, int i10) {
        f7662a.h(view, i10);
    }

    public static void j(@m0 View view, @m0 Matrix matrix) {
        f7662a.i(view, matrix);
    }

    public static void k(@m0 View view, @m0 Matrix matrix) {
        f7662a.j(view, matrix);
    }
}
