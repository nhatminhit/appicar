package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import d.f;
import d.m0;
import d.o0;
import d.x0;
import f1.w1;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import v9.i;
import v9.j;
import v9.l;
import v9.m;
import v9.n;

public final class LinearProgressIndicator extends BaseProgressIndicator<n> {

    /* renamed from: p0  reason: collision with root package name */
    public static final int f17300p0 = a.n.Widget_MaterialComponents_LinearProgressIndicator;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f17301q0 = 0;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f17302r0 = 1;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f17303s0 = 0;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f17304t0 = 1;

    /* renamed from: u0  reason: collision with root package name */
    public static final int f17305u0 = 2;

    /* renamed from: v0  reason: collision with root package name */
    public static final int f17306v0 = 3;

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public LinearProgressIndicator(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public LinearProgressIndicator(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@m0 Context context, @o0 AttributeSet attributeSet, @f int i10) {
        super(context, attributeSet, i10, f17300p0);
        u();
    }

    public int getIndeterminateAnimationType() {
        return ((n) this.O).f23513g;
    }

    public int getIndicatorDirection() {
        return ((n) this.O).f23514h;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S s10 = this.O;
        n nVar = (n) s10;
        boolean z11 = true;
        if (!(((n) s10).f23514h == 1 || ((w1.X(this) == 1 && ((n) this.O).f23514h == 2) || (w1.X(this) == 0 && ((n) this.O).f23514h == 3)))) {
            z11 = false;
        }
        nVar.f23515i = z11;
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingLeft = i10 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i11 - (getPaddingTop() + getPaddingBottom());
        j indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        v9.f progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    public void p(int i10, boolean z10) {
        S s10 = this.O;
        if (s10 == null || ((n) s10).f23513g != 0 || !isIndeterminate()) {
            super.p(i10, z10);
        }
    }

    public void setIndeterminateAnimationType(int i10) {
        j jVar;
        i iVar;
        if (((n) this.O).f23513g != i10) {
            if (!s() || !isIndeterminate()) {
                S s10 = this.O;
                ((n) s10).f23513g = i10;
                ((n) s10).e();
                if (i10 == 0) {
                    jVar = getIndeterminateDrawable();
                    iVar = new l((n) this.O);
                } else {
                    jVar = getIndeterminateDrawable();
                    iVar = new m(getContext(), (n) this.O);
                }
                jVar.A(iVar);
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
    }

    public void setIndicatorColor(@m0 int... iArr) {
        super.setIndicatorColor(iArr);
        ((n) this.O).e();
    }

    public void setIndicatorDirection(int i10) {
        S s10 = this.O;
        ((n) s10).f23514h = i10;
        n nVar = (n) s10;
        boolean z10 = true;
        if (!(i10 == 1 || ((w1.X(this) == 1 && ((n) this.O).f23514h == 2) || (w1.X(this) == 0 && i10 == 3)))) {
            z10 = false;
        }
        nVar.f23515i = z10;
        invalidate();
    }

    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((n) this.O).e();
        invalidate();
    }

    /* renamed from: t */
    public n i(@m0 Context context, @m0 AttributeSet attributeSet) {
        return new n(context, attributeSet);
    }

    public final void u() {
        setIndeterminateDrawable(j.x(getContext(), (n) this.O));
        setProgressDrawable(v9.f.z(getContext(), (n) this.O));
    }
}
