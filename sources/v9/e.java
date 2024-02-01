package v9;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.n;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import d.b1;
import d.f;
import d.m0;
import d.o0;
import d.r0;
import i9.a;
import w9.c;

public final class e extends b {
    @r0

    /* renamed from: g  reason: collision with root package name */
    public int f23462g;
    @r0

    /* renamed from: h  reason: collision with root package name */
    public int f23463h;

    /* renamed from: i  reason: collision with root package name */
    public int f23464i;

    public e(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.circularProgressIndicatorStyle);
    }

    public e(@m0 Context context, @o0 AttributeSet attributeSet, @f int i10) {
        this(context, attributeSet, i10, CircularProgressIndicator.f17297p0);
    }

    public e(@m0 Context context, @o0 AttributeSet attributeSet, @f int i10, @b1 int i11) {
        super(context, attributeSet, i10, i11);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(a.f.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(a.f.mtrl_progress_circular_inset_medium);
        TypedArray j10 = n.j(context, attributeSet, a.o.CircularProgressIndicator, i10, i11, new int[0]);
        this.f23462g = c.c(context, j10, a.o.CircularProgressIndicator_indicatorSize, dimensionPixelSize);
        this.f23463h = c.c(context, j10, a.o.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.f23464i = j10.getInt(a.o.CircularProgressIndicator_indicatorDirectionCircular, 0);
        j10.recycle();
        e();
    }

    public void e() {
        if (this.f23462g < this.f23428a * 2) {
            throw new IllegalArgumentException("The indicatorSize (" + this.f23462g + " px) cannot be less than twice of the trackThickness (" + this.f23428a + " px).");
        }
    }
}
