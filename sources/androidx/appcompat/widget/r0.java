package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import d.m0;
import d.o0;
import d.x0;
import f.a;
import n0.f0;

@x0({x0.a.O})
public class r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1422a = "ThemeUtils";

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f1423b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1424c = {-16842910};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1425d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1426e = {16843518};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1427f = {16842919};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1428g = {16842912};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f1429h = {16842913};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f1430i = {-16842919, -16842908};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f1431j = new int[0];

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f1432k = new int[1];

    public static void a(@m0 View view, @m0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a.n.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(a.n.AppCompatTheme_windowActionBar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("View ");
                sb2.append(view.getClass());
                sb2.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @m0
    public static ColorStateList b(int i10, int i11) {
        return new ColorStateList(new int[][]{f1424c, f1431j}, new int[]{i11, i10});
    }

    public static int c(@m0 Context context, int i10) {
        ColorStateList f10 = f(context, i10);
        if (f10 != null && f10.isStateful()) {
            return f10.getColorForState(f1424c, f10.getDefaultColor());
        }
        TypedValue g10 = g();
        context.getTheme().resolveAttribute(16842803, g10, true);
        return e(context, i10, g10.getFloat());
    }

    public static int d(@m0 Context context, int i10) {
        int[] iArr = f1432k;
        iArr[0] = i10;
        w0 F = w0.F(context, (AttributeSet) null, iArr);
        try {
            return F.c(0, 0);
        } finally {
            F.I();
        }
    }

    public static int e(@m0 Context context, int i10, float f10) {
        int d10 = d(context, i10);
        return f0.B(d10, Math.round(((float) Color.alpha(d10)) * f10));
    }

    @o0
    public static ColorStateList f(@m0 Context context, int i10) {
        int[] iArr = f1432k;
        iArr[0] = i10;
        w0 F = w0.F(context, (AttributeSet) null, iArr);
        try {
            return F.d(0);
        } finally {
            F.I();
        }
    }

    public static TypedValue g() {
        ThreadLocal<TypedValue> threadLocal = f1423b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
