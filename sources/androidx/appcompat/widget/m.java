package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import d.o0;
import f.a;
import f1.w1;
import o0.d;

public class m extends j {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f1354d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1355e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1356f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1357g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1358h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1359i = false;

    public m(SeekBar seekBar) {
        super(seekBar);
        this.f1354d = seekBar;
    }

    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1354d.getContext();
        int[] iArr = a.n.AppCompatSeekBar;
        w0 G = w0.G(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1354d;
        w1.x1(seekBar, seekBar.getContext(), iArr, attributeSet, G.B(), i10, 0);
        Drawable i11 = G.i(a.n.AppCompatSeekBar_android_thumb);
        if (i11 != null) {
            this.f1354d.setThumb(i11);
        }
        m(G.h(a.n.AppCompatSeekBar_tickMark));
        int i12 = a.n.AppCompatSeekBar_tickMarkTintMode;
        if (G.C(i12)) {
            this.f1357g = b0.e(G.o(i12, -1), this.f1357g);
            this.f1359i = true;
        }
        int i13 = a.n.AppCompatSeekBar_tickMarkTint;
        if (G.C(i13)) {
            this.f1356f = G.d(i13);
            this.f1358h = true;
        }
        G.I();
        f();
    }

    public final void f() {
        Drawable drawable = this.f1355e;
        if (drawable == null) {
            return;
        }
        if (this.f1358h || this.f1359i) {
            Drawable r10 = d.r(drawable.mutate());
            this.f1355e = r10;
            if (this.f1358h) {
                d.o(r10, this.f1356f);
            }
            if (this.f1359i) {
                d.p(this.f1355e, this.f1357g);
            }
            if (this.f1355e.isStateful()) {
                this.f1355e.setState(this.f1354d.getDrawableState());
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f1355e != null) {
            int max = this.f1354d.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1355e.getIntrinsicWidth();
                int intrinsicHeight = this.f1355e.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f1355e.setBounds(-i11, -i10, i11, i10);
                float width = ((float) ((this.f1354d.getWidth() - this.f1354d.getPaddingLeft()) - this.f1354d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1354d.getPaddingLeft(), (float) (this.f1354d.getHeight() / 2));
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1355e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f1355e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1354d.getDrawableState())) {
            this.f1354d.invalidateDrawable(drawable);
        }
    }

    @o0
    public Drawable i() {
        return this.f1355e;
    }

    @o0
    public ColorStateList j() {
        return this.f1356f;
    }

    @o0
    public PorterDuff.Mode k() {
        return this.f1357g;
    }

    public void l() {
        Drawable drawable = this.f1355e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void m(@o0 Drawable drawable) {
        Drawable drawable2 = this.f1355e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1355e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1354d);
            d.m(drawable, w1.X(this.f1354d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1354d.getDrawableState());
            }
            f();
        }
        this.f1354d.invalidate();
    }

    public void n(@o0 ColorStateList colorStateList) {
        this.f1356f = colorStateList;
        this.f1358h = true;
        f();
    }

    public void o(@o0 PorterDuff.Mode mode) {
        this.f1357g = mode;
        this.f1359i = true;
        f();
    }
}
