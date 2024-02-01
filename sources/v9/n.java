package v9;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import d.b1;
import d.f;
import d.m0;
import d.o0;
import i9.a;

public final class n extends b {

    /* renamed from: g  reason: collision with root package name */
    public int f23513g;

    /* renamed from: h  reason: collision with root package name */
    public int f23514h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f23515i;

    public n(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.linearProgressIndicatorStyle);
    }

    public n(@m0 Context context, @o0 AttributeSet attributeSet, @f int i10) {
        this(context, attributeSet, i10, LinearProgressIndicator.f17300p0);
    }

    public n(@m0 Context context, @o0 AttributeSet attributeSet, @f int i10, @b1 int i11) {
        super(context, attributeSet, i10, i11);
        boolean z10 = false;
        TypedArray j10 = com.google.android.material.internal.n.j(context, attributeSet, a.o.LinearProgressIndicator, a.c.linearProgressIndicatorStyle, LinearProgressIndicator.f17300p0, new int[0]);
        this.f23513g = j10.getInt(a.o.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.f23514h = j10.getInt(a.o.LinearProgressIndicator_indicatorDirectionLinear, 0);
        j10.recycle();
        e();
        this.f23515i = this.f23514h == 1 ? true : z10;
    }

    public void e() {
        if (this.f23513g != 0) {
            return;
        }
        if (this.f23429b > 0) {
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        } else if (this.f23430c.length < 3) {
            throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
        }
    }
}
