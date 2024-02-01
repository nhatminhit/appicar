package v9;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.n;
import d.b1;
import d.f;
import d.l;
import d.m0;
import d.o0;
import d.r0;
import i9.a;
import w9.c;

public abstract class b {
    @r0

    /* renamed from: a  reason: collision with root package name */
    public int f23428a;
    @r0

    /* renamed from: b  reason: collision with root package name */
    public int f23429b;
    @m0

    /* renamed from: c  reason: collision with root package name */
    public int[] f23430c = new int[0];
    @l

    /* renamed from: d  reason: collision with root package name */
    public int f23431d;

    /* renamed from: e  reason: collision with root package name */
    public int f23432e;

    /* renamed from: f  reason: collision with root package name */
    public int f23433f;

    public b(@m0 Context context, @o0 AttributeSet attributeSet, @f int i10, @b1 int i11) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(a.f.mtrl_progress_track_thickness);
        TypedArray j10 = n.j(context, attributeSet, a.o.BaseProgressIndicator, i10, i11, new int[0]);
        this.f23428a = c.c(context, j10, a.o.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f23429b = Math.min(c.c(context, j10, a.o.BaseProgressIndicator_trackCornerRadius, 0), this.f23428a / 2);
        this.f23432e = j10.getInt(a.o.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f23433f = j10.getInt(a.o.BaseProgressIndicator_hideAnimationBehavior, 0);
        c(context, j10);
        d(context, j10);
        j10.recycle();
    }

    public boolean a() {
        return this.f23433f != 0;
    }

    public boolean b() {
        return this.f23432e != 0;
    }

    public final void c(@m0 Context context, @m0 TypedArray typedArray) {
        int i10 = a.o.BaseProgressIndicator_indicatorColor;
        if (!typedArray.hasValue(i10)) {
            this.f23430c = new int[]{o9.a.b(context, a.c.colorPrimary, -1)};
        } else if (typedArray.peekValue(i10).type != 1) {
            this.f23430c = new int[]{typedArray.getColor(i10, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i10, -1));
            this.f23430c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
    }

    public final void d(@m0 Context context, @m0 TypedArray typedArray) {
        int a10;
        int i10 = a.o.BaseProgressIndicator_trackColor;
        if (typedArray.hasValue(i10)) {
            a10 = typedArray.getColor(i10, -1);
        } else {
            this.f23431d = this.f23430c[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f10 = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            a10 = o9.a.a(this.f23431d, (int) (f10 * 255.0f));
        }
        this.f23431d = a10;
    }

    public abstract void e();
}
