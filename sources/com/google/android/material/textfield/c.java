package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import d.m0;
import d.o0;
import z9.j;
import z9.o;

public class c extends j {
    @m0

    /* renamed from: r0  reason: collision with root package name */
    public final Paint f17565r0;
    @m0

    /* renamed from: s0  reason: collision with root package name */
    public final RectF f17566s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f17567t0;

    public c() {
        this((o) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@o0 o oVar) {
        super(oVar == null ? new o() : oVar);
        this.f17565r0 = new Paint(1);
        V0();
        this.f17566s0 = new RectF();
    }

    public boolean O0() {
        return !this.f17566s0.isEmpty();
    }

    public final void P0(@m0 Canvas canvas) {
        if (!W0(getCallback())) {
            canvas.restoreToCount(this.f17567t0);
        }
    }

    public final void Q0(@m0 Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (W0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        S0(canvas);
    }

    public void R0() {
        T0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void S0(@m0 Canvas canvas) {
        this.f17567t0 = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
    }

    public void T0(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f17566s0;
        if (f10 != rectF.left || f11 != rectF.top || f12 != rectF.right || f13 != rectF.bottom) {
            rectF.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }

    public void U0(@m0 RectF rectF) {
        T0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void V0() {
        this.f17565r0.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f17565r0.setColor(-1);
        this.f17565r0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final boolean W0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    public void draw(@m0 Canvas canvas) {
        Q0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f17566s0, this.f17565r0);
        P0(canvas);
    }
}
