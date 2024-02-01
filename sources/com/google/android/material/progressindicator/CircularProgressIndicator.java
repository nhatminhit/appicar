package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import d.f;
import d.m0;
import d.o0;
import d.r0;
import d.x0;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import v9.e;
import v9.j;

public final class CircularProgressIndicator extends BaseProgressIndicator<e> {

    /* renamed from: p0  reason: collision with root package name */
    public static final int f17297p0 = a.n.Widget_MaterialComponents_CircularProgressIndicator;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f17298q0 = 0;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f17299r0 = 1;

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public CircularProgressIndicator(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public CircularProgressIndicator(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@m0 Context context, @o0 AttributeSet attributeSet, @f int i10) {
        super(context, attributeSet, i10, f17297p0);
        u();
    }

    public int getIndicatorDirection() {
        return ((e) this.O).f23464i;
    }

    @r0
    public int getIndicatorInset() {
        return ((e) this.O).f23463h;
    }

    @r0
    public int getIndicatorSize() {
        return ((e) this.O).f23462g;
    }

    public void setIndicatorDirection(int i10) {
        ((e) this.O).f23464i = i10;
        invalidate();
    }

    public void setIndicatorInset(@r0 int i10) {
        S s10 = this.O;
        if (((e) s10).f23463h != i10) {
            ((e) s10).f23463h = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(@r0 int i10) {
        S s10 = this.O;
        if (((e) s10).f23462g != i10) {
            ((e) s10).f23462g = i10;
            ((e) s10).e();
            invalidate();
        }
    }

    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((e) this.O).e();
    }

    /* renamed from: t */
    public e i(@m0 Context context, @m0 AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    public final void u() {
        setIndeterminateDrawable(j.w(getContext(), (e) this.O));
        setProgressDrawable(v9.f.y(getContext(), (e) this.O));
    }
}
