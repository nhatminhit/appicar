package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import f1.j;
import i9.a;

@x0({x0.a.LIBRARY_GROUP})
public class ForegroundLinearLayout extends LinearLayoutCompat {
    @o0

    /* renamed from: s0  reason: collision with root package name */
    public Drawable f17146s0;

    /* renamed from: t0  reason: collision with root package name */
    public final Rect f17147t0;

    /* renamed from: u0  reason: collision with root package name */
    public final Rect f17148u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f17149v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f17150w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f17151x0;

    public ForegroundLinearLayout(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public ForegroundLinearLayout(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17147t0 = new Rect();
        this.f17148u0 = new Rect();
        this.f17149v0 = 119;
        this.f17150w0 = true;
        this.f17151x0 = false;
        TypedArray j10 = n.j(context, attributeSet, a.o.ForegroundLinearLayout, i10, 0, new int[0]);
        this.f17149v0 = j10.getInt(a.o.ForegroundLinearLayout_android_foregroundGravity, this.f17149v0);
        Drawable drawable = j10.getDrawable(a.o.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f17150w0 = j10.getBoolean(a.o.ForegroundLinearLayout_foregroundInsidePadding, true);
        j10.recycle();
    }

    public void draw(@m0 Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f17146s0;
        if (drawable != null) {
            if (this.f17151x0) {
                this.f17151x0 = false;
                Rect rect = this.f17147t0;
                Rect rect2 = this.f17148u0;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f17150w0) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f17149v0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @t0(21)
    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f17146s0;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17146s0;
        if (drawable != null && drawable.isStateful()) {
            this.f17146s0.setState(getDrawableState());
        }
    }

    @o0
    public Drawable getForeground() {
        return this.f17146s0;
    }

    public int getForegroundGravity() {
        return this.f17149v0;
    }

    @t0(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f17146s0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f17151x0 = z10 | this.f17151x0;
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f17151x0 = true;
    }

    public void setForeground(@o0 Drawable drawable) {
        Drawable drawable2 = this.f17146s0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f17146s0);
            }
            this.f17146s0 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f17149v0 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i10) {
        if (this.f17149v0 != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= j.f7185b;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f17149v0 = i10;
            if (i10 == 119 && this.f17146s0 != null) {
                this.f17146s0.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17146s0;
    }
}
